package com.hb.upms.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hb.upms.common.PageTable;
import com.hb.upms.controller.dto.DeliveryOrderDTO;
import com.hb.upms.mapper.DeliveryOrderDOMapper;
import com.hb.upms.mapper.PmsRawMaterialInfoDOMapper;
import com.hb.upms.model.DeliveryOrderDO;
import com.hb.upms.model.DeliveryOrderDOExample;
import com.hb.upms.model.PmsRawMaterialInfoDO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class DeliveryOrderDOService{

    @Resource
    private DeliveryOrderDOMapper deliveryOrderDOMapper;

    @Resource
    private PmsRawMaterialInfoDOMapper pmsRawMaterialInfoDOMapper;
    
    public long countByExample(DeliveryOrderDOExample example) {
        return deliveryOrderDOMapper.countByExample(example);
    }

    
    public int deleteByExample(DeliveryOrderDOExample example) {
        return deliveryOrderDOMapper.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer deliveryOrderId) {
        return deliveryOrderDOMapper.deleteByPrimaryKey(deliveryOrderId);
    }

    
    public int insert(DeliveryOrderDO record) {
        return deliveryOrderDOMapper.insert(record);
    }

    
    public int insertSelective(DeliveryOrderDO record) {
        return deliveryOrderDOMapper.insertSelective(record);
    }

    
    public List<DeliveryOrderDO> selectByExample(DeliveryOrderDOExample example) {
        return deliveryOrderDOMapper.selectByExample(example);
    }

    
    public DeliveryOrderDO selectByPrimaryKey(Integer deliveryOrderId) {
        return deliveryOrderDOMapper.selectByPrimaryKey(deliveryOrderId);
    }

    
    public int updateByExampleSelective(DeliveryOrderDO record,DeliveryOrderDOExample example) {
        return deliveryOrderDOMapper.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(DeliveryOrderDO record,DeliveryOrderDOExample example) {
        return deliveryOrderDOMapper.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(DeliveryOrderDO record) {
        return deliveryOrderDOMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(DeliveryOrderDO record) {
        return deliveryOrderDOMapper.updateByPrimaryKey(record);
    }




    public PageTable selectByExamplewithPage(int page, int pageSize, DeliveryOrderDOExample example) {
        // 默认的查询行为
        if (example == null) {
            example = new DeliveryOrderDOExample();
            DeliveryOrderDOExample.Criteria criteria = example.createCriteria();
            // 默认按id升序排
            example.setOrderByClause("delivery_order_id asc");
        }

        PageHelper.startPage(page, pageSize);
        // 分页查询，上面跟着一个PageHelper.startPage方法

        //查找采购单表格的所有行
        List<DeliveryOrderDO> deliveryOrderDOList = deliveryOrderDOMapper.selectByExample(example);

        /*G：☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆如何使用多表查询数据?☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆*/

        //定义一个采购单和原料单结合的dto的list
        List<DeliveryOrderDTO> list = new ArrayList<>();
        //定义一个dto对象
        DeliveryOrderDTO deliveryOrderDTO;
        //定义一个原料对象
        PmsRawMaterialInfoDO pmsRawMaterialInfoDO ;


        for(int i=0;i<deliveryOrderDOList.size();i++) {

            deliveryOrderDTO = new DeliveryOrderDTO();
            //把pmsPurchaseApplicationToCompleteDOList.get(i)赋值给pmsPurchaseApplicationToCompleteDTO
            BeanUtils.copyProperties(deliveryOrderDOList.get(i), deliveryOrderDTO);//现在pmsPurchaseApplicationToCompleteDTO对象中已经存有所有的数据库内数据字段
            //根据get到的id获取该行的数据，并放在pmsRawMaterialInfoDO对象中
            pmsRawMaterialInfoDO = pmsRawMaterialInfoDOMapper.selectByPrimaryKey(Integer.parseInt(deliveryOrderDTO.getMaterialId()));//
            //在上面获取的整行数据中，只需getProductName即可，得到物料名的值
            //BeanUtils.copyProperties(pmsRawMaterialInfoDO, pmsPurchaseApplicationToCompleteDTO);  //赋值所有字段
            deliveryOrderDTO.setProductName(pmsRawMaterialInfoDO.getProductName());
            //if (deliveryOrderDTO.getStatus() == 0){       //G：自行添加：前台只显示数据库中状态为0的记录
                // 再将得到的dto添加到list中
                list.add(deliveryOrderDTO);
            //}
        }


        /*PageInfo<PmsPurchaseApplicationToCompleteDO> pageInfo = new PageInfo<>(pmsPurchaseApplicationToCompleteDOList);*/

        PageInfo<DeliveryOrderDO> pageInfo = new PageInfo<>(deliveryOrderDOList);

        return new PageTable(
                list,
                pageInfo.getPageNum(),   //页数标号
                pageInfo.getPageSize(),  //当前页面页数
                /*pageInfo.getTotal(), //当前页面记录条数*/
                list.size(),
                pageInfo.getPages());   //规定每页显示条数
    }







}
