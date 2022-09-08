package com.mapper;

import com.domain.help;
import com.domain.helpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface helpMapper {
    long countByExample(helpExample example);

    int deleteByExample(helpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(help record);

    int insertSelective(help record);

    List<help> selectByExample(helpExample example);

    help selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") help record, @Param("example") helpExample example);

    int updateByExample(@Param("record") help record, @Param("example") helpExample example);

    int updateByPrimaryKeySelective(help record);

    int updateByPrimaryKey(help record);
}