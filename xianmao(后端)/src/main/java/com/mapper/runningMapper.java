package com.mapper;

import com.domain.running;
import com.domain.runningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface runningMapper {
    long countByExample(runningExample example);

    int deleteByExample(runningExample example);

    int deleteByPrimaryKey(Long id);

    int insert(running record);

    int insertSelective(running record);

    List<running> selectByExampleWithBLOBs(runningExample example);

    List<running> selectByExample(runningExample example);

    running selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") running record, @Param("example") runningExample example);

    int updateByExampleWithBLOBs(@Param("record") running record, @Param("example") runningExample example);

    int updateByExample(@Param("record") running record, @Param("example") runningExample example);

    int updateByPrimaryKeySelective(running record);

    int updateByPrimaryKeyWithBLOBs(running record);

    int updateByPrimaryKey(running record);
}