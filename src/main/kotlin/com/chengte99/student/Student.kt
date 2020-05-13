package com.chengte99.kotlin

import java.util.*

fun main() {
//    userInput()
    val stu = Student("Tom", 67, 88)
    stu.print()
    println("Highest score: ${stu.highest()}")
}

private fun userInput() {
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
        /*print(name + "\t" + english + "\t" + math +
        "\t" + getAverage() + "\t" +
        if (getAverage() >= 60) "PASS" else "FAILED")
        println("\t${grading()}")*/
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }
    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
    fun passOrFailed() = if (getAverage() >= 60) "PASS" else "FAILED"

    fun getAverage() = (english+math)/2

    fun highest() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }
}