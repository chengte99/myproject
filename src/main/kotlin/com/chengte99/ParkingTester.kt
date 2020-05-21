package com.chengte99

import java.time.Duration
import java.time.LocalDateTime
import kotlin.math.min

fun main() {
    val enter = LocalDateTime.of(2020, 5, 21, 15, 0, 0)
    val leave = LocalDateTime.of(2020, 5, 21, 18, 9, 0)
    val car = Car("AAA-0001", enter)
    car.leave = leave
    val minute = car.getDuration()
    println(minute)
    val hour = Math.ceil(minute/60.0).toLong()
    println(hour)
}

class Car(val id: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value)) {
                field = value
            }
        }

    fun getDuration() = Duration.between(enter, leave).toMinutes()
}