package com.chengte99.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
//        inputStream();
//        fileReader();
        bufferedReader();
    }

    private static void bufferedReader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            // readline 當遇到跳行字元的時候會丟一整行字串出來
            // 當最後沒資料的時候會丟出null
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("BufferedReader open success");
    }

    private static void fileReader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n != -1) {
                System.out.print((char)n);
                n = fr.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("FileReader open success");
    }

    private static void inputStream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        try {
            InputStream is = new FileInputStream(file);
            int n = is.read();
            while (n != -1) {
                System.out.print((char)n);
                n = is.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("InputStream open success");
    }
}
