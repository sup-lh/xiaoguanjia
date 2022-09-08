package com.mapper;

import com.domain.preorder;
import com.domain.preorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface preorderMapper {
    long countByExample(preorderExample example);

    int deleteByExample(preorderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(preorder record);

    int insertSelective(preorder record);

    List<preorder> selectByExample(preorderExample example);

    preorder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") preorder record, @Param("example") preorderExample example);

    int updateByExample(@Param("record") preorder record, @Param("example") preorderExample example);

    int updateByPrimaryKeySelective(preorder record);

    int updateByPrimaryKey(preorder record);
}