package com.hb.upms.controller;

import com.hb.upms.common.PageTable;
import com.hb.upms.common.RestResult;
import com.hb.upms.constant.ResultCode;
import com.hb.upms.controller.dto.CommodityStockOutDTO;
import com.hb.upms.controller.dto.WmsStockOutDTO;
import com.hb.upms.model.*;
import com.hb.upms.service.impl.CommodityStockOutDOService;
import com.hb.upms.service.impl.CommodityStoresListDOService;
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
@RequestMapping("/commodityStockOuts")
public class CommodityStockOutController {

    @Autowired
    private CommodityStockOutDOService commodityStockOutDOService;

    @GetMapping(value = "/page/update")
    public String update(Model model,
                            Integer stockOutId) {
        CommodityStockOutDO commodityStockOutDO;
        if (stockOutId != null && stockOutId != 0) {
            commodityStockOutDO = commodityStockOutDOService.selectByPrimaryKey(stockOutId);
            model.addAttribute("inventory", commodityStockOutDO);
        }
        // 权限管理页面
        return "commodityStockOutPage/update";     //G：编辑的时候可以将参数直接带到编辑页面
    }

    @PostMapping("/update")
    @ResponseBody
    public RestResult update(CommodityStockOutDO commodityStockOutDO) {
        int success;
        success = commodityStockOutDOService.updateByPrimaryKeySelective(commodityStockOutDO);
        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    @GetMapping(value = "/page/add")
    public String add() {
        return "commodityStockOutPage/add";
    }

    @PostMapping("/add")
    @ResponseBody
    public RestResult add(CommodityStockOutDO commodityStockOutDO) {
        int id = commodityStockOutDOService.insertSelective(commodityStockOutDO);
        if (id != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    /**
     * 查看权限管理页面，并可进行搜索
     * 注意：必须带上systemId参数（绑定在CommodityStockOutDTO中）
     * @param commodityStockOutDTO
     * @return
     */
    @GetMapping(value = "/page/list")
    public String list(Model model,
                          CommodityStockOutDTO commodityStockOutDTO) {
        // 权限管理页面
        return "commodityStockOutPage/list";
    }


    /**
     * 分页查询WmsStockOut列表
     * @param pageNum
     * @param pageSize
     * @param commodityStockOutDTO
     * @return
     */
    @GetMapping(value = "/list")
    @ResponseBody
    public RestResult list(
                            Integer pageNum,
                            Integer pageSize,
                            CommodityStockOutDTO commodityStockOutDTO) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 5;
        }
        // 在application.yml里配置了分页参数合理化，所以不需要处理start的检查
        PageTable pageTable = commodityStockOutDOService.selectByExamplewithPage(
                pageNum,
                pageSize,
                buildPageExample(commodityStockOutDTO));

        if (pageTable != null) {
            return RestResult.success(pageTable);
        } else {
            return RestResult.failed(ResultCode.PAGE_LIST_ERROR);
        }

    }

    private CommodityStockOutDOExample buildPageExample(CommodityStockOutDTO commodityStockOutDTO) {
        if (commodityStockOutDTO == null) {
            return null;
        }

        Integer orderId = commodityStockOutDTO.getOrderId();   //G：搜索所需字段
        String outStorageName = commodityStockOutDTO.getOutStorageName();

        CommodityStockOutDOExample example = new CommodityStockOutDOExample();
        CommodityStockOutDOExample.Criteria criteria = example.createCriteria();

        //  where.....like....
        //  where.....like....
        if (orderId != null) {
            criteria.andOrderIdEqualTo(orderId); // and type = type
        }
        //
        if (StringUtils.isNotBlank(outStorageName)) {
            criteria.andOutStorageNameLike("%" + outStorageName + "%");// and name like '%name%'
        }

        // 默认按id升序排
        example.setOrderByClause("id asc");
        return example;
    }


    /**
     * 删除WmsStockOut信息, 通过id
     * @param id
     */
    @PostMapping(value = "/delete", params = {"id"})
    @ResponseBody
    public RestResult delete(Integer id) {
        int success = 0;
        if (id != null && id != 0) {
            success = commodityStockOutDOService.deleteByPrimaryKey(id);
        }

        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.DELETE_ERROR);
        }
    }


}
