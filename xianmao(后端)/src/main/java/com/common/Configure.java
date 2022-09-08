package com.common;


public class Configure {
    private static String key = "qssbdlrqssbdlrqssbdlrqssbdlr1125";
    //小程序ID
    private static String appID = "wx945ba2084b0adafe";
    //商户号
    private static String mch_id = "1622711505";
    //
    private static String secret = "693c50377a88c6e627e0749189c2d2d2";

    public static String getSecret() {
        return secret;
    }

    public static void setSecret(String secret) {
        Configure.secret = secret;
    }

    public static String getKey() {
        return key;
    }

    public static void setKey(String key) {
        Configure.key = key;
    }

    public static String getAppID() {
        return appID;
    }

    public static void setAppID(String appID) {
        Configure.appID = appID;
    }

    public static String getMch_id() {
        return mch_id;
    }

    public static void setMch_id(String mch_id) {
        Configure.mch_id = mch_id;
    }

}