package com.chengte99

fun main() {
//    println("Hello kotlin")
//    Person().hello()
    val p = Person()
    p.hello()

    Human().hello()
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}
