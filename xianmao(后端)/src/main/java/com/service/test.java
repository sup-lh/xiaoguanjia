package com.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        DateFormat df2 = DateFormat.getDateTimeInstance();//可以精确到时分秒
        String toTime = df2.format(date);

        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsetotime = null;
        try {
            parsetotime = simpleFormat.parse(toTime.substring(0, 16));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(toTime.substring(0, 16));
        System.out.println(parsetotime);


    }
}
