package com.hb.upms.mapper;

import com.hb.upms.model.CommodityStockOutDO;
import com.hb.upms.model.CommodityStockOutDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2019/09/15
*/
@Mapper
public interface CommodityStockOutDOMapper {
    long countByExample(CommodityStockOutDOExample example);

    int deleteByExample(CommodityStockOutDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommodityStockOutDO record);

    int insertSelective(CommodityStockOutDO record);

    List<CommodityStockOutDO> selectByExample(CommodityStockOutDOExample example);

    CommodityStockOutDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommodityStockOutDO record, @Param("example") CommodityStockOutDOExample example);

    int updateByExample(@Param("record") CommodityStockOutDO record, @Param("example") CommodityStockOutDOExample example);

    int updateByPrimaryKeySelective(CommodityStockOutDO record);

    int updateByPrimaryKey(CommodityStockOutDO record);
}