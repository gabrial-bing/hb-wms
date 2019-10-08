package com.hb.upms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hb.upms.common.PageTable;
import com.hb.upms.model.WmsInventoryDO;
import com.hb.upms.model.WmsInventoryDOExample;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.hb.upms.model.CommodityStoresListDOExample;
import com.hb.upms.mapper.CommodityStoresListDOMapper;
import com.hb.upms.model.CommodityStoresListDO;

@Service
public class CommodityStoresListDOService{

    @Resource
    private CommodityStoresListDOMapper commodityStoresListDOMapper;

    public long countByExample(CommodityStoresListDOExample example){
        return commodityStoresListDOMapper.countByExample(example);
    }

    public int deleteByExample(CommodityStoresListDOExample example){
        return commodityStoresListDOMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer commodityInventoryId){
        return commodityStoresListDOMapper.deleteByPrimaryKey(commodityInventoryId);
    }

    public int insert(CommodityStoresListDO record){
        return commodityStoresListDOMapper.insert(record);
    }

    public int insertSelective(CommodityStoresListDO record){
        return commodityStoresListDOMapper.insertSelective(record);
    }

    public List<CommodityStoresListDO> selectByExample(CommodityStoresListDOExample example){
        return commodityStoresListDOMapper.selectByExample(example);
    }

    public CommodityStoresListDO selectByPrimaryKey(Integer commodityInventoryId){
        return commodityStoresListDOMapper.selectByPrimaryKey(commodityInventoryId);
    }

    public int updateByExampleSelective(CommodityStoresListDO record,CommodityStoresListDOExample example){
        return commodityStoresListDOMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(CommodityStoresListDO record,CommodityStoresListDOExample example){
        return commodityStoresListDOMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(CommodityStoresListDO record){
        return commodityStoresListDOMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CommodityStoresListDO record){
        return commodityStoresListDOMapper.updateByPrimaryKey(record);
    }



    /*分页*/
    public PageTable selectByExamplewithPage(int page, int pageSize, CommodityStoresListDOExample example) {
        // 默认的查询行为
        if (example == null) {
            example = new CommodityStoresListDOExample();
            CommodityStoresListDOExample.Criteria criteria = example.createCriteria();
            // 默认按id升序排
            example.setOrderByClause("oderId asc");
        }

        PageHelper.startPage(page, pageSize);
        // 分页查询，上面跟着一个PageHelper.startPage方法
        List<CommodityStoresListDO> commodityStoresListDOList = commodityStoresListDOMapper.selectByExample(example);
        PageInfo<CommodityStoresListDO> pageInfo = new PageInfo<>(commodityStoresListDOList);
        return new PageTable(
                commodityStoresListDOList,
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                pageInfo.getTotal(),
                pageInfo.getPages());
    }

}
