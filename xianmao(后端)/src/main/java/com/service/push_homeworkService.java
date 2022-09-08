package com.service;

import com.domain.push_homework;
import com.domain.push_homeworkExample;
import com.domain.works;
import com.domain.worksExample;
import com.mapper.push_homeworkMapper;
import com.mapper.worksMapper;
import com.resp.commit_flag;
import com.resp.gain_commit_page;
import com.resp.gain_homework;
import com.resp.mypush;
import com.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class push_homeworkService {
    @Resource
    private push_homework push_homework;
    @Resource
    private push_homeworkMapper push_homeworkMapper;


    @Resource
    private worksMapper worksMapper;

    public boolean insert(String schoolname,String classname,String username,String phone,String homework,Integer money,String worktime,String workname,String push_openid){

        push_homework.setSchoolname(schoolname);
        push_homework.setClassname(classname);
        push_homework.setUsername(username);
        push_homework.setPhone(phone);
        push_homework.setHomework(homework);
        push_homework.setMoney(money);
        push_homework.setWorktime(worktime);
        push_homework.setWorkname(workname);
        push_homework.setPushopenid(push_openid);
        push_homework.setFlag(0);

        int row = push_homeworkMapper.insert(push_homework);
        if (row != 0 ){
            return true;
        }else {
            return false;
        }


    }


    public int insert_gainopenid(Long id,String gain_openid){

        push_homework push_homework = push_homeworkMapper.selectByPrimaryKey(id);
        String pushOpenid = push_homework.getPushopenid();
        works works = new works();
        works.setPushOpenid(pushOpenid);
        works.setGainOpenid(gain_openid);
        works.setPushId(id);
        works.setCommitFlag("false");
        int i = worksMapper.insertSelective(works);
        return i;

    }

    public int commited(Long id,String gain_openid){

        worksExample worksExample = new worksExample();
        com.domain.worksExample.Criteria criteria = worksExample.createCriteria();

        if (!ObjectUtils.isEmpty(gain_openid)) {
            criteria.andGainOpenidLike("%" + gain_openid + "%");
        }

        if (!ObjectUtils.isEmpty(gain_openid)) {
            criteria.andPushIdEqualTo(id);
        }

        works works = new works();
        works.setCommitFlag("true");

        int i = worksMapper.updateByExampleSelective(works, worksExample);
        return i;
    }

    public String ifcommited(Long id,String gain_openid){
        worksExample worksExample = new worksExample();
        com.domain.worksExample.Criteria criteria = worksExample.createCriteria();
        if (!ObjectUtils.isEmpty(gain_openid)) {
            criteria.andGainOpenidEqualTo(gain_openid);
        }
        if (!ObjectUtils.isEmpty(gain_openid)) {
            criteria.andPushIdEqualTo(id);
        }
        List<works> works = worksMapper.selectByExample(worksExample);
        works w = works.get(0);
        String commitFlag = w.getCommitFlag();
        return commitFlag;
    }

    public List<mypush> mypush(String push_openid){
        push_homeworkExample push_homeworkExample = new push_homeworkExample();
        com.domain.push_homeworkExample.Criteria criteria = push_homeworkExample.createCriteria();
        if (!ObjectUtils.isEmpty(push_openid)){
            criteria.andpushopenidEqualTo(push_openid);
        }
        List<push_homework> push_homeworks = push_homeworkMapper.selectByExampleWithBLOBs(push_homeworkExample);

        List<mypush> mypushes = CopyUtil.copyList(push_homeworks, mypush.class);

        return mypushes;
    }

    public List<works> select(Long id){
        worksExample worksExample = new worksExample();
        com.domain.worksExample.Criteria criteria = worksExample.createCriteria();
        if (!ObjectUtils.isEmpty(id)){
            criteria.andPushIdEqualTo(id);
        }

        List<works> workses = worksMapper.selectByExample(worksExample);

        return workses;




    }



    public int insertzhifubao(String zhifubao ,Long id){

        works works = new works();
        works.setZhifubao(zhifubao);
        works.setPushId(id);

        worksExample worksExample = new worksExample();

        int i = worksMapper.updateByExampleSelective(works,worksExample);

        return i;




    }


    public int update(Long id){

        com.domain.push_homework push_homework = new push_homework();
        push_homework.setFlag(1);
        push_homeworkExample push_homeworkExample = new push_homeworkExample();
        push_homeworkExample.createCriteria().andIdEqualTo(id);

        int i = push_homeworkMapper.updateByExampleSelective(push_homework,push_homeworkExample );


        return i;
    }
}
