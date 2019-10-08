package com.hb.upms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hb.upms.common.PageTable;
import com.hb.upms.controller.dto.WmsStoresListDTO;
import com.hb.upms.mapper.PmsRawMaterialInfoDOMapper;
import com.hb.upms.model.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import com.hb.upms.mapper.WmsStoresListDOMapper;

@Service
public class WmsStoresListDOService{

    @Resource
    private WmsStoresListDOMapper wmsStoresListDOMapper;

    public long countByExample(WmsStoresListDOExample example){
        return wmsStoresListDOMapper.countByExample(example);
    }

    public int deleteByExample(WmsStoresListDOExample example){
        return wmsStoresListDOMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer inventoryId){
        return wmsStoresListDOMapper.deleteByPrimaryKey(inventoryId);
    }

    public int insert(WmsStoresListDO record){
        return wmsStoresListDOMapper.insert(record);
    }

    public int insertSelective(WmsStoresListDO record){
        return wmsStoresListDOMapper.insertSelective(record);
    }

    public List<WmsStoresListDO> selectByExample(WmsStoresListDOExample example){
        return wmsStoresListDOMapper.selectByExample(example);
    }

    public WmsStoresListDO selectByPrimaryKey(Integer inventoryId){
        return wmsStoresListDOMapper.selectByPrimaryKey(inventoryId);
    }
    /* G：查询物料ID，以便于改变相同物料ID值数量*/
    public WmsStoresListDO selectByMaterialKey(Integer materialId){
        return wmsStoresListDOMapper.selectByMaterialKey(materialId);
    }

    public int updateByExampleSelective(WmsStoresListDO record,WmsStoresListDOExample example){
        return wmsStoresListDOMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(WmsStoresListDO record,WmsStoresListDOExample example){
        return wmsStoresListDOMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(WmsStoresListDO record){
        return wmsStoresListDOMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WmsStoresListDO record){
        return wmsStoresListDOMapper.updateByPrimaryKey(record);
    }




    @Resource
    PmsRawMaterialInfoDOMapper pmsRawMaterialInfoDOMapper;
    //@Override
    public PageTable selectByExamplewithPage(int page, int pageSize, WmsStoresListDOExample example) {
        // 默认的查询行为
        if (example == null) {
            example = new WmsStoresListDOExample();
            WmsStoresListDOExample.Criteria criteria = example.createCriteria();
            // 默认按id升序排
            example.setOrderByClause("inventory_id asc");
        }

        PageHelper.startPage(page, pageSize);
        // 分页查询，上面跟着一个PageHelper.startPage方法
        List<WmsStoresListDO> wmsStoresListDOList = wmsStoresListDOMapper.selectByExample(example);//G：表示查询的是单单库存列表

        List<WmsStoresListDTO> wmsStoresListDTOList = new ArrayList<>();
        PmsRawMaterialInfoDO pmsRawMaterialInfoDO;
        for (int i=0;i<wmsStoresListDOList.size();i++) {
            WmsStoresListDTO wmsStoresListDTO = new WmsStoresListDTO();
            BeanUtils.copyProperties(wmsStoresListDOList.get(i), wmsStoresListDTO);
            pmsRawMaterialInfoDO = pmsRawMaterialInfoDOMapper.selectByPrimaryKey(wmsStoresListDTO.getMaterialId());
            wmsStoresListDTO.setProductName(pmsRawMaterialInfoDO.getProductName());
            wmsStoresListDTO.setSpecificationType(pmsRawMaterialInfoDO.getSpecificationType());
            wmsStoresListDTO.setBigTypeId(pmsRawMaterialInfoDO.getBigTypeId());
            wmsStoresListDTO.setSmallTypeId(pmsRawMaterialInfoDO.getSmallTypeId());

            wmsStoresListDTOList.add(wmsStoresListDTO);
        }

        // G：☆☆☆☆☆获取到分页查询DOLlst相关的分页属性☆☆☆☆☆
        PageInfo<WmsStoresListDO> pageInfo = new PageInfo<>(wmsStoresListDOList);
        return new PageTable(
                wmsStoresListDTOList,
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                pageInfo.getTotal(),
                pageInfo.getPages());
    }

}
