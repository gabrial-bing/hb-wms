package com.hb.upms.service;

import com.hb.upms.common.PageTable;
import com.hb.upms.model.WmsInventoryDO;
import com.hb.upms.model.WmsInventoryDOExample;

import java.util.List;

public interface WmsInventoryDOService{


    long countByExample(WmsInventoryDOExample example);

    int deleteByExample(WmsInventoryDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WmsInventoryDO record);

    int insertSelective(WmsInventoryDO record);

    List<WmsInventoryDO> selectByExample(WmsInventoryDOExample example);

    WmsInventoryDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(WmsInventoryDO record,WmsInventoryDOExample example);

    int updateByExample(WmsInventoryDO record,WmsInventoryDOExample example);

    int updateByPrimaryKeySelective(WmsInventoryDO record);

    int updateByPrimaryKey(WmsInventoryDO record);

    PageTable selectByExamplewithPage(int page, int pageSize, WmsInventoryDOExample example);
}
