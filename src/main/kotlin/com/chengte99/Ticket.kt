package com.chengte99.kotlin

import java.util.*

data class Ticket(var source: Int, var destination: Int, var price: Int)
// Model

fun main() {
    val ticket = Ticket(20, 51, 330)
    println(ticket.price)

    val s = "abcdefg"
    println(s.validate())

    val range = 1..10 // IntRange為kotlin 範圍類別
    println(range.ramdom())
}

// extension 擴充原有類別的方法
fun String.validate(): Boolean {
    return this.length >= 6
    // this代表物件
}

fun IntRange.ramdom(): Int {
    // endInclusive跟start 為kotlin IntRange的屬性
    val r = Random().nextInt(endInclusive - start) + start
    return r
}

