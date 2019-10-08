package com.hb.upms.mapper;

import com.hb.upms.model.WmsStockInDO;
import com.hb.upms.model.WmsStockInDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Mybatis Generator 2019/09/04
 */
@Mapper
public interface WmsStockInDOMapper {
    long countByExample(WmsStockInDOExample example);

    int deleteByExample(WmsStockInDOExample example);

    int deleteByPrimaryKey(Integer stockInId);

    int insert(WmsStockInDO record);

    int insertSelective(WmsStockInDO record);

    List<WmsStockInDO> selectByExample(WmsStockInDOExample example);

    WmsStockInDO selectByPrimaryKey(Integer stockInId);

    int updateByExampleSelective(@Param("record") WmsStockInDO record, @Param("example") WmsStockInDOExample example);

    int updateByExample(@Param("record") WmsStockInDO record, @Param("example") WmsStockInDOExample example);

    int updateByPrimaryKeySelective(WmsStockInDO record);

    int updateByPrimaryKey(WmsStockInDO record);
}