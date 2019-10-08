package com.hb.upms.mapper;

import com.hb.upms.model.WmsStockOutDO;
import com.hb.upms.model.WmsStockOutDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2019/08/25
*/
@Mapper
public interface WmsStockOutDOMapper {
    long countByExample(WmsStockOutDOExample example);

    int deleteByExample(WmsStockOutDOExample example);

    int deleteByPrimaryKey(Integer stockOutId);

    int insert(WmsStockOutDO record);

    int insertSelective(WmsStockOutDO record);

    List<WmsStockOutDO> selectByExample(WmsStockOutDOExample example);

    WmsStockOutDO selectByPrimaryKey(Integer stockOutId);

    int updateByExampleSelective(@Param("record") WmsStockOutDO record, @Param("example") WmsStockOutDOExample example);

    int updateByExample(@Param("record") WmsStockOutDO record, @Param("example") WmsStockOutDOExample example);

    int updateByPrimaryKeySelective(WmsStockOutDO record);

    int updateByPrimaryKey(WmsStockOutDO record);
}