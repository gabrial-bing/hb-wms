package com.hb.upms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hb.upms.common.PageTable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hb.upms.model.WmsInventoryDO;
import com.hb.upms.model.WmsInventoryDOExample;
import com.hb.upms.mapper.WmsInventoryDOMapper;
import com.hb.upms.service.WmsInventoryDOService;

import java.util.List;

@Service
public class WmsInventoryDOServiceImpl implements WmsInventoryDOService{

    @Resource
    private WmsInventoryDOMapper wmsInventoryDOMapper;

    @Override
    public long countByExample(WmsInventoryDOExample example) {
        return wmsInventoryDOMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(WmsInventoryDOExample example) {
        return wmsInventoryDOMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return wmsInventoryDOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(WmsInventoryDO record) {
        return wmsInventoryDOMapper.insert(record);
    }

    @Override
    public int insertSelective(WmsInventoryDO record) {
        return wmsInventoryDOMapper.insertSelective(record);
    }

    @Override
    public List<WmsInventoryDO> selectByExample(WmsInventoryDOExample example) {
        return wmsInventoryDOMapper.selectByExample(example);
    }

    @Override
    public WmsInventoryDO selectByPrimaryKey(Integer id) {
        return wmsInventoryDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(WmsInventoryDO record,WmsInventoryDOExample example) {
        return wmsInventoryDOMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(WmsInventoryDO record,WmsInventoryDOExample example) {
        return wmsInventoryDOMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsInventoryDO record) {
        return wmsInventoryDOMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WmsInventoryDO record) {
        return wmsInventoryDOMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageTable selectByExamplewithPage(int page, int pageSize, WmsInventoryDOExample example) {
        // 默认的查询行为
        if (example == null) {
            example = new WmsInventoryDOExample();
            WmsInventoryDOExample.Criteria criteria = example.createCriteria();
            // 默认按id升序排
            example.setOrderByClause("id asc");
        }

        PageHelper.startPage(page, pageSize);
        // 分页查询，上面跟着一个PageHelper.startPage方法
        List<WmsInventoryDO> wmsInventoryDOList = wmsInventoryDOMapper.selectByExample(example);
        PageInfo<WmsInventoryDO> pageInfo = new PageInfo<>(wmsInventoryDOList);
        return new PageTable(
                wmsInventoryDOList,
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                pageInfo.getTotal(),
                pageInfo.getPages());
    }
}
