package com.chengte99.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println("secret: " + secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number != secret){
            System.out.print("Please input number:");
            number = scanner.nextInt();
            if (number > secret) {
                System.out.println("Lower");
            }else if (number < secret){
                System.out.println("Higher");
            }else {
                System.out.println("Bingo !!!");
            }
        }

        /*int sid = 0;
        do {
            System.out.print("Please input sid:");
            sid = scanner.nextInt();
            if (sid > secret) {
                System.out.println("Lower");
            }else if (sid < secret){
                System.out.println("Higher");
            }else {
                System.out.println("Bingo !!!");
            }
        }while (sid != secret);*/

    }
}
