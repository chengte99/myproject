package com.chengte99.parking;

import java.time.LocalDateTime;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2020, 5, 21, 15, 0, 0);
        LocalDateTime leave = LocalDateTime.of(2020, 5, 21, 17, 3, 0);
        Car car = new Car("AAA-0001", enter);
        car.setLeave(leave);
        long minute = car.getDuration();
        System.out.println(minute);
        long hour = (long) Math.ceil(minute/60f);
        System.out.println(hour);
        System.out.println(hour*30);
    }
}
