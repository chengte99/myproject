package com.chengte99.kotlin

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    print("Please input stu name:")
    var name = scanner.next()
    print("Please input stu english:")
    var english = scanner.nextInt()
    print("Please input stu math:")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print()
}

class Student(var name: String, var english: Int, var math: Int) {
    fun print(){
        println(name + "\t" + english + "\t" + math +
        "\t" + (english+math)/2)
    }
}