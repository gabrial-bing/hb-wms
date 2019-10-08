package com.hb.upms.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.hb.upms.common.PageTable;
import com.hb.upms.common.RestResult;
import com.hb.upms.constant.ResultCode;
import com.hb.upms.controller.dto.PmsPurchaseApplicationToCompleteDTO;
import com.hb.upms.controller.dto.WmsStockInDTO;
import com.hb.upms.mapper.WmsStoresListDOMapper;
import com.hb.upms.model.*;
import com.hb.upms.service.impl.PmsPurchaseApplicationToCompleteDOService;
import com.hb.upms.service.impl.WmsStockInDOService;
import com.hb.upms.service.impl.WmsStoresListDOService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


@Controller
@RequestMapping("/pmsPurchases")    //TODO：用于与前台交互
public class PmsPurchaseApplicationToCompleteController {

    @Autowired
    private PmsPurchaseApplicationToCompleteDOService pmsPurchaseApplicationToCompleteDOService;
    @Autowired
    private WmsStockInDOService wmsStockInDOService;  //G:W
    @Autowired
    private WmsStoresListDOService wmsStoresListDOService;

    @GetMapping(value = "/page/update")     //G：向前台显示界面
    public String update(Model model,
                            Integer id) {
        PmsPurchaseApplicationToCompleteDTO pmsPurchaseApplicationToCompleteDTO;
        if (id != null && id != 0) {
            pmsPurchaseApplicationToCompleteDTO = pmsPurchaseApplicationToCompleteDOService.selectByPrimaryKey(id);
            model.addAttribute("pms", pmsPurchaseApplicationToCompleteDTO);//将model中的对象赋给s:"",以便于前端应用"".···
        }
        // G：仓库管理页面
        return "pmsPurchase/update";     //G：编辑的时候可以将参数直接带到编辑页面
    }

