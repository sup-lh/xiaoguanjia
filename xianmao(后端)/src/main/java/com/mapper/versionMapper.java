package com.mapper;

import com.domain.version;
import com.domain.versionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface versionMapper {
    long countByExample(versionExample example);

    int deleteByExample(versionExample example);

    int insert(version record);

    int insertSelective(version record);

    List<version> selectByExample(versionExample example);

    int updateByExampleSelective(@Param("record") version record, @Param("example") versionExample example);

    int updateByExample(@Param("record") version record, @Param("example") versionExample example);
}