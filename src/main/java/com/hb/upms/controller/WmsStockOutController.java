package com.hb.upms.controller;

import com.hb.upms.common.PageTable;
import com.hb.upms.common.RestResult;
import com.hb.upms.constant.ResultCode;
import com.hb.upms.controller.dto.WmsStockInDTO;
import com.hb.upms.controller.dto.WmsStockOutDTO;
import com.hb.upms.model.WmsStockInDO;
import com.hb.upms.model.WmsStockInDOExample;
import com.hb.upms.model.WmsStockOutDO;
import com.hb.upms.model.WmsStockOutDOExample;
import com.hb.upms.service.impl.WmsStockInDOService;
import com.hb.upms.service.impl.WmsStockOutDOService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/stockOuts")
public class WmsStockOutController {

    @Autowired
    private WmsStockOutDOService wmsStockOutDOService;

    @GetMapping(value = "/page/update")
    public String update(Model model,
                            Integer stockOutId) {
        WmsStockOutDO wmsStockOutDO;
        if (stockOutId != null && stockOutId != 0) {
            wmsStockOutDO = wmsStockOutDOService.selectByPrimaryKey(stockOutId);
            model.addAttribute("inventory", wmsStockOutDO);
        }
        // 权限管理页面
        return "stockOutPage/update";     //G：编辑的时候可以将参数直接带到编辑页面
    }

    @PostMapping("/update")
    @ResponseBody
    public RestResult update(WmsStockOutDO wmsStockOutDO) {
        int success;
        success = wmsStockOutDOService.updateByPrimaryKeySelective(wmsStockOutDO);
        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    @GetMapping(value = "/page/add")
    public String add() {
        return "stockOutPage/add";
    }

    @PostMapping("/add")
    @ResponseBody
    public RestResult add(WmsStockOutDO wmsStockOutDO) {
        int id = wmsStockOutDOService.insertSelective(wmsStockOutDO);
        if (id != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    /**
     * 查看权限管理页面，并可进行搜索
     * 注意：必须带上systemId参数（绑定在WmsStockOutDTO中）
     * @param wmsStockOutDTO
     * @return
     */
    @GetMapping(value = "/page/list")
    public String list(Model model,
                          WmsStockOutDTO wmsStockOutDTO) {
        // 权限管理页面
        return "stockOutPage/list";
    }


    /**
     * 分页查询WmsStockOut列表
     * @param pageNum
     * @param pageSize
     * @param wmsStockOutDTO
     * @return
     */
    @GetMapping(value = "/list")
    @ResponseBody
    public RestResult list(
                            Integer pageNum,
                            Integer pageSize,
                            WmsStockOutDTO wmsStockOutDTO) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 5;
        }
        // 在application.yml里配置了分页参数合理化，所以不需要处理start的检查
        PageTable pageTable = wmsStockOutDOService.selectByExamplewithPage(
                pageNum,
                pageSize,
                buildPageExample(wmsStockOutDTO));

        if (pageTable != null) {
            return RestResult.success(pageTable);
        } else {
            return RestResult.failed(ResultCode.PAGE_LIST_ERROR);
        }

    }

    private WmsStockOutDOExample buildPageExample(WmsStockOutDTO wmsStockOutDTO) {
        if (wmsStockOutDTO == null) {
            return null;
        }

        Integer materialId = wmsStockOutDTO.getMaterialId();   //G：搜索所需字段
        String outStorageName = wmsStockOutDTO.getOutStorageName();

        WmsStockOutDOExample example = new WmsStockOutDOExample();
        WmsStockOutDOExample.Criteria criteria = example.createCriteria();

        //  where.....like....
        //  where.....like....
        if (materialId != null) {
            criteria.andMaterialIdEqualTo(materialId); // and type = type
        }
        //
        if (StringUtils.isNotBlank(outStorageName)) {
            criteria.andOutStorageNameNotLike("%" + outStorageName + "%");// and name like '%name%'
        }

        // 默认按id升序排
        example.setOrderByClause("stock_out_id asc");
        return example;
    }


    /**
     * 删除WmsStockOut信息, 通过id
     * @param stockOutId
     */
    @PostMapping(value = "/delete", params = {"stockOutId"})
    @ResponseBody
    public RestResult delete(Integer stockOutId) {
        int success = 0;
        if (stockOutId != null && stockOutId != 0) {
            success = wmsStockOutDOService.deleteByPrimaryKey(stockOutId);
        }

        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.DELETE_ERROR);
        }
    }


}
