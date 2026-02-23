package oop_00000110585_AndrewReynardHamdani.week03

private var performanceRating: Int = 3

class Employee (val name: String) {
    var salary: Int = 0
        set (value) {
            if(value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
}

fun increasePerformance() {
    performanceRating++
    println("Kinerja $name meningkat! Rating: $performaceRating")
}

fun printStatus() {
    println("Karyawan: $name, Rating: $performanceRating")
}