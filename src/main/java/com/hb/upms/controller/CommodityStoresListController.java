package com.hb.upms.controller;

import com.hb.upms.common.PageTable;
import com.hb.upms.common.RestResult;
import com.hb.upms.constant.ResultCode;
import com.hb.upms.controller.dto.CommodityStoresListDTO;
import com.hb.upms.controller.dto.WmsStoresListDTO;
import com.hb.upms.model.CommodityStoresListDO;
import com.hb.upms.model.CommodityStoresListDOExample;
import com.hb.upms.model.WmsStoresListDO;
import com.hb.upms.model.WmsStoresListDOExample;
import com.hb.upms.service.impl.CommodityStoresListDOService;
import com.hb.upms.service.impl.WmsStoresListDOService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/commodityStoresLists")
public class CommodityStoresListController {

    @Autowired
    private CommodityStoresListDOService commodityStoresListDOService;

    @GetMapping(value = "/page/update")
    public String update(Model model,
                            Integer commodityInventoryId) {
        CommodityStoresListDO commodityStoresListDO;
        if (commodityInventoryId != null && commodityInventoryId != 0) {
            commodityStoresListDO = commodityStoresListDOService.selectByPrimaryKey(commodityInventoryId);
            model.addAttribute("csl", commodityStoresListDO);
        }
        // 权限管理页面
        return "commodityStoresListPage/update";     //G：编辑的时候可以将参数直接带到编辑页面
    }

    @PostMapping("/update")
    @ResponseBody
    public RestResult update(CommodityStoresListDO commodityStoresListDO) {
        int success;
        success = commodityStoresListDOService.updateByPrimaryKeySelective(commodityStoresListDO);
        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    @GetMapping(value = "/page/add")
    public String add() {
        return "commodityStoresListPage/add";
    }

    @PostMapping("/add")
    @ResponseBody
    public RestResult add(CommodityStoresListDO commodityStoresListDO) {
        int id = commodityStoresListDOService.insertSelective(commodityStoresListDO);
        if (id != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    /**
     * 查看权限管理页面，并可进行搜索
     * 注意：必须带上systemId参数（绑定在CommodityStoresListDTO中）
     * @param commodityStoresListDTO
     * @return
     */
    @GetMapping(value = "/page/list")
    public String list(Model model,
                          CommodityStoresListDTO commodityStoresListDTO) {
        // 权限管理页面
        return "commodityStoresListPage/list";
    }


    /**
     * 分页查询CommodityStoresList列表
     * @param pageNum
     * @param pageSize
     * @param commodityStoresListDTO
     * @return
     */
    @GetMapping(value = "/list")
    @ResponseBody
    public RestResult list(
                            Integer pageNum,
                            Integer pageSize,
                            CommodityStoresListDTO commodityStoresListDTO) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 5;
        }
        // 在application.yml里配置了分页参数合理化，所以不需要处理start的检查
        PageTable pageTable = commodityStoresListDOService.selectByExamplewithPage(
                pageNum,
                pageSize,
                buildPageExample(commodityStoresListDTO));

        if (pageTable != null) {
             return RestResult.success(pageTable);
        } else {
            return RestResult.failed(ResultCode.PAGE_LIST_ERROR);
        }

    }

    private CommodityStoresListDOExample buildPageExample(CommodityStoresListDTO commodityStoresListDTO) {
        if (commodityStoresListDTO == null) {
            return null;
        }

        Long orderId = commodityStoresListDTO.getOrderId();   //G：搜索所需字段
        String storageLocation = commodityStoresListDTO.getStorageLocation();

        CommodityStoresListDOExample example = new CommodityStoresListDOExample();
        CommodityStoresListDOExample.Criteria criteria = example.createCriteria();

        //  where.....like....
        //  where.....like....
        if (orderId != null) {
            criteria.andOrderIdEqualTo(orderId); // and type = type
        }
        //
        if (StringUtils.isNotBlank(storageLocation)) {
            criteria.andStorageLocationLike("%" + storageLocation + "%");// and name like '%name%'
        }

        // 默认按id升序排
        example.setOrderByClause("order_id asc");
        return example;
    }


    /**
     * 删除WmsStoresList信息, 通过id
     * @param commodityInventoryId
     */
    @PostMapping(value = "/delete", params = {"commodityInventoryId"})
    @ResponseBody
    public RestResult delete(Integer commodityInventoryId) {
        int success = 0;
        if (commodityInventoryId != null && commodityInventoryId != 0) {
            success = commodityStoresListDOService.deleteByPrimaryKey(commodityInventoryId);
        }

        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.DELETE_ERROR);
        }
    }


}
