package com.hb.upms.mapper;

import com.hb.upms.model.DeliveryOrderDO;
import com.hb.upms.model.DeliveryOrderDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeliveryOrderDOMapper {
    long countByExample(DeliveryOrderDOExample example);

    int deleteByExample(DeliveryOrderDOExample example);

    int deleteByPrimaryKey(Integer deliveryOrderId);

    int insert(DeliveryOrderDO record);

    int insertSelective(DeliveryOrderDO record);

    List<DeliveryOrderDO> selectByExample(DeliveryOrderDOExample example);

    DeliveryOrderDO selectByPrimaryKey(Integer deliveryOrderId);

    int updateByExampleSelective(@Param("record") DeliveryOrderDO record, @Param("example") DeliveryOrderDOExample example);

    int updateByExample(@Param("record") DeliveryOrderDO record, @Param("example") DeliveryOrderDOExample example);

    int updateByPrimaryKeySelective(DeliveryOrderDO record);

    int updateByPrimaryKey(DeliveryOrderDO record);
}