package com.mapper;

import com.domain.numOfSingle;
import com.domain.numOfSingleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface numOfSingleMapper {
    long countByExample(numOfSingleExample example);

    int deleteByExample(numOfSingleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(numOfSingle record);

    int insertSelective(numOfSingle record);

    List<numOfSingle> selectByExample(numOfSingleExample example);

    numOfSingle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") numOfSingle record, @Param("example") numOfSingleExample example);

    int updateByExample(@Param("record") numOfSingle record, @Param("example") numOfSingleExample example);

    int updateByPrimaryKeySelective(numOfSingle record);

    int updateByPrimaryKey(numOfSingle record);
}