package com.hb.upms.mapper;

import com.hb.upms.model.WmsInventoryDO;
import com.hb.upms.model.WmsInventoryDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WmsInventoryDOMapper {
    long countByExample(WmsInventoryDOExample example);

    int deleteByExample(WmsInventoryDOExample example);

    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(WmsInventoryDO record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(WmsInventoryDO record);

    List<WmsInventoryDO> selectByExample(WmsInventoryDOExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    WmsInventoryDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WmsInventoryDO record, @Param("example") WmsInventoryDOExample example);

    int updateByExample(@Param("record") WmsInventoryDO record, @Param("example") WmsInventoryDOExample example);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(WmsInventoryDO record);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(WmsInventoryDO record);
}