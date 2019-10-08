package com.hb.upms.mapper;

import com.hb.upms.model.CommodityStoresListDO;
import com.hb.upms.model.CommodityStoresListDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2019/09/15
*/
@Mapper
public interface CommodityStoresListDOMapper {
    long countByExample(CommodityStoresListDOExample example);

    int deleteByExample(CommodityStoresListDOExample example);

    int deleteByPrimaryKey(Integer commodityInventoryId);

    int insert(CommodityStoresListDO record);

    int insertSelective(CommodityStoresListDO record);

    List<CommodityStoresListDO> selectByExample(CommodityStoresListDOExample example);

    CommodityStoresListDO selectByPrimaryKey(Integer commodityInventoryId);

    int updateByExampleSelective(@Param("record") CommodityStoresListDO record, @Param("example") CommodityStoresListDOExample example);

    int updateByExample(@Param("record") CommodityStoresListDO record, @Param("example") CommodityStoresListDOExample example);

    int updateByPrimaryKeySelective(CommodityStoresListDO record);

    int updateByPrimaryKey(CommodityStoresListDO record);
}