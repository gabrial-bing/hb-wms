package com.hb.upms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hb.upms.common.PageTable;
import com.hb.upms.model.WmsStockInDO;
import com.hb.upms.model.WmsStockInDOExample;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.hb.upms.model.WmsStockOutDO;
import com.hb.upms.mapper.WmsStockOutDOMapper;
import com.hb.upms.model.WmsStockOutDOExample;

@Service
public class WmsStockOutDOService{

    @Resource
    private WmsStockOutDOMapper wmsStockOutDOMapper;

    public long countByExample(WmsStockOutDOExample example){
        return wmsStockOutDOMapper.countByExample(example);
    }

    public int deleteByExample(WmsStockOutDOExample example){
        return wmsStockOutDOMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer stockOutId){
        return wmsStockOutDOMapper.deleteByPrimaryKey(stockOutId);
    }

    public int insert(WmsStockOutDO record){
        return wmsStockOutDOMapper.insert(record);
    }

    public int insertSelective(WmsStockOutDO record){
        return wmsStockOutDOMapper.insertSelective(record);
    }

    public List<WmsStockOutDO> selectByExample(WmsStockOutDOExample example){
        return wmsStockOutDOMapper.selectByExample(example);
    }

    public WmsStockOutDO selectByPrimaryKey(Integer stockOutId){
        return wmsStockOutDOMapper.selectByPrimaryKey(stockOutId);
    }

    public int updateByExampleSelective(WmsStockOutDO record,WmsStockOutDOExample example){
        return wmsStockOutDOMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(WmsStockOutDO record,WmsStockOutDOExample example){
        return wmsStockOutDOMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(WmsStockOutDO record){
        return wmsStockOutDOMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WmsStockOutDO record){
        return wmsStockOutDOMapper.updateByPrimaryKey(record);
    }


    //@Override
    public PageTable selectByExamplewithPage(int page, int pageSize, WmsStockOutDOExample example) {
        // 默认的查询行为
        if (example == null) {
            example = new WmsStockOutDOExample();
            WmsStockOutDOExample.Criteria criteria = example.createCriteria();
            // 默认按id升序排
            example.setOrderByClause("stock_out_id asc");
        }

        PageHelper.startPage(page, pageSize);
        // 分页查询，上面跟着一个PageHelper.startPage方法
        List<WmsStockOutDO> wmsStockOutDOList = wmsStockOutDOMapper.selectByExample(example);
        PageInfo<WmsStockOutDO> pageInfo = new PageInfo<>(wmsStockOutDOList);
        return new PageTable(
                wmsStockOutDOList,
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                pageInfo.getTotal(),
                pageInfo.getPages());
    }
}
