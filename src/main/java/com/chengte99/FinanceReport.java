package com.chengte99;

public class FinanceReport implements Report {

    @Override
    public void load() {
        System.out.println("Finance loading data");
    }

    @Override
    public void print() {
        System.out.println("Finance printing data");
    }
}
