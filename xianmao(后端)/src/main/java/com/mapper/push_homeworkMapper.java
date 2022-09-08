package com.mapper;

import com.domain.push_homework;
import com.domain.push_homeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface push_homeworkMapper {
    long countByExample(push_homeworkExample example);

    int deleteByExample(push_homeworkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(push_homework record);

    int insertSelective(push_homework record);

    List<push_homework> selectByExampleWithBLOBs(push_homeworkExample example);

    List<push_homework> selectByExample(push_homeworkExample example);

    push_homework selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") push_homework record, @Param("example") push_homeworkExample example);

    int updateByExampleWithBLOBs(@Param("record") push_homework record, @Param("example") push_homeworkExample example);

    int updateByExample(@Param("record") push_homework record, @Param("example") push_homeworkExample example);

    int updateByPrimaryKeySelective(push_homework record);

    int updateByPrimaryKeyWithBLOBs(push_homework record);

    int updateByPrimaryKey(push_homework record);
}