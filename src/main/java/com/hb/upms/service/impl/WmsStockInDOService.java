package com.hb.upms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hb.upms.common.PageTable;
import com.hb.upms.model.WmsInventoryDO;
import com.hb.upms.model.WmsInventoryDOExample;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.hb.upms.model.WmsStockInDO;
import com.hb.upms.model.WmsStockInDOExample;
import com.hb.upms.mapper.WmsStockInDOMapper;

@Service
public class WmsStockInDOService{

    @Resource
    private WmsStockInDOMapper wmsStockInDOMapper;

    public long countByExample(WmsStockInDOExample example){
        return wmsStockInDOMapper.countByExample(example);
    }

    public int deleteByExample(WmsStockInDOExample example){
        return wmsStockInDOMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer stockInId){
        return wmsStockInDOMapper.deleteByPrimaryKey(stockInId);
    }

    public int insert(WmsStockInDO record){
        return wmsStockInDOMapper.insert(record);
    }

    public int insertSelective(WmsStockInDO record){
        return wmsStockInDOMapper.insertSelective(record);
    }

    public List<WmsStockInDO> selectByExample(WmsStockInDOExample example){
        return wmsStockInDOMapper.selectByExample(example);
    }

    public WmsStockInDO selectByPrimaryKey(Integer stockInId){
        return wmsStockInDOMapper.selectByPrimaryKey(stockInId);
    }

    public int updateByExampleSelective(WmsStockInDO record,WmsStockInDOExample example){
        return wmsStockInDOMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(WmsStockInDO record,WmsStockInDOExample example){
        return wmsStockInDOMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(WmsStockInDO record){
        return wmsStockInDOMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WmsStockInDO record){
        return wmsStockInDOMapper.updateByPrimaryKey(record);
    }


    //@Override
    public PageTable selectByExamplewithPage(int page, int pageSize, WmsStockInDOExample example) {
        // 默认的查询行为
        if (example == null) {
            example = new WmsStockInDOExample();
            WmsStockInDOExample.Criteria criteria = example.createCriteria();
            // 默认按id升序排
            example.setOrderByClause("stock_in_id asc");
        }

        PageHelper.startPage(page, pageSize);
        // 分页查询，上面跟着一个PageHelper.startPage方法
        List<WmsStockInDO> wmsStockInDOList = wmsStockInDOMapper.selectByExample(example);
        PageInfo<WmsStockInDO> pageInfo = new PageInfo<>(wmsStockInDOList);
        return new PageTable(
                wmsStockInDOList,
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                pageInfo.getTotal(),
                pageInfo.getPages());
    }
}
