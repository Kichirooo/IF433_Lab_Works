package oop_00000110585_AndrewReynardHamdani.week03

class Employee (val name: String) {
    val salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}

