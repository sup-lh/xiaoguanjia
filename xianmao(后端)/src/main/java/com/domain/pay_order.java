package com.domain;

import org.springframework.stereotype.Service;

@Service
public class pay_order {
    private String aoid;

    private String order_id;

    private Float pay_price;

    private String pay_time;

    private String more;

    private String detail;

    private String sign;

    public String getAoid() {
        return aoid;
    }

    public void setAoid(String aoid) {
        this.aoid = aoid;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Float getPay_price() {
        return pay_price;
    }

    public void setPay_price(Float pay_price) {
        this.pay_price = pay_price;
    }

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aoid=").append(aoid);
        sb.append(", order_id=").append(order_id);
        sb.append(", pay_price=").append(pay_price);
        sb.append(", pay_time=").append(pay_time);
        sb.append(", more=").append(more);
        sb.append(", detail=").append(detail);
        sb.append(", sign=").append(sign);
        sb.append("]");
        return sb.toString();
    }
}