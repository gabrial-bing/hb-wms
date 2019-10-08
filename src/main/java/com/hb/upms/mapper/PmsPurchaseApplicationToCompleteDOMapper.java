package com.hb.upms.mapper;

import com.hb.upms.model.PmsPurchaseApplicationToCompleteDO;
import com.hb.upms.model.PmsPurchaseApplicationToCompleteDOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by Mybatis Generator 2019/08/18
*/
@Mapper
public interface PmsPurchaseApplicationToCompleteDOMapper {
    long countByExample(PmsPurchaseApplicationToCompleteDOExample example);

    int deleteByExample(PmsPurchaseApplicationToCompleteDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsPurchaseApplicationToCompleteDO record);

    int insertSelective(PmsPurchaseApplicationToCompleteDO record);

    List<PmsPurchaseApplicationToCompleteDO> selectByExample(PmsPurchaseApplicationToCompleteDOExample example);

    PmsPurchaseApplicationToCompleteDO  selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsPurchaseApplicationToCompleteDO record, @Param("example") PmsPurchaseApplicationToCompleteDOExample example);

    int updateByExample(@Param("record") PmsPurchaseApplicationToCompleteDO record, @Param("example") PmsPurchaseApplicationToCompleteDOExample example);

    int updateByPrimaryKeySelective(PmsPurchaseApplicationToCompleteDO record);

    int updateByPrimaryKey(PmsPurchaseApplicationToCompleteDO record);
}