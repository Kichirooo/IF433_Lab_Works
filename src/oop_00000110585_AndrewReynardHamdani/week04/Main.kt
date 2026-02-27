package oop_00000110585_AndrewReynardHamdani.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myEV = ElectricCar(brand = "BYD ATTO 1", numberOfDoors = 4, batteryCapacity = 85)

    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()
}