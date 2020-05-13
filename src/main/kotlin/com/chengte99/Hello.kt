package com.chengte99

fun main() {
//    println("Hello kotlin")
//    Person().hello()
    var name: String? = "abcde";
    name = null
    println(name?.length);
    println(name?.get(3));
    println(name?.substring(3));
    println(name?.substring(2,4));

    val h = Human(70.5f, 1.77f)
    h.hello()
    println(h.bmi())

    val score = 80
    println(score <= 80)
    val c: Char = 'A'
    println(c.toInt() > 60)

    /*var age = 12
    age = 23
    var weight: Float = 55.6f
    var name: String
    name = "Kevin"*/
}

class Human (var weight: Float, var height: Float, var name: String = "") {
    init {
        println("TEST $weight")
    }

//    constructor(name: String, weight: Float, height: Float): this(weight, height)

    fun bmi(): Float{
        var bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello kotlin")
    }
}
