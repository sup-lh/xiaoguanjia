package com.controller;

import com.domain.preorder;
import com.domain.preorderExample;
import com.domain.push_homework;
import com.domain.works;
import com.mapper.preorderMapper;
import com.resp.gain_commit_page;
import com.resp.gain_homework;
import com.resp.gains;
import com.resp.mypush;
import com.service.gain_homeworkService;
import com.service.push_homeworkService;
import com.util.getopenid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@RestController

public class homeworkController {

    @Resource
    private push_homeworkService push_homeworkService;

    @Resource
    private gain_homeworkService gain_homeworkService;

    @Resource
    private preorderMapper preorderMapper;



    @RequestMapping("/pushhomework")
    public boolean pushhomework(String schoolname,String classname,String username,String phone,String homework,Integer money,String worktime,String workname,String code,String prepay_id){
        //查询是否下单成功
        preorderExample preorderExample = new preorderExample();
        preorderExample.createCriteria().andPrepayIdEqualTo(prepay_id);
        List<preorder> preorders = preorderMapper.selectByExample(preorderExample);
        preorder preorder = preorders.get(0);
        Boolean flag = preorder.getFlag();
        if(flag){
            String push_openid = new getopenid().openid(code);
            boolean insert_flag = push_homeworkService.insert(schoolname,classname,username,phone,homework,money,worktime,workname, push_openid);
            return insert_flag;
        }else {
            return false;
        }

    }

    @RequestMapping("/gainwork_pre")
    public List<gain_homework> gainwork_pre(String schoolname){

        List<gain_homework> select_list = gain_homeworkService.select(schoolname);

        return select_list;
    }

    @RequestMapping("/gainwork_after")
    public String gainwork_after(Long id){

        String homework = gain_homeworkService.select_id(id);

        return homework;
    }

    @RequestMapping("/get")
    public int get(Long id,String code) throws IOException {
        String gain_openid = new getopenid().openid(code);
        int update = push_homeworkService.insert_gainopenid(id, gain_openid);
        return update;

    }

    @RequestMapping("/gainPage")
    public List<gains> gainPage(String code) throws IOException {
        String gainopenid = new getopenid().openid(code);
        List<gains> gains = gain_homeworkService.select_gain(gainopenid);

        return gains;

    }

    @RequestMapping("/commit_work")
    public gain_commit_page commit_work(Long id){

        gain_commit_page page = gain_homeworkService.select_by_id(id);

        return page;
    }

    @RequestMapping("/commited")
    public int commited(Long id,String code) throws IOException {
        String openid = new getopenid().openid(code);

        int commited = push_homeworkService.commited(id, openid);
        return commited;
    }

    @RequestMapping("/ifcommited")
    public String ifcommited(Long id,String code){
        String openid = new getopenid().openid(code);

        String ifcommited = push_homeworkService.ifcommited(id, openid);
        return ifcommited+"+"+openid;

    }

    @RequestMapping("/mypush")
    public List<mypush> mypush(String code) {
        String openid = new getopenid().openid(code);

        List<mypush> mypush = push_homeworkService.mypush(openid);

        return mypush;
    }

    @RequestMapping("/updateflag")
    public int updateflag(int id) {


        int update = push_homeworkService.update((long)id);

        return update;
    }

    @RequestMapping("/getpath")
    public ArrayList<String> getpath(Long id) {
        List<works> select = push_homeworkService.select(id);
        ArrayList<String> pathList = new ArrayList();

        for (works works : select) {
            String pushOpenid_sub = works.getPushOpenid().substring(3, 8);
            String gainOpenid_sub = works.getGainOpenid().substring(3, 8);
            String path = pushOpenid_sub+gainOpenid_sub;
            pathList.add(path);
        }

        return pathList;

    }



}
