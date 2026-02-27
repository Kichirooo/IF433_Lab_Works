package oop_00000110585_AndrewReynardHamdani.week04

fun main() {
    println("--- Testing Employee Hierarchy ---")

    val mgr = Manager("Andrew", 8000000)
    mgr.work()
    println("Bonus ${mgr.name}: Rp${mgr.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val dev = Developer("Aurelia", 7000000, "Kotlin")
    dev.work()
    println("Bonus ${dev.name}: Rp${dev.calculateBonus()}")
}