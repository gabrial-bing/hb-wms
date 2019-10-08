package com.hb.upms.controller;

import com.hb.upms.common.PageTable;
import com.hb.upms.common.RestResult;
import com.hb.upms.constant.ResultCode;
import com.hb.upms.controller.dto.DeliveryOrderDTO;
import com.hb.upms.model.DeliveryOrderDO;
import com.hb.upms.model.DeliveryOrderDOExample;
import com.hb.upms.service.DeliveryOrderDOService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/materialDeliveryOrders")
public class DeliveryOrderController {

    @Autowired
    private DeliveryOrderDOService deliveryOrderDOService;

    @GetMapping(value = "/page/update")
    public String update(Model model,
                            Integer deliveryOrderId) {
        DeliveryOrderDO deliveryOrderDO;
        if (deliveryOrderId != null && deliveryOrderId != 0) {
            deliveryOrderDO = deliveryOrderDOService.selectByPrimaryKey(deliveryOrderId);
            model.addAttribute("inventory", deliveryOrderDO);
        }
        // 权限管理页面
        return "materialDeliveryOrderPage/update";     //G：编辑的时候可以将参数直接带到编辑页面
    }

    @PostMapping("/update")
    @ResponseBody
    public RestResult update(DeliveryOrderDO deliveryOrderDO) {
        int success;
        success = deliveryOrderDOService.updateByPrimaryKeySelective(deliveryOrderDO);
        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    @GetMapping(value = "/page/add")
    public String add() {
        return "materialDeliveryOrderPage/add";
    }

    @PostMapping("/add")
    @ResponseBody
    public RestResult add(DeliveryOrderDO deliveryOrderDO) {
        int id = deliveryOrderDOService.insertSelective(deliveryOrderDO);
        if (id != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    /**
     * 查看权限管理页面，并可进行搜索
     * 注意：必须带上systemId参数（绑定在DeliveryOrderDTO中）
     * @param deliveryOrderDTO
     * @return
     */
    @GetMapping(value = "/page/list")
    public String list(Model model,
                          DeliveryOrderDTO deliveryOrderDTO) {
        // 权限管理页面
        return "materialDeliveryOrderPage/list";
    }


    /**
     * 分页查询 DeliveryOrder列表
     * @param pageNum
     * @param pageSize
     * @param deliveryOrderDTO
     * @return
     */
    @GetMapping(value = "/list")
    @ResponseBody
    public RestResult list(
                            Integer pageNum,
                            Integer pageSize,
                            DeliveryOrderDTO deliveryOrderDTO) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 5;
        }
        // 在application.yml里配置了分页参数合理化，所以不需要处理start的检查
        PageTable pageTable = deliveryOrderDOService.selectByExamplewithPage(
                pageNum,
                pageSize,
                buildPageExample(deliveryOrderDTO));

        if (pageTable != null) {
            return RestResult.success(pageTable);
        } else {
            return RestResult.failed(ResultCode.PAGE_LIST_ERROR);
        }

    }

    private DeliveryOrderDOExample buildPageExample(DeliveryOrderDTO deliveryOrderDTO) {
        if (deliveryOrderDTO == null) {
            return null;
        }

        String materialId = deliveryOrderDTO.getMaterialId();   //G：搜索所需字段
        String orderId = deliveryOrderDTO.getOrderId();

        DeliveryOrderDOExample example = new DeliveryOrderDOExample();
        DeliveryOrderDOExample.Criteria criteria = example.createCriteria();

        //  where.....like....
        //  where.....like....
        if (materialId != null) {
            criteria.andMaterialIdEqualTo(materialId); // and type = type
        }
        //
        if (StringUtils.isNotBlank(orderId)) {
            criteria.andOrderIdNotLike("%" + orderId + "%");// and name like '%name%'
        }

        // 默认按id升序排
        example.setOrderByClause("delivery_order_id asc");
        return example;
    }


    /**
     * 删除DeliveryOrder信息, 通过deliveryOrderId
     * @param deliveryOrderId
     */
    @PostMapping(value = "/delete", params = {"deliveryOrderId"})
    @ResponseBody
    public RestResult delete(Integer deliveryOrderId) {
        int success = 0;
        if (deliveryOrderId != null && deliveryOrderId != 0) {
            success = deliveryOrderDOService.deleteByPrimaryKey(deliveryOrderId);
        }

        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.DELETE_ERROR);
        }
    }


}
