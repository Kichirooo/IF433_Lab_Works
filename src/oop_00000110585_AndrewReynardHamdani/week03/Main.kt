package oop_00000110585_AndrewReynardHamdani.week03

fun main() {
    val myWeapon = Weapon("Excalibur", 100)
    println("Senjata: ${myWeapon.name} | Damage Awal: ${myWeapon.damage}")

    myWeapon.damage = -50
    println("Damage sekarang: ${myWeapon.damage}")

    myWeapon.damage = 9998
    println("Damage setelah paksa: ${myWeapon.damage}")

    println("Tier Senjata: ${myWeapon.tier}")
}