package com.service;

import com.alibaba.fastjson.JSONObject;
import com.domain.help;
import com.domain.helpExample;
import com.mapper.helpMapper;
import com.resp.helpResp;
import com.resp.myhelpResp;
import com.resp.pushhelpResp;
import com.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class helpService {

    @Resource
    private helpMapper helpMapper;


    public int insert(String openid,JSONObject jsonObject) throws ParseException {
        help help = new help();

        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date data = null;
        try {
            //此处指定日期/时间解析是否不严格，在true是不严格，false时为严格
            simpleFormat.setLenient(false);
            //从给定字符串的开始解析文本，以生成一个日期
            data = simpleFormat.parse(simpleFormat.format(new Date()));

        } catch (ParseException e) {
            e.printStackTrace();
        }


        String avatarUrl = jsonObject.getString("avatarUrl");
        Map thingpush = (Map)jsonObject.get("thingpush");


        help.setPushopenid(openid);
        help.setThing(thingpush.get("thing").toString());
        help.setPhone(thingpush.get("phone").toString());
        help.setStart(thingpush.get("start").toString());
        help.setEnd(thingpush.get("end").toString());
        help.setMoney((Integer) thingpush.get("money"));
        help.setTouxiang(avatarUrl);
        help.setTime(data);
        help.setThingflag(false);
        help.setOver(false);
        help.setDeleteflag(false);


        int insert = helpMapper.insert(help);

        return insert;

    }


    public boolean selectflag(Long id) {

        help help = helpMapper.selectByPrimaryKey(id);
        return help.getThingflag() || help.getOver();
    }

    public boolean updateover(Long id) {

        help help1 = new help();
        help1.setOver(true);

        helpExample helpExample = new helpExample();
        helpExample.createCriteria().andIdEqualTo(id);


        int i = helpMapper.updateByExampleSelective(help1, helpExample);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }


    public boolean deletehelp(Long id) {

        help help1 = new help();
        help1.setDeleteflag(true);

        helpExample helpExample = new helpExample();
        helpExample.createCriteria().andIdEqualTo(id);


        int i = helpMapper.updateByExampleSelective(help1, helpExample);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }


    public List<helpResp> select() throws ParseException {
        helpExample helpExample = new helpExample();
        helpExample.createCriteria().andIdIsNotNull().andOverEqualTo(false);
        List<help> helps = helpMapper.selectByExample(helpExample);

        List<helpResp> helpResps = CopyUtil.copyList(helps, helpResp.class);
        for (helpResp helpResp : helpResps) {

            SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date parsetotime = null;
            try {
                //此处指定日期/时间解析是否不严格，在true是不严格，false时为严格
                simpleFormat.setLenient(true);
                //从给定字符串的开始解析文本，以生成一个日期
                parsetotime = simpleFormat.parse(simpleFormat.format(new Date()));

            } catch (ParseException e) {
                e.printStackTrace();
            }

            //获取存储时间
            Date fromM = helpResp.getTime();

            long from = fromM.getTime();
            long to = parsetotime.getTime();
            int gap = (int) ((to - from) / (1000 * 60));


            if (gap<60){
                helpResp.setDate(gap+"分钟前");
            }else if (gap<1440){
                helpResp.setDate(gap/60+"小时前");
            }else {
                helpResp.setDate(gap/1440+"天前");
            }

        }

        return helpResps;

    }


    public List<pushhelpResp> selectmine(String pushopenid)  {
        helpExample helpExample = new helpExample();
        helpExample.createCriteria().andPushopenidEqualTo(pushopenid).andOverEqualTo(false).andDeleteflagEqualTo(false);
        List<help> helps = helpMapper.selectByExample(helpExample);

        List<pushhelpResp> pushhelpResps = CopyUtil.copyList(helps, pushhelpResp.class);

        for (pushhelpResp pushhelpResp : pushhelpResps) {

            SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date parsetotime = null;
            try {
                //此处指定日期/时间解析是否不严格，在true是不严格，false时为严格
                simpleFormat.setLenient(true);
                //从给定字符串的开始解析文本，以生成一个日期
                parsetotime = simpleFormat.parse(simpleFormat.format(new Date()));

            } catch (ParseException e) {
                e.printStackTrace();
            }

            //获取存储时间
            Date fromM = pushhelpResp.getTime();

            long from = fromM.getTime();
            long to = parsetotime.getTime();
            int gap = (int) ((to - from) / (1000 * 60));


            if (gap<60){
                pushhelpResp.setDate(gap+"分钟前");
            }else if (gap<1440){
                pushhelpResp.setDate(gap/60+"小时前");
            }else {
                pushhelpResp.setDate(gap/1440+"天前");
            }

        }

        return pushhelpResps;

    }



    public List<myhelpResp> selectminehelp(String gainopenid)  {
        helpExample helpExample = new helpExample();
        helpExample.createCriteria().andGainopenidEqualTo(gainopenid);
        List<help> helps = helpMapper.selectByExample(helpExample);

        List<myhelpResp> myhelpResps = CopyUtil.copyList(helps, myhelpResp.class);


        for (myhelpResp myhelpResp : myhelpResps) {

            SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date parsetotime = null;
            try {
                //此处指定日期/时间解析是否不严格，在true是不严格，false时为严格
                simpleFormat.setLenient(true);
                //从给定字符串的开始解析文本，以生成一个日期
                parsetotime = simpleFormat.parse(simpleFormat.format(new Date()));

            } catch (ParseException e) {
                e.printStackTrace();
            }

            //获取存储时间
            Date fromM = myhelpResp.getTime();

            long from = fromM.getTime();
            long to = parsetotime.getTime();
            int gap = (int) ((to - from) / (1000 * 60));


            if (gap<60){
                myhelpResp.setDate(gap+"分钟前");
            }else if (gap<1440){
                myhelpResp.setDate(gap/60+"小时前");
            }else {
                myhelpResp.setDate(gap/1440+"天前");
            }

        }

        return myhelpResps;

    }

    public String updatehelp(Long id,String gainopenid,String gainphone) {

        help help1 = new help();
        help1.setThingflag(true);
        help1.setGainopenid(gainopenid);
        help1.setGainphone(gainphone);

        helpExample helpExample = new helpExample();
        helpExample.createCriteria().andIdEqualTo(id);
        int i = helpMapper.updateByExampleSelective(help1, helpExample);

        String phone = null;
        if (i>0){

            help help = helpMapper.selectByPrimaryKey(id);
            phone = help.getPhone();
        }
        return phone;
    }
}
