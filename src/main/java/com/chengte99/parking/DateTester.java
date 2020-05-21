package com.chengte99.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTester {
    public static void main(String[] args) {
//        java8();
//        Java();
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //Local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2020, 10, 23, 8, 29);
        System.out.println(other);
    }

    private static void Java() {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String str = "2019/11/23 21:22:32";
        try {
            Date date1 = sdf.parse(str);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 11);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        System.out.println(calendar.getTime());
    }
}
