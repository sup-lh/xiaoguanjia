package com.model;


/**
 * 预订单
 *
 * @author zuoliangzhu
 *
 */
public class ResultInfo {
    private String appid;// 小程序ID
    private String mch_id;// 商户号
    private String nonce_str;// 随机字符串
    private String transaction_id;//签名类型
    private String sign;// 签名


    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

}
