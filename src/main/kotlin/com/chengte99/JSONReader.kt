package com.chengte99

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
//    useJavaStyle()
//    useKotlinWith()
//    useKotlinLines()
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    println(url.readText())
}

private fun useKotlinLines() {
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    with(url.openConnection() as HttpURLConnection) {
        var json = StringBuffer()
        inputStream.bufferedReader().lines().forEach {
            json.append(it)
        }
        println(json)
    }
}

private fun useKotlinWith() {
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    with(url.openConnection() as HttpURLConnection) {
        var br = inputStream.bufferedReader()
        var line = br.readLine()
        val json = StringBuffer();
        while (line != null) {
            json.append(line)
            line = br.readLine()
        }
        println(json.toString())
    }
}

private fun useJavaStyle() {
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    val connection = url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(connection.inputStream))
    var line = br.readLine()
    val json = StringBuffer();
    while (line != null) {
        json.append(line)
        line = br.readLine()
    }
    println(json.toString())
}