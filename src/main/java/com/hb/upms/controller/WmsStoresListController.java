package com.hb.upms.controller;

import com.hb.upms.common.PageTable;
import com.hb.upms.common.RestResult;
import com.hb.upms.constant.ResultCode;
import com.hb.upms.controller.dto.WmsStockInDTO;
import com.hb.upms.controller.dto.WmsStoresListDTO;
import com.hb.upms.model.WmsStockInDO;
import com.hb.upms.model.WmsStockInDOExample;
import com.hb.upms.model.WmsStoresListDO;
import com.hb.upms.model.WmsStoresListDOExample;
import com.hb.upms.service.impl.WmsStockInDOService;
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
@RequestMapping("/storesLists")
public class WmsStoresListController {

    @Autowired
    private WmsStoresListDOService wmsStoresListDOService;

    @GetMapping(value = "/page/update")
    public String update(Model model,
                            Integer inventoryId) {
        WmsStoresListDO wmsStoresListDO;
        if (inventoryId != null && inventoryId != 0) {
            wmsStoresListDO = wmsStoresListDOService.selectByPrimaryKey(inventoryId);
            model.addAttribute("inventory", wmsStoresListDO);
        }
        // 权限管理页面
        return "inventory/update";     //G：编辑的时候可以将参数直接带到编辑页面
    }

    @PostMapping("/update")
    @ResponseBody
    public RestResult update(WmsStoresListDO wmsStoresListDO) {
        int success;
        success = wmsStoresListDOService.updateByPrimaryKeySelective(wmsStoresListDO);
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
    public RestResult add(WmsStoresListDO wmsStoresListDO) {
        int id = wmsStoresListDOService.insertSelective(wmsStoresListDO);
        if (id != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    /**
     * 查看权限管理页面，并可进行搜索
     * 注意：必须带上systemId参数（绑定在WmsStoresListDTO中）
     * @param wmsStoresListDTO
     * @return
     */
    @GetMapping(value = "/page/list")
    public String list(Model model,
                          WmsStoresListDTO wmsStoresListDTO) {
        // 权限管理页面
        return "storesListPage/list";
    }


    /**
     * 分页查询WmsStoresList列表
     * @param pageNum
     * @param pageSize
     * @param wmsStoresListDTO
     * @return
     */
    @GetMapping(value = "/list")
    @ResponseBody
    public RestResult list(
                            Integer pageNum,
                            Integer pageSize,
                            WmsStoresListDTO wmsStoresListDTO) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 5;
        }
        // 在application.yml里配置了分页参数合理化，所以不需要处理start的检查
        PageTable pageTable = wmsStoresListDOService.selectByExamplewithPage(
                pageNum,
                pageSize,
                buildPageExample(wmsStoresListDTO));

        if (pageTable != null) {
             return RestResult.success(pageTable);
        } else {
            return RestResult.failed(ResultCode.PAGE_LIST_ERROR);
        }

    }

    private WmsStoresListDOExample buildPageExample(WmsStoresListDTO wmsStoresListDTO) {
        if (wmsStoresListDTO == null) {
            return null;
        }

        Integer materialId = wmsStoresListDTO.getMaterialId();   //G：搜索所需字段
        String storageLocation = wmsStoresListDTO.getStorageLocation();

        WmsStoresListDOExample example = new WmsStoresListDOExample();
        WmsStoresListDOExample.Criteria criteria = example.createCriteria();

        //  where.....like....
        //  where.....like....
        if (materialId != null) {
            criteria.andMaterialIdEqualTo(materialId); // and type = type
        }
        //
        if (StringUtils.isNotBlank(storageLocation)) {
            criteria.andStorageLocationLike("%" + storageLocation + "%");// and name like '%name%'
        }

        // 默认按id升序排
        example.setOrderByClause("inventory_id asc");
        return example;
    }


    /**
     * 删除WmsStoresList信息, 通过id
     * @param inventoryId
     */
    @PostMapping(value = "/delete", params = {"storesListId"})
    @ResponseBody
    public RestResult delete(Integer inventoryId) {
        int success = 0;
        if (inventoryId != null && inventoryId != 0) {
            success = wmsStoresListDOService.deleteByPrimaryKey(inventoryId);
        }

        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.DELETE_ERROR);
        }
    }


}
