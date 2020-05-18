package com.chengte99;

public class HealthReport implements Report{
    // 在class 上按option + Enter，可以直接implement method

    @Override
    public void load() {
        System.out.println("Health loading data");
    }

    @Override
    public void print() {
        System.out.println("Health printing data");
    }
}
