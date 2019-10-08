package com.hb.upms.controller;

import com.hb.upms.common.PageTable;
import com.hb.upms.common.RestResult;
import com.hb.upms.constant.ResultCode;
import com.hb.upms.controller.dto.WmsStockInDTO;
import com.hb.upms.model.WmsStockInDO;
import com.hb.upms.model.WmsStockInDOExample;
import com.hb.upms.service.impl.WmsStockInDOService;
import org.apache.commons.lang.StringUtils;
import org.apache.taglibs.standard.lang.jstl.NullLiteral;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequestMapping("/stockIns")
public class WmsStockInController {

    @Autowired
    private WmsStockInDOService wmsStockInDOService;

    @GetMapping(value = "/page/update")
    public String update(Model model,
                            Integer stockInId) {
        WmsStockInDO wmsStockInDO;
        if (stockInId != null && stockInId != 0) {
            wmsStockInDO = wmsStockInDOService.selectByPrimaryKey(stockInId);
            WmsStockInDTO wmsStockInDTO = new WmsStockInDTO();
            BeanUtils.copyProperties(wmsStockInDO, wmsStockInDTO);
            wmsStockInDTO.setInStorageDate(new SimpleDateFormat("yyyy-MM-dd").format(wmsStockInDO.getInStorageDate()));
            model.addAttribute("rmi", wmsStockInDTO);
            //System.out.println(wmsStockInDO.getInStorageDate());
        }
        // 权限管理页面
        return "stockInPage/update";     //G：编辑的时候可以将参数直接带到编辑页面
    }

    @PostMapping("/update")
    @ResponseBody
    public RestResult update(WmsStockInDTO wmsStockInDTO) throws ParseException {
        WmsStockInDO wmsStockInDO = new WmsStockInDO();

        BeanUtils.copyProperties(wmsStockInDTO, wmsStockInDO);
        wmsStockInDO.setInStorageDate(
                new SimpleDateFormat("yyyy-MM-dd")
                        .parse(wmsStockInDTO.getInStorageDate()));

        int success;
//      System.out.println(wmsStockInDTO.getInStorageDate());
        success = wmsStockInDOService.updateByPrimaryKeySelective(wmsStockInDO);

        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    @GetMapping(value = "/page/add")
    public String add() {
        return "inventory/add";
    }

    @PostMapping("/add")
    @ResponseBody
    public RestResult add(WmsStockInDO wmsStockInDO) {
        int id = wmsStockInDOService.insertSelective(wmsStockInDO);
        if (id != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    /**
     * 查看权限管理页面，并可进行搜索
     * 注意：必须带上systemId参数（绑定在WmsStockInDTO中）
     * @param wmsStockInDTO
     * @return
     */
    @GetMapping(value = "/page/list")
    public String list(Model model,
                          WmsStockInDTO wmsStockInDTO) {
        // 权限管理页面
        return "stockInPage/list";
    }


    /**
     * 分页查询WmsStockIn列表
     * @param pageNum
     * @param pageSize
     * @param wmsStockInDTO
     * @return
     */
    @GetMapping(value = "/list")
    @ResponseBody
    public RestResult list(
                            Integer pageNum,
                            Integer pageSize,
                            WmsStockInDTO wmsStockInDTO) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 5;
        }
        // 在application.yml里配置了分页参数合理化，所以不需要处理start的检查
        PageTable pageTable = wmsStockInDOService.selectByExamplewithPage(
                pageNum,
                pageSize,
                buildPageExample(wmsStockInDTO));

        if (pageTable != null) {
            return RestResult.success(pageTable);
        } else {
            return RestResult.failed(ResultCode.PAGE_LIST_ERROR);
        }

    }

    private WmsStockInDOExample buildPageExample(WmsStockInDTO wmsStockInDTO) {
        if (wmsStockInDTO == null) {
            return null;
        }

        Integer materialId = wmsStockInDTO.getMaterialId();   //G：搜索所需字段
        String inStorageName = wmsStockInDTO.getInStorageName();

        WmsStockInDOExample example = new WmsStockInDOExample();
        WmsStockInDOExample.Criteria criteria = example.createCriteria();

        //  where.....like....
        //  where.....like....
        if (materialId != null) {
            criteria.andMaterialIdEqualTo(materialId); // and type = type
        }
        //
        if (StringUtils.isNotBlank(inStorageName)) {
            criteria.andInStorageNameNotLike("%" + inStorageName + "%");// and name like '%name%'
        }

        // 默认按id升序排
        example.setOrderByClause("stock_in_id asc");
        return example;
    }


    /**
     * 删除WmsStockIn信息, 通过id
     * @param stockInId
     */
    @PostMapping(value = "/delete", params = {"stockInId"})
    @ResponseBody
    public RestResult delete(Integer stockInId) {
        int success = 0;
        if (stockInId != null && stockInId != 0) {
            success = wmsStockInDOService.deleteByPrimaryKey(stockInId);
        }

        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.DELETE_ERROR);
        }
    }


}
