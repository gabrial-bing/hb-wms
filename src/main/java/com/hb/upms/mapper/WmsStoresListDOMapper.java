package com.hb.upms.mapper;

import com.hb.upms.model.WmsStoresListDO;
import com.hb.upms.model.WmsStoresListDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Mybatis Generator 2019/09/14
 */
@Mapper
public interface WmsStoresListDOMapper {
    long countByExample(WmsStoresListDOExample example);

    int deleteByExample(WmsStoresListDOExample example);

    int deleteByPrimaryKey(Integer inventoryId);

    int insert(WmsStoresListDO record);

    int insertSelective(WmsStoresListDO record);

    List<WmsStoresListDO> selectByExample(WmsStoresListDOExample example);

    WmsStoresListDO selectByPrimaryKey(Integer inventoryId);

    int updateByExampleSelective(@Param("record") WmsStoresListDO record, @Param("example") WmsStoresListDOExample example);

    int updateByExample(@Param("record") WmsStoresListDO record, @Param("example") WmsStoresListDOExample example);

    int updateByPrimaryKeySelective(WmsStoresListDO record);

    int updateByPrimaryKey(WmsStoresListDO record);

    /* G：查询物料ID，以便于改变相同物料ID值数量*/
    WmsStoresListDO selectByMaterialKey(Integer materialId);
}