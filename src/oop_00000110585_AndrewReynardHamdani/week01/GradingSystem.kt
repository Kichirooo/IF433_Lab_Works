package oop_00000110585_AndrewReynardHamdani.week01

fun main() {
    var name = "John Thor"
    var score = 80

    println("Nama: $name, Nilai: $score")
    val grade = when (score) {
        in 90..100 -> "A"
        in 80 .. 89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}
