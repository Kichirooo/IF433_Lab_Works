package oop_00000110585_AndrewReynardHamdani.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu $name (ID: $id) sekarang menyala dengan terang.")
    }

    override fun turnOff() {
        println("Lampu $name (ID: $id) telah dimatikan.")
    }
}