package com.hb.upms.mapper;

import com.hb.upms.model.WmsMaterialDetailDO;
import com.hb.upms.model.WmsMaterialDetailDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2019/08/20
*/
@Mapper
public interface WmsMaterialDetailDOMapper {
    long countByExample(WmsMaterialDetailDOExample example);

    int deleteByExample(WmsMaterialDetailDOExample example);

    int deleteByPrimaryKey(Integer materialId);

    int insert(WmsMaterialDetailDO record);

    int insertSelective(WmsMaterialDetailDO record);

    List<WmsMaterialDetailDO> selectByExample(WmsMaterialDetailDOExample example);

    WmsMaterialDetailDO selectByPrimaryKey(Integer materialId);

    int updateByExampleSelective(@Param("record") WmsMaterialDetailDO record, @Param("example") WmsMaterialDetailDOExample example);

    int updateByExample(@Param("record") WmsMaterialDetailDO record, @Param("example") WmsMaterialDetailDOExample example);

    int updateByPrimaryKeySelective(WmsMaterialDetailDO record);

    int updateByPrimaryKey(WmsMaterialDetailDO record);
}