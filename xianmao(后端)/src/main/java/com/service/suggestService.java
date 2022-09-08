package com.service;

import com.domain.singleExample;
import com.domain.suggest;
import com.domain.suggestExample;
import com.mapper.singleMapper;
import com.mapper.suggestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class suggestService {
    @Resource
    private suggest suggest;
    @Resource
    private suggestMapper suggestMapper;

    public String insert(String content,String phone,String nickname){

        suggest.setContent(content);
        suggest.setPhone(phone);
        suggest.setNickname(nickname);

        int row = suggestMapper.insert(suggest);
        if (row != 0 ){
            return "数据插入成功";
        }else {
            return "数据插入失败";
        }

    }

    public List<suggest> select(){
        suggestExample suggestExample = new suggestExample();
        suggestExample.createCriteria().andIdIsNotNull();
        List<suggest> suggests = suggestMapper.selectByExample(suggestExample);
        return suggests;
    }

    public void delete(Long id){
        suggestExample suggestExample = new suggestExample();
        suggestExample.createCriteria().andIdEqualTo(id);
        suggestMapper.deleteByPrimaryKey(id);
    }
}
