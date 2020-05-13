package com.chengte99.guess

import java.util.*

fun main() {
    val random = Random();
    val secret = random.nextInt(10)+1
    println("secret : $secret")
    val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret) {
        print("Please input number: ")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()
        if (number > secret) {
            println("Lower")
        }else if (number < secret) {
            println("Higher")
        }else {
            println("Bingo !!!")
        }
    }
}