package com.hb.upms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hb.upms.common.PageTable;
import com.hb.upms.controller.dto.PmsPurchaseApplicationToCompleteDTO;
import com.hb.upms.mapper.PmsPurchaseApplicationToCompleteDOMapper;
import com.hb.upms.mapper.PmsRawMaterialInfoDOMapper;
import com.hb.upms.model.PmsPurchaseApplicationToCompleteDO;
import com.hb.upms.model.PmsPurchaseApplicationToCompleteDOExample;
import com.hb.upms.model.PmsRawMaterialInfoDO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PmsPurchaseApplicationToCompleteDOService{

    @Resource
    private PmsPurchaseApplicationToCompleteDOMapper pmsPurchaseApplicationToCompleteDOMapper;
    @Resource
    private PmsRawMaterialInfoDOMapper pmsRawMaterialInfoDOMapper;



    public long countByExample(PmsPurchaseApplicationToCompleteDOExample example){
        return pmsPurchaseApplicationToCompleteDOMapper.countByExample(example);
    }

    public int deleteByExample(PmsPurchaseApplicationToCompleteDOExample example){
        return pmsPurchaseApplicationToCompleteDOMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id){
        return pmsPurchaseApplicationToCompleteDOMapper.deleteByPrimaryKey(id);
    }

    public int insert(PmsPurchaseApplicationToCompleteDO record){
        return pmsPurchaseApplicationToCompleteDOMapper.insert(record);
    }

    public int insertSelective(PmsPurchaseApplicationToCompleteDO record){
        return pmsPurchaseApplicationToCompleteDOMapper.insertSelective(record);
    }

    public List<PmsPurchaseApplicationToCompleteDO> selectByExample(PmsPurchaseApplicationToCompleteDOExample example){
        return pmsPurchaseApplicationToCompleteDOMapper.selectByExample(example);
    }

    public PmsPurchaseApplicationToCompleteDTO selectByPrimaryKey(Integer id){
        PmsPurchaseApplicationToCompleteDO pmsPurchaseApplicationToCompleteDO;//定义一个DO的对象
        PmsPurchaseApplicationToCompleteDTO pmsPurchaseApplicationToCompleteDTO = new PmsPurchaseApplicationToCompleteDTO();
        pmsPurchaseApplicationToCompleteDO = pmsPurchaseApplicationToCompleteDOMapper.selectByPrimaryKey(id);
        BeanUtils.copyProperties(pmsPurchaseApplicationToCompleteDO,pmsPurchaseApplicationToCompleteDTO);
        PmsRawMaterialInfoDO pmsRawMaterialInfoDO;
        pmsRawMaterialInfoDO = pmsRawMaterialInfoDOMapper.selectByPrimaryKey(pmsPurchaseApplicationToCompleteDTO.getRawMatrialId());
        pmsPurchaseApplicationToCompleteDTO.setProductName(pmsRawMaterialInfoDO.getProductName());

        return pmsPurchaseApplicationToCompleteDTO;
    }

    public int updateByExampleSelective(PmsPurchaseApplicationToCompleteDO record,PmsPurchaseApplicationToCompleteDOExample example){
        return pmsPurchaseApplicationToCompleteDOMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(PmsPurchaseApplicationToCompleteDO record,PmsPurchaseApplicationToCompleteDOExample example){
        return pmsPurchaseApplicationToCompleteDOMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(PmsPurchaseApplicationToCompleteDO record){
        return pmsPurchaseApplicationToCompleteDOMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(PmsPurchaseApplicationToCompleteDO record){
        return pmsPurchaseApplicationToCompleteDOMapper.updateByPrimaryKey(record);
    }

    //  @Override   //G:去掉就可以了，因为已经没有接口文件了
    public PageTable selectByExamplewithPage(int page, int pageSize, PmsPurchaseApplicationToCompleteDOExample example) {
        // 默认的查询行为
        if (example == null) {
            example = new PmsPurchaseApplicationToCompleteDOExample();
            PmsPurchaseApplicationToCompleteDOExample.Criteria criteria = example.createCriteria();
            // 默认按id升序排
            example.setOrderByClause("id asc");
        }

        PageHelper.startPage(page, pageSize);
        // 分页查询，上面跟着一个PageHelper.startPage方法

        //查找采购单表格的所有行
        List<PmsPurchaseApplicationToCompleteDO> pmsPurchaseApplicationToCompleteDOList = pmsPurchaseApplicationToCompleteDOMapper.selectByExample(example);

       /*G：☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆如何使用多表查询数据?☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆*/

        //定义一个采购单和原料单结合的dto的list
        List<PmsPurchaseApplicationToCompleteDTO> list = new ArrayList<>();
        //定义一个dto对象
        PmsPurchaseApplicationToCompleteDTO pmsPurchaseApplicationToCompleteDTO;
        //定义一个原料对象
        PmsRawMaterialInfoDO pmsRawMaterialInfoDO;


        for(int i=0;i<pmsPurchaseApplicationToCompleteDOList.size();i++) {

            pmsPurchaseApplicationToCompleteDTO = new PmsPurchaseApplicationToCompleteDTO();
            //把pmsPurchaseApplicationToCompleteDOList.get(i)赋值给pmsPurchaseApplicationToCompleteDTO
            BeanUtils.copyProperties(pmsPurchaseApplicationToCompleteDOList.get(i), pmsPurchaseApplicationToCompleteDTO);//现在pmsPurchaseApplicationToCompleteDTO对象中已经存有所有的数据库内数据字段
            //根据get到的id获取该行的数据，并放在pmsRawMaterialInfoDO对象中
            pmsRawMaterialInfoDO = pmsRawMaterialInfoDOMapper.selectByPrimaryKey(pmsPurchaseApplicationToCompleteDTO.getRawMatrialId());
            //在上面获取的整行数据中，只需getProductName即可，得到物料名的值
            //BeanUtils.copyProperties(pmsRawMaterialInfoDO, pmsPurchaseApplicationToCompleteDTO);  //赋值所有字段
            pmsPurchaseApplicationToCompleteDTO.setProductName(pmsRawMaterialInfoDO.getProductName());
            if (pmsPurchaseApplicationToCompleteDTO.getStatus() == 0){       //G：自行添加：前台只显示数据库中状态为0的记录
            // 再将得到的dto添加到list中
            list.add(pmsPurchaseApplicationToCompleteDTO);
            }
        }


        /*PageInfo<PmsPurchaseApplicationToCompleteDO> pageInfo = new PageInfo<>(pmsPurchaseApplicationToCompleteDOList);*/

        PageInfo<PmsPurchaseApplicationToCompleteDO> pageInfo = new PageInfo<>(pmsPurchaseApplicationToCompleteDOList);

        return new PageTable(
                list,
                pageInfo.getPageNum(),   //页数标号
                pageInfo.getPageSize(),  //当前页面页数
                /*pageInfo.getTotal(), //当前页面记录条数*/
                list.size(),
                pageInfo.getPages());   //规定每页显示条数
    }

}
