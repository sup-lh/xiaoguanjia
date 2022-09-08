package com.mapper;

import com.domain.advertising;
import com.domain.advertisingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface advertisingMapper {
    long countByExample(advertisingExample example);

    int deleteByExample(advertisingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(advertising record);

    int insertSelective(advertising record);

    List<advertising> selectByExample(advertisingExample example);

    advertising selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") advertising record, @Param("example") advertisingExample example);

    int updateByExample(@Param("record") advertising record, @Param("example") advertisingExample example);

    int updateByPrimaryKeySelective(advertising record);

    int updateByPrimaryKey(advertising record);
}