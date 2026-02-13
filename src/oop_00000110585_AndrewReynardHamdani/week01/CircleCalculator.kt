package oop_00000110585_AndrewReynardHamdani.week01

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.1

    var area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area")
    println("Size: ${checkSize(area)}")

    checkSize(area)
}