package com.hb.upms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.hb.upms.mapper.PmsRawMaterialInfoDOMapper;
import com.hb.upms.model.PmsRawMaterialInfoDOExample;
import com.hb.upms.model.PmsRawMaterialInfoDO;

@Service
public class PmsRawMaterialInfoDOService{

    @Resource
    private PmsRawMaterialInfoDOMapper pmsRawMaterialInfoDOMapper;

    public long countByExample(PmsRawMaterialInfoDOExample example){
        return pmsRawMaterialInfoDOMapper.countByExample(example);
    }

    public int deleteByExample(PmsRawMaterialInfoDOExample example){
        return pmsRawMaterialInfoDOMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id){
        return pmsRawMaterialInfoDOMapper.deleteByPrimaryKey(id);
    }

    public int insert(PmsRawMaterialInfoDO record){
        return pmsRawMaterialInfoDOMapper.insert(record);
    }

    public int insertSelective(PmsRawMaterialInfoDO record){
        return pmsRawMaterialInfoDOMapper.insertSelective(record);
    }

    public List<PmsRawMaterialInfoDO> selectByExample(PmsRawMaterialInfoDOExample example){
        return pmsRawMaterialInfoDOMapper.selectByExample(example);
    }

    public PmsRawMaterialInfoDO selectByPrimaryKey(Integer id){
        return pmsRawMaterialInfoDOMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(PmsRawMaterialInfoDO record,PmsRawMaterialInfoDOExample example){
        return pmsRawMaterialInfoDOMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(PmsRawMaterialInfoDO record,PmsRawMaterialInfoDOExample example){
        return pmsRawMaterialInfoDOMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(PmsRawMaterialInfoDO record){
        return pmsRawMaterialInfoDOMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(PmsRawMaterialInfoDO record){
        return pmsRawMaterialInfoDOMapper.updateByPrimaryKey(record);
    }

}
