package com.chengte99.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
//        list();
//        set();
//        map();
    }

    private static void map() {
        //map
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("2330", "TSMC");
        hashMap.put("2317", "鴻海");
        hashMap.put("2330", "台積電");
        System.out.println(hashMap);
        for (String key: hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
    }

    private static void set() {
        //set
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(5);
        System.out.println(hashSet);
        for (int value: hashSet) {
            System.out.println(value);
        }
    }

    private static void list() {
        // List
        ArrayList arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        System.out.println(arrayList.size());
        arrayList.add(1);
        System.out.println(arrayList.size());

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
