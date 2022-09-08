package com.controller;

import com.domain.suggest;
import com.domain.suggestExample;
import com.mapper.suggestMapper;
import com.service.singleService;
import com.service.suggestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController

public class suggestController {

    @Resource
    private suggestService suggestService;

    @RequestMapping("/suggest")
    public String suggest(String content,String phone,String nickname){
        String insert = suggestService.insert(content,phone,nickname);
        return insert;
    }

    @RequestMapping("/getsuggest")
    public List<suggest> getsuggest(){
        List<suggest> select = suggestService.select();
        return select;
    }

    @RequestMapping("/delete_suggest")
    public void delete(Long id){
        suggestService.delete(id);
    }

}
