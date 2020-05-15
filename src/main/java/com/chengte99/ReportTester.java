package com.chengte99;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReportTester {
    public static void main(String[] args) {
        Report finance = new FinanceReport();
        Report health = new HealthReport();
        List<Report> reports = new ArrayList<>();
        reports.add(finance);
        reports.add(health);
        for (Report report: reports) {
            report.load();
            report.print();
        }
    }
}
