package com.mapper;

import com.domain.suggest;
import com.domain.suggestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface suggestMapper {
    long countByExample(suggestExample example);

    int deleteByExample(suggestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(suggest record);

    int insertSelective(suggest record);

    List<suggest> selectByExample(suggestExample example);

    suggest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") suggest record, @Param("example") suggestExample example);

    int updateByExample(@Param("record") suggest record, @Param("example") suggestExample example);

    int updateByPrimaryKeySelective(suggest record);

    int updateByPrimaryKey(suggest record);
}