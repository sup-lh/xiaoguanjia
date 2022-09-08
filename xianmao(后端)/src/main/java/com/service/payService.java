package com.service;

import com.domain.pay_order;
import com.domain.pay_orderExample;
import com.domain.single;
import com.mapper.pay_orderMapper;
import org.springframework.stereotype.Service;
import com.suplin.demo.resp.CommonResp;
import javax.annotation.Resource;
import java.util.List;

@Service
public class payService {

    @Resource
    private pay_orderMapper pay_orderMapper;

    public CommonResp<List<pay_order>> admin_pay(){

        pay_orderExample pay_orderExample = new pay_orderExample();
        pay_orderExample.createCriteria().andAoidIsNotNull();
        pay_orderExample.setOrderByClause("pay_time desc");
        List<pay_order> pay_orders = pay_orderMapper.selectByExample(pay_orderExample);

        CommonResp<List<pay_order>> pay_orderCommonResp = new CommonResp<>();

        pay_orderCommonResp.setContent(pay_orders);
        return pay_orderCommonResp;
    }

    public int insert(pay_order pay_order){
        int insert = pay_orderMapper.insert(pay_order);
        return insert;
    }

    public int select(String order_id){
        pay_orderExample pay_orderExample = new pay_orderExample();
        com.domain.pay_orderExample.Criteria criteria = pay_orderExample.createCriteria();
        if (!(order_id.isEmpty())){
            criteria.andOrder_idEqualTo(order_id);
        }

        List<pay_order> pay_orders = pay_orderMapper.selectByExample(pay_orderExample);

        int size = pay_orders.size();
        return size;
    }
}
