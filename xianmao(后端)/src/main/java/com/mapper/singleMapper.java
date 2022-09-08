package com.mapper;

import com.domain.single;
import com.domain.singleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface singleMapper {
    long countByExample(singleExample example);

    int deleteByExample(singleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(single record);

    int insertSelective(single record);

    List<single> selectByExample(singleExample example);

    single selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") single record, @Param("example") singleExample example);

    int updateByExample(@Param("record") single record, @Param("example") singleExample example);

    int updateByPrimaryKeySelective(single record);

    int updateByPrimaryKey(single record);
}