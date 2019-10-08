package com.hb.upms.mapper;

import com.hb.upms.model.HrmUserDO;
import com.hb.upms.model.HrmUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HrmUserDOMapper {
    long countByExample(HrmUserDOExample example);

    int deleteByExample(HrmUserDOExample example);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(HrmUserDO record);

    List<HrmUserDO> selectByExample(HrmUserDOExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    HrmUserDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HrmUserDO record, @Param("example") HrmUserDOExample example);

    int updateByExample(@Param("record") HrmUserDO record, @Param("example") HrmUserDOExample example);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(HrmUserDO record);

    HrmUserDO findOneByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}