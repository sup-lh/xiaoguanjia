package com.service;

import com.alibaba.fastjson.JSONObject;
import com.domain.numOfSingle;
import com.domain.single;
import com.domain.singleExample;
import com.domain.user;
import com.mapper.numOfSingleMapper;
import com.mapper.singleMapper;
import com.req.singleReq;
import com.resp.singleResp;
import com.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.awt.geom.AreaOp;
import com.suplin.demo.resp.CommonResp;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@Service
public class singleService {

    @Resource
    private singleMapper singleMapper;
    @Autowired
    private numOfSingleMapper numOfSingleMapper;



    public int insert(JSONObject jsonObject){
        single single = new single();

        single.setPhone(jsonObject.getString("phone"));
        single.setSex(jsonObject.getString("sex"));
        single.setWechat(jsonObject.getString("wechat"));
        single.setWish(jsonObject.getString("wish"));
        List shengshiqu = (List)jsonObject.get("shengshiqu");
        single.setTimestamp(jsonObject.getString("timestamp"));
        single.setPic("null");


        single.setRegion(shengshiqu.get(0).toString()+shengshiqu.get(1).toString()+shengshiqu.get(2).toString());

        try {
            int insert = singleMapper.insert(single);

            String sex = jsonObject.getString("sex");
            // 更新总数
            if (sex.equals("男")){
                numOfSingle numOfSingle = numOfSingleMapper.selectByPrimaryKey((long)1);
                Long num = numOfSingle.getNum();
                num += 1;
                com.domain.numOfSingle numof = new numOfSingle();
                numof.setNum(num);
                numof.setId((long)1);
                numOfSingleMapper.updateByPrimaryKeySelective(numof);
            }else if(sex.equals("女")){
                numOfSingle numOfSingle = numOfSingleMapper.selectByPrimaryKey((long)2);
                Long num = numOfSingle.getNum();
                num += 1;
                com.domain.numOfSingle numof = new numOfSingle();
                numof.setNum(num);
                numof.setId((long)2);
                numOfSingleMapper.updateByPrimaryKeySelective(numof);
            }


            return insert;
        }catch (Exception e){
            System.out.println(e);
            return 0;
        }

    }

    public singleResp select(Object index ){
        Long num=null;


        if ((int) index == 0){
            //获取男生总数
            numOfSingle numOfSingle = numOfSingleMapper.selectByPrimaryKey((long)1);
            num = numOfSingle.getNum();

            //获取随机值
            int end= num.intValue();
            int number = new Random().nextInt(end) ;


            //获取男生列表
            singleExample singleExample = new singleExample();
            com.domain.singleExample.Criteria criteria = singleExample.createCriteria();
            criteria.andSexEqualTo("男");
            List<single> singles = singleMapper.selectByExample(singleExample);
            single single = singles.get(number);

            //复制成返回数据
            singleResp copy = CopyUtil.copy(single, singleResp.class);

//            //删除该条数据
//            singleMapper.deleteByPrimaryKey(single.getId());
//
//            //修改男生总数
//            numOfSingle.setNum(num-1);
//            numOfSingleMapper.updateByPrimaryKeySelective(numOfSingle);

            //返回
            return copy;


        }else {
            //获取男生总数
            numOfSingle numOfSingle = numOfSingleMapper.selectByPrimaryKey((long)2);
            num = numOfSingle.getNum();

            //获取随机值
            int end= num.intValue();
            int number = new Random().nextInt(end);

            //获取男生列表
            singleExample singleExample = new singleExample();
            com.domain.singleExample.Criteria criteria = singleExample.createCriteria();
            criteria.andSexEqualTo("女");
            List<single> singles = singleMapper.selectByExample(singleExample);
            single single = singles.get(number);

            //复制成返回数据
            singleResp copy = CopyUtil.copy(single, singleResp.class);
//
//            //删除该条数据
//            singleMapper.deleteByPrimaryKey(single.getId());
//
//            //修改男生总数
//            numOfSingle.setNum(num-1);
//            numOfSingleMapper.updateByPrimaryKeySelective(numOfSingle);

            //返回
            return copy;

        }


    }

    public String selecthave(Object index ){



        if ((int) index == 0){
            try {
                numOfSingle numOfSingle = numOfSingleMapper.selectByPrimaryKey((long)1);
                if (numOfSingle.getNum() > 0){
                    return "有数据";
                }else {
                    return "无数据";
                }
            }catch (Exception e){
                return "无数据";

            }

        }else {
            try {
                numOfSingle numOfSingle = numOfSingleMapper.selectByPrimaryKey((long)2);
                if (numOfSingle.getNum() > 0){
                    return "有数据";
                }else {
                    return "无数据";
                }
            }catch (Exception e){
                return "无数据";

            }
        }



    }

    public CommonResp<List<single>> admin_toufang(){

        singleExample singleExample = new singleExample();
        singleExample.createCriteria().andIdIsNotNull();
        singleExample.setOrderByClause("timestamp desc");
        List<single> singles = singleMapper.selectByExample(singleExample);

        CommonResp<List<single>> singleCommonResp = new CommonResp<>();

        singleCommonResp.setContent(singles);
        return singleCommonResp;

    }


    public String selectpic(String timestamp){
        singleExample singleExample = new singleExample();
        singleExample.createCriteria().andTimestampEqualTo(timestamp);

        List<single> singles = singleMapper.selectByExample(singleExample);
        String pic = singles.get(0).getPic();
        return pic;

    }

    public void change_pic(Long id){
        single single = new single();
        single.setPic("null");
        single.setId(id);
        singleMapper.updateByPrimaryKeySelective(single);

    }

    public void delete(Long id){
        singleExample singleExample = new singleExample();
        singleExample.createCriteria().andIdEqualTo(id);

        int i = singleMapper.deleteByPrimaryKey(id);

        single single = singleMapper.selectByPrimaryKey(id);
        String sex = single.getSex();
        if (i>0){

            // 更新总数
            if (sex.equals("男")){
                numOfSingle numOfSingle = numOfSingleMapper.selectByPrimaryKey((long)1);
                Long num = numOfSingle.getNum();
                num -= 1;
                com.domain.numOfSingle numof = new numOfSingle();
                numof.setNum(num);
                numof.setId((long)1);
                numOfSingleMapper.updateByPrimaryKeySelective(numof);
            }else if(sex.equals("女")){
                numOfSingle numOfSingle = numOfSingleMapper.selectByPrimaryKey((long)2);
                Long num = numOfSingle.getNum();
                num -= 1;
                com.domain.numOfSingle numof = new numOfSingle();
                numof.setNum(num);
                numof.setId((long)2);
                numOfSingleMapper.updateByPrimaryKeySelective(numof);
            }

        }




    }
}
