package com.mapper;

import com.domain.daipao;
import com.domain.daipaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface daipaoMapper {
    long countByExample(daipaoExample example);

    int deleteByExample(daipaoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(daipao record);

    int insertSelective(daipao record);

    List<daipao> selectByExample(daipaoExample example);

    daipao selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") daipao record, @Param("example") daipaoExample example);

    int updateByExample(@Param("record") daipao record, @Param("example") daipaoExample example);

    int updateByPrimaryKeySelective(daipao record);

    int updateByPrimaryKey(daipao record);
}