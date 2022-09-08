package com.mapper;

import com.domain.zhihuishu;
import com.domain.zhihuishuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface zhihuishuMapper {
    long countByExample(zhihuishuExample example);

    int deleteByExample(zhihuishuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(zhihuishu record);

    int insertSelective(zhihuishu record);

    List<zhihuishu> selectByExampleWithBLOBs(zhihuishuExample example);

    List<zhihuishu> selectByExample(zhihuishuExample example);

    zhihuishu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") zhihuishu record, @Param("example") zhihuishuExample example);

    int updateByExampleWithBLOBs(@Param("record") zhihuishu record, @Param("example") zhihuishuExample example);

    int updateByExample(@Param("record") zhihuishu record, @Param("example") zhihuishuExample example);

    int updateByPrimaryKeySelective(zhihuishu record);

    int updateByPrimaryKeyWithBLOBs(zhihuishu record);
}