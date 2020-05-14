package com.chengte99.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();

//        ArrayList arrayList = new ArrayList();
//        arrayList.add(5);
//        arrayList.add(4);
//        arrayList.add(3);
//        arrayList.add(2);
//        System.out.println(arrayList.size());
//        arrayList.add(1);
//        System.out.println(arrayList.size());

        List<Integer> list= Arrays.asList(86,96,93,48,64);
        System.out.println(list);
        System.out.println(list.size());

    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[2] = 4;
        int[] scores = {86,77,46,15,90};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (int score: scores) {
            System.out.println(score);
        }
    }
}
