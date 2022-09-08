package com.service;

import com.domain.push_homework;
import com.domain.push_homeworkExample;
import com.domain.works;
import com.domain.worksExample;
import com.mapper.push_homeworkMapper;
import com.mapper.worksMapper;
import com.resp.gain_commit_page;
import com.resp.gain_homework;
import com.resp.gains;
import com.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class gain_homeworkService {

    @Resource
    private push_homeworkMapper push_homeworkMapper;


    @Resource
    private worksMapper worksMapper;


    public int select_works(Long id){


        worksExample worksExample = new worksExample();
        com.domain.worksExample.Criteria criteria = worksExample.createCriteria();


        if (!ObjectUtils.isEmpty(id)) {
            criteria.andPushIdEqualTo(id);
        }


        List<works> works = worksMapper.selectByExample(worksExample);

        int size = works.size();
        return size;

    }

    public List<gain_homework> select(String schoolname){
        push_homeworkExample gainWork = new push_homeworkExample();
        com.domain.push_homeworkExample.Criteria criteria = gainWork.createCriteria();

        if (!ObjectUtils.isEmpty(schoolname)) {
            criteria.andSchoolnameLike("%" + schoolname + "%");
        }

        List<push_homework> push_homeworks = push_homeworkMapper.selectByExample(gainWork);

        List<gain_homework> gain_list = CopyUtil.copyList(push_homeworks, gain_homework.class);

        return gain_list;

    }

    public String select_id(Long id){

        push_homework push_homework = push_homeworkMapper.selectByPrimaryKey(id);


        gain_homework copy = CopyUtil.copy(push_homework, gain_homework.class);

        String homework = copy.getHomework();
        return homework;

    }




    public List<gains> select_gain(String gain_openid){

        worksExample worksExample = new worksExample();
        com.domain.worksExample.Criteria criteria = worksExample.createCriteria();

        if (!ObjectUtils.isEmpty(gain_openid)) {
            criteria.andGainOpenidEqualTo(gain_openid);
        }

        List<works> works = worksMapper.selectByExample(worksExample);

        ArrayList arrayList = new ArrayList();
        for (com.domain.works work : works) {

            Long pushId = work.getPushId();

            push_homework push_homework = push_homeworkMapper.selectByPrimaryKey(pushId);

            arrayList.add(push_homework);

        }


        List<gains> gains = CopyUtil.copyList(arrayList, gains.class);

        return gains;


    }

    public gain_commit_page select_by_id(Long id){
        push_homework push_homework = push_homeworkMapper.selectByPrimaryKey(id);
        gain_commit_page copy = CopyUtil.copy(push_homework, gain_commit_page.class);
        return copy;

    }

}
