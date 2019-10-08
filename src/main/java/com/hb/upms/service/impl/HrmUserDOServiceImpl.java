package com.hb.upms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hb.upms.common.PageTable;
import com.hb.upms.model.HrmUserDO;
import com.hb.upms.model.HrmUserDOExample;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hb.upms.mapper.HrmUserDOMapper;
import com.hb.upms.service.HrmUserDOService;

import java.util.List;

@Service
public class HrmUserDOServiceImpl implements HrmUserDOService {

    @Resource
    private HrmUserDOMapper hrmUserDOMapper;

    @Override
    public HrmUserDO selectByPrimaryKey(Integer id) {
        return hrmUserDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertSelective(HrmUserDO record) {
        return hrmUserDOMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(HrmUserDO record) {
        return hrmUserDOMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public HrmUserDO login(String username, String password) {
        return hrmUserDOMapper.findOneByUsernameAndPassword(username, password);
    }

    @Override
    public PageTable selectByExamplewithPage(int page, int pageSize, HrmUserDOExample example) {
        // 默认的查询行为
        if (example == null) {
            example = new HrmUserDOExample();
            HrmUserDOExample.Criteria criteria = example.createCriteria();
            // 默认按id升序排
            example.setOrderByClause("id asc");
        }

        PageHelper.startPage(page, pageSize);
        // 分页查询，上面跟着一个PageHelper.startPage方法
        List<HrmUserDO> hrmUserDOList = hrmUserDOMapper.selectByExample(example);
        PageInfo<HrmUserDO> pageInfo = new PageInfo<>(hrmUserDOList);

        return new PageTable(
                hrmUserDOList,
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                pageInfo.getTotal(),
                pageInfo.getPages());
    }
}


