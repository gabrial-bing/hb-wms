package com.hb.upms.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.hb.upms.model.WmsMaterialDetailDO;
import com.hb.upms.model.WmsMaterialDetailDOExample;
import com.hb.upms.mapper.WmsMaterialDetailDOMapper;

@Service
public class WmsMaterialDetailDOService{

    @Resource
    private WmsMaterialDetailDOMapper wmsMaterialDetailDOMapper;

    public long countByExample(WmsMaterialDetailDOExample example){
        return wmsMaterialDetailDOMapper.countByExample(example);
    }

    public int deleteByExample(WmsMaterialDetailDOExample example){
        return wmsMaterialDetailDOMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer materialId){
        return wmsMaterialDetailDOMapper.deleteByPrimaryKey(materialId);
    }

    public int insert(WmsMaterialDetailDO record){
        return wmsMaterialDetailDOMapper.insert(record);
    }

    public int insertSelective(WmsMaterialDetailDO record){
        return wmsMaterialDetailDOMapper.insertSelective(record);
    }

    public List<WmsMaterialDetailDO> selectByExample(WmsMaterialDetailDOExample example){
        return wmsMaterialDetailDOMapper.selectByExample(example);
    }

    public WmsMaterialDetailDO selectByPrimaryKey(Integer materialId){
        return wmsMaterialDetailDOMapper.selectByPrimaryKey(materialId);
    }

    public int updateByExampleSelective(WmsMaterialDetailDO record,WmsMaterialDetailDOExample example){
        return wmsMaterialDetailDOMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(WmsMaterialDetailDO record,WmsMaterialDetailDOExample example){
        return wmsMaterialDetailDOMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(WmsMaterialDetailDO record){
        return wmsMaterialDetailDOMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WmsMaterialDetailDO record){
        return wmsMaterialDetailDOMapper.updateByPrimaryKey(record);
    }

}
