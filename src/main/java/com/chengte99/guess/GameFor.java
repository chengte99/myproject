package com.chengte99.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        for (int i = 0; i < 5; i ++) {
            System.out.println("Please input number (" + (i+1) + "/5) : ");
            number = scanner.nextInt();
            if (number > secret) {
                System.out.println("Lower");
            }else if (number < secret) {
                System.out.println("Higher");
            }else {
                System.out.println("Bingo !!!");
                break;
            }
        }
        System.out.println("結束 ...");
    }

}
