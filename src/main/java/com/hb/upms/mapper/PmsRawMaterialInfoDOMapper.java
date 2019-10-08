package com.hb.upms.mapper;

import com.hb.upms.model.PmsRawMaterialInfoDO;
import com.hb.upms.model.PmsRawMaterialInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2019/09/11
*/
@Mapper
public interface PmsRawMaterialInfoDOMapper {
    long countByExample(PmsRawMaterialInfoDOExample example);

    int deleteByExample(PmsRawMaterialInfoDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsRawMaterialInfoDO record);

    int insertSelective(PmsRawMaterialInfoDO record);

    List<PmsRawMaterialInfoDO> selectByExample(PmsRawMaterialInfoDOExample example);

    PmsRawMaterialInfoDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsRawMaterialInfoDO record, @Param("example") PmsRawMaterialInfoDOExample example);

    int updateByExample(@Param("record") PmsRawMaterialInfoDO record, @Param("example") PmsRawMaterialInfoDOExample example);

    int updateByPrimaryKeySelective(PmsRawMaterialInfoDO record);

    int updateByPrimaryKey(PmsRawMaterialInfoDO record);
}