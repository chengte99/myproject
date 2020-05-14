package com.chengte99.many

fun main() {
    val list = listOf(2,3,6,8)
    println(list)

    val scores: List<Int> = listOf(23,54,86,35)
    for (score in scores) {
        println(score)
    }

    var mutable = mutableListOf(24,67,89,45)
    mutable.add(93)
}