    @PostMapping("/update")      //G：更新后台数据库数据
    @ResponseBody
    public RestResult update(WmsStockInDTO wmsStockInDTO) throws ParseException {                 //G：具体更改注释见录音记录
        /*
        * G：更新1：采购单状态字段*/
        PmsPurchaseApplicationToCompleteDO pmsPurchaseApplicationToCompleteDO= new PmsPurchaseApplicationToCompleteDO();
        pmsPurchaseApplicationToCompleteDO.setId(wmsStockInDTO.getId());
        pmsPurchaseApplicationToCompleteDO.setStatus(wmsStockInDTO.getStatus());

        int success;
        success = pmsPurchaseApplicationToCompleteDOService.updateByPrimaryKeySelective(pmsPurchaseApplicationToCompleteDO);

        /*
        G：更新:2:入库单表
        */
        WmsStockInDO wmsStockInDO = new WmsStockInDO();
        if(wmsStockInDTO.getStatus() == 5) {      //G：添加判断条件，状态位为5，即已入库时，则将该条记录写入wms_stock_in数据表内
            BeanUtils.copyProperties(wmsStockInDTO, wmsStockInDO);
            wmsStockInDO.setMaterialId(wmsStockInDTO.getRawMatrialId());
            wmsStockInDO.setInStorageNum(wmsStockInDTO.getNumber());
            wmsStockInDO.setInStorageDate(new SimpleDateFormat("yyyy-MM-dd").parse(wmsStockInDTO.getInStorageDate()));
            //wmsStockInDO.setStockInId("12345");
            int success1;
            success1 = wmsStockInDOService.insertSelective(wmsStockInDO);
        }

        /*
        * G：更新3：库存表数据
        * */

        WmsStoresListDO wmsStoresListDO = new WmsStoresListDO();
        //BeanUtils.copyProperties(wmsStockInDTO,wmsStoresListDO);

        /* G：查询物料ID，以便于改变相同物料ID值数量*/
        wmsStoresListDO = wmsStoresListDOService.selectByMaterialKey(wmsStockInDTO.getRawMatrialId());
        /*G：为什么这里需要建立两个对象？？？？？？*/
        if (wmsStoresListDO == null) {
                WmsStoresListDO wmsStoresListDO1 = new WmsStoresListDO();
                wmsStoresListDO1.setMaterialId(wmsStockInDTO.getRawMatrialId());
                wmsStoresListDO1.setStorageLocation(wmsStockInDTO.getStorageLocation());
                wmsStoresListDO1.setInventoryNum(wmsStockInDTO.getNumber());
                wmsStoresListDO1.setNote(wmsStockInDTO.getNote());
            int success2;
            success2 = wmsStoresListDOService.insertSelective(wmsStoresListDO1);

        } else {
                wmsStoresListDO.setInventoryNum(wmsStockInDTO.getNumber() + wmsStoresListDO.getInventoryNum());
            int success3;
            success3 = wmsStoresListDOService.updateByPrimaryKeySelective(wmsStoresListDO);

        }




        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }

    }

    @GetMapping(value = "/page/add")
    public String add() {
        return "pmsPurchase/add";
    }

    @PostMapping("/add")
    @ResponseBody
    public RestResult add(PmsPurchaseApplicationToCompleteDO pmsPurchaseApplicationToCompleteDO) {
        int id = pmsPurchaseApplicationToCompleteDOService.insertSelective(pmsPurchaseApplicationToCompleteDO);
        if (id != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    /**
     * 查看权限管理页面，并可进行搜索
     * 注意：必须带上systemId参数（绑定在PmsPurchaseApplicationToCompleteDTO中）
     * @param pmsPurchaseApplicationToCompleteDTO
     * @return
     */
    @GetMapping(value = "/page/list")   //②进入此处
    public String list(Model model,
                          PmsPurchaseApplicationToCompleteDTO pmsPurchaseApplicationToCompleteDTO) {
        // 仓库管理页面
        return "pmsPurchase/list"; //G：在函数中做一些处理，然后再返回到/WEB-INF/pmsPurchase/list.jsp页面
    }


    /**
     * 分页查询PmsPurchaseApplicationToComplete列表
     * @param pageNum
     * @param pageSize
     * @param pmsPurchaseApplicationToCompleteDTO
     * @return
     */
    //G：加page表示返回或是访问页面，不加page返回json数据的url（个人定义的规范）
    @GetMapping(value = "/list")
    @ResponseBody  //G：转化为json数据
    public RestResult list(
                            Integer pageNum,
                            Integer pageSize,
                            PmsPurchaseApplicationToCompleteDTO pmsPurchaseApplicationToCompleteDTO) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 5;
        }
        // 在application.yml里配置了分页参数合理化，所以不需要处理start的检查
        PageTable pageTable = pmsPurchaseApplicationToCompleteDOService.selectByExamplewithPage(
                pageNum,
                pageSize,
                buildPageExample(pmsPurchaseApplicationToCompleteDTO));

        if (pageTable != null) {
            return RestResult.success(pageTable);
        } else {
            return RestResult.failed(ResultCode.PAGE_LIST_ERROR);
        }

    }

    private PmsPurchaseApplicationToCompleteDOExample buildPageExample(PmsPurchaseApplicationToCompleteDTO pmsPurchaseApplicationToCompleteDTO) {
        if (pmsPurchaseApplicationToCompleteDTO == null) {
            return null;  //G：转到149行
        }

        Integer rawMatrialId = pmsPurchaseApplicationToCompleteDTO.getRawMatrialId();  //G：搜索所需字段
        Integer contactId = pmsPurchaseApplicationToCompleteDTO.getContactId();   //G：搜索所需字段

        PmsPurchaseApplicationToCompleteDOExample example = new PmsPurchaseApplicationToCompleteDOExample();
        PmsPurchaseApplicationToCompleteDOExample.Criteria criteria = example.createCriteria();

        //下面动态拼接sql语句的查询条件，与DOMapper的263行进行数据交互
        //  G：where.....=....
        if ( rawMatrialId != null) {
            criteria.andRawMatrialIdEqualTo(rawMatrialId); // G：and type = type
        }
        //
        if (contactId != null) {
            criteria.andContactIdEqualTo(contactId );// G：and name like '%name%'
        }

        // 默认按id升序排
        example.setOrderByClause("id asc");
        return example;
    }


    /**
     * 删除PmsPurchaseApplicationToComplete信息, 通过id
     * @param id
     */
    @PostMapping(value = "/delete", params = {"id"})
    @ResponseBody
    public RestResult delete(Integer id) {
        int success = 0;
        if (id != null && id != 0) {
            success = pmsPurchaseApplicationToCompleteDOService.deleteByPrimaryKey(id);
        }

        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.DELETE_ERROR);
        }
    }


}
