package com.hb.upms.controller;

import com.hb.upms.common.PageTable;
import com.hb.upms.common.RestResult;
import com.hb.upms.constant.ResultCode;
import com.hb.upms.controller.dto.WmsInventoryDTO;
import com.hb.upms.model.WmsInventoryDO;
import com.hb.upms.model.WmsInventoryDOExample;
import com.hb.upms.service.WmsInventoryDOService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/inventorys")
public class WmsInventoryController {

    @Autowired
    private WmsInventoryDOService wmsInventoryDOService;

    @GetMapping(value = "/page/update")
    public String update(Model model,
                            Integer id) {
        WmsInventoryDO wmsInventoryDO;
        if (id != null && id != 0) {
            wmsInventoryDO = wmsInventoryDOService.selectByPrimaryKey(id);
            model.addAttribute("inventory", wmsInventoryDO);
        }
        // 权限管理页面
        return "inventory/update";     //G：编辑的时候可以将参数直接带到编辑页面
    }

    @PostMapping("/update")
    @ResponseBody

    public RestResult update(WmsInventoryDO wmsInventoryDO) {
        int success;
        success = wmsInventoryDOService.updateByPrimaryKeySelective(wmsInventoryDO);
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
    public RestResult add(WmsInventoryDO wmsInventoryDO) {
        int id = wmsInventoryDOService.insertSelective(wmsInventoryDO);
        if (id != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.FORM_ERROR);
        }
    }

    /**
     * 查看权限管理页面，并可进行搜索
     * 注意：必须带上systemId参数（绑定在WmsInventoryDTO中）
     * @param wmsInventoryDTO
     * @return
     */
    @GetMapping(value = "/page/list")
    public String list(Model model,
                          WmsInventoryDTO wmsInventoryDTO) {
        // 权限管理页面
        return "inventory/list";
    }


    /**
     * 分页查询WmsInventory列表
     * @param pageNum
     * @param pageSize
     * @param wmsInventoryDTO
     * @return
     */
    @GetMapping(value = "/list")
    @ResponseBody
    public RestResult list(
                            Integer pageNum,
                            Integer pageSize,
                            WmsInventoryDTO wmsInventoryDTO) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 5;
        }
        // 在application.yml里配置了分页参数合理化，所以不需要处理start的检查
        PageTable pageTable = wmsInventoryDOService.selectByExamplewithPage(
                pageNum,
                pageSize,
                buildPageExample(wmsInventoryDTO));

        if (pageTable != null) {
            return RestResult.success(pageTable);
        } else {
            return RestResult.failed(ResultCode.PAGE_LIST_ERROR);
        }

    }

    private WmsInventoryDOExample buildPageExample(WmsInventoryDTO wmsInventoryDTO) {
        if (wmsInventoryDTO == null) {
            return null;
        }

        String type = wmsInventoryDTO.getType();
        String name = wmsInventoryDTO.getName();

        WmsInventoryDOExample example = new WmsInventoryDOExample();
        WmsInventoryDOExample.Criteria criteria = example.createCriteria();

        //  where.....like....
        //  where.....like....
        if (StringUtils.isNotBlank(type)) {
            criteria.andTypeEqualTo(type); // and type = type
        }
        //
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameLike("%" + name + "%");// and name like '%name%'
        }

        // 默认按id升序排
        example.setOrderByClause("id asc");
        return example;
    }


    /**
     * 删除WmsInventory信息, 通过id
     * @param id
     */
    @PostMapping(value = "/delete", params = {"id"})
    @ResponseBody
    public RestResult delete(Integer id) {
        int success = 0;
        if (id != null && id != 0) {
            success = wmsInventoryDOService.deleteByPrimaryKey(id);
        }

        if (success != 0) {
            return RestResult.success();
        } else {
            return RestResult.failed(ResultCode.DELETE_ERROR);
        }
    }


}
