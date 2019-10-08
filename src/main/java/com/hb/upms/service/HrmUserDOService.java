package com.hb.upms.service;

import com.hb.upms.common.PageTable;
import com.hb.upms.model.HrmUserDO;
import com.hb.upms.model.HrmUserDOExample;

import java.util.List;

public interface HrmUserDOService {


    HrmUserDO selectByPrimaryKey(Integer id);

    int insertSelective(HrmUserDO record);

    int updateByPrimaryKeySelective(HrmUserDO record);

    HrmUserDO login(String username, String password);

    PageTable selectByExamplewithPage(int page, int pageSize, HrmUserDOExample example);
}


