package com.mapper;

import com.domain.pay_order;
import com.domain.pay_orderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pay_orderMapper {
    long countByExample(pay_orderExample example);

    int deleteByExample(pay_orderExample example);

    int insert(pay_order record);

    int insertSelective(pay_order record);

    List<pay_order> selectByExample(pay_orderExample example);

    int updateByExampleSelective(@Param("record") pay_order record, @Param("example") pay_orderExample example);

    int updateByExample(@Param("record") pay_order record, @Param("example") pay_orderExample example);
}