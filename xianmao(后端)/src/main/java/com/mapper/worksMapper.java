package com.mapper;

import com.domain.works;
import com.domain.worksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface worksMapper {
    long countByExample(worksExample example);

    int deleteByExample(worksExample example);

    int deleteByPrimaryKey(Long id);

    int insert(works record);

    int insertSelective(works record);

    List<works> selectByExample(worksExample example);

    works selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") works record, @Param("example") worksExample example);

    int updateByExample(@Param("record") works record, @Param("example") worksExample example);

    int updateByPrimaryKeySelective(works record);

    int updateByPrimaryKey(works record);
}