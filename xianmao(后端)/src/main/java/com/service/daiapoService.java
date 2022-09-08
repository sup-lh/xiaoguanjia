package com.service;

import com.alibaba.fastjson.JSONObject;
import com.domain.daipao;
import com.domain.daipaoExample;
import com.mapper.daipaoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class daiapoService {

    @Resource
    private daipaoMapper daipaoMapper;

    public int insert(JSONObject jsonObject){
        daipao daipao = new daipao();
        daipao.setWechat(jsonObject.getString("wechat"));
        daipao.setKm(jsonObject.getString("km"));
        int insert = daipaoMapper.insert(daipao);
        return insert;
    }

    public List<daipao> select(){
        daipaoExample daipaoExample = new daipaoExample();
        com.domain.daipaoExample.Criteria criteria = daipaoExample.createCriteria();
        criteria.andIdIsNotNull();
        List<daipao> daipaos = daipaoMapper.selectByExample(daipaoExample);

        return daipaos;
    }

    public String select_id(Long id){
        daipao daipao = daipaoMapper.selectByPrimaryKey(id);

        delete(id);

        return daipao.getWechat();
    }

    public void delete(Long id){

        daipaoMapper.deleteByPrimaryKey(id);

    }
}
