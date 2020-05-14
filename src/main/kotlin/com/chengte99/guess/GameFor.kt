package com.chengte99.guess

import java.util.*

fun main() {
    val secret = Random().nextInt(10)+1
    println(secret)
    var number = 0
    val scanner =  Scanner(System.`in`)
    for (i in 0..4) {
        println("Please input number (${i+1}/5): ")
        number = scanner.nextInt()
        if (number > secret) {
            println("Lower")
        }else if (number < secret) {
            println("Higher")
        }else {
            println("Bingo !!!")
            break
        }
    }
    println("結束")

}