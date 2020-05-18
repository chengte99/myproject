package com.chengte99.lottery;

import java.util.HashSet;
import java.util.Set;

// abstract 介於interface 與繼承 中間，可以讓繼承的子類強迫實作方法的body
public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;
    public abstract void generate();
}
