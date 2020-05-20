package com.chengte99

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
//    File("output.txt").writeText("abc123我我我")
//    printWriter()
//    bufferedWriter()

//    println(File("data.txt").readText())

//    val br = File("data.txt").bufferedReader()
//    var line = br.readLine()
//    while (line != null) {
//        println(line)
//        line = br.readLine()
//    }

    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun bufferedWriter() {
    File("output.txt").bufferedWriter().use {
        it.write("1st Line\n")
        it.write("2nd Line\n")
        it.write("3rd Line\n")
    }
}

private fun printWriter() {
    File("output.txt").printWriter().use {
        it.println("1st Line");
        it.println("2nd Line");
        it.println("3rd Line");
    }
}