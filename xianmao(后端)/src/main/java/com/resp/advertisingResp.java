package com.resp;

public class advertisingResp {

    private String data;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", data=").append(data);
        sb.append("]");
        return sb.toString();
    }
}