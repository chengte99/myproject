package com.chengte99.kotlin

import java.util.*

fun main() {
//    userInput()
    Student.pass = 50
    val stu = Student("AAA", 49, 59)
    val stu1 = Student("BBB", 65, 60)
    val stu2 = Student("CCC", 23, 56)
    val gstu = GraduateStudent("Jack", 67, 61, 72)
    gstu.print()
    stu.print()
    stu1.print()
    stu2.print()

//    println("Highest score: ${stu.highest()}")
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

class GraduateStudent(name: String, english: Int, math: Int, var thesis: Int): Student(name, english, math) {
    companion object{
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Student(var name: String, var english: Int, var math: Int) {
    companion object{
        @JvmStatic
        var pass = 60
        fun test() {
            println("test")
        }
    }

    open fun print(){
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
    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    fun getAverage() = (english+math)/2

    fun highest() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }
}