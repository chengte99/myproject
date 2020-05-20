package com.chengte99.io;

import java.io.*;

public class WriteTester {
    public static void main(String[] args) {
//        File f = new File("/Users/kevinlin/IdeaProjects/mytest/test01");
//        f.mkdirs();

        try {
//            FileWriter fw = new FileWriter("fw.txt");
            FileWriter fw = new FileWriter("/Users/kevinlin/IdeaProjects/fw.txt");
            fw.write("我是誰呢");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
