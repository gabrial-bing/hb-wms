package com.hb.upms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hb.upms.common.PageTable;
import com.hb.upms.model.CommodityStoresListDO;
import com.hb.upms.model.CommodityStoresListDOExample;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.hb.upms.mapper.CommodityStockOutDOMapper;
import com.hb.upms.model.CommodityStockOutDO;
import com.hb.upms.model.CommodityStockOutDOExample;

@Service
public class CommodityStockOutDOService{

    @Resource
    private CommodityStockOutDOMapper commodityStockOutDOMapper;

    public long countByExample(CommodityStockOutDOExample example){
        return commodityStockOutDOMapper.countByExample(example);
    }

    public int deleteByExample(CommodityStockOutDOExample example){
        return commodityStockOutDOMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id){
        return commodityStockOutDOMapper.deleteByPrimaryKey(id);
    }

    public int insert(CommodityStockOutDO record){
        return commodityStockOutDOMapper.insert(record);
    }

    public int insertSelective(CommodityStockOutDO record){
        return commodityStockOutDOMapper.insertSelective(record);
    }

    public List<CommodityStockOutDO> selectByExample(CommodityStockOutDOExample example){
        return commodityStockOutDOMapper.selectByExample(example);
    }

    public CommodityStockOutDO selectByPrimaryKey(Integer id){
        return commodityStockOutDOMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(CommodityStockOutDO record,CommodityStockOutDOExample example){
        return commodityStockOutDOMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(CommodityStockOutDO record,CommodityStockOutDOExample example){
        return commodityStockOutDOMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(CommodityStockOutDO record){
        return commodityStockOutDOMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CommodityStockOutDO record){
        return commodityStockOutDOMapper.updateByPrimaryKey(record);
    }


    /*分页*/
    public PageTable selectByExamplewithPage(int page, int pageSize, CommodityStockOutDOExample example) {
        // 默认的查询行为
        if (example == null) {
            example = new CommodityStockOutDOExample();
            CommodityStockOutDOExample.Criteria criteria = example.createCriteria();
            // 默认按id升序排
            example.setOrderByClause("id asc");
        }

        PageHelper.startPage(page, pageSize);
        // 分页查询，上面跟着一个PageHelper.startPage方法
        List<CommodityStockOutDO> commodityStockOutDOList = commodityStockOutDOMapper.selectByExample(example);
        PageInfo<CommodityStockOutDO> pageInfo = new PageInfo<>(commodityStockOutDOList);
        return new PageTable(
                commodityStockOutDOList,
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                pageInfo.getTotal(),
                pageInfo.getPages());
    }


}
