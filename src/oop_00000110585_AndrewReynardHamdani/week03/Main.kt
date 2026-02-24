package oop_00000110585_AndrewReynardHamdani.week03

fun main() {
    val myWeapon = Weapon("Excalibur", 100)
    println("Senjata: ${myWeapon.name} | Damage Awal: ${myWeapon.damage}")

    myWeapon.damage = -50
    println("Damage sekarang: ${myWeapon.damage}")

    myWeapon.damage = 9999
    println("Damage setelah paksa: ${myWeapon.damage}")

    println("Tier Senjata: ${myWeapon.tier}")

    println("\n" + "=".repeat(30) + "\n")

    val player = Player("Kichirooo")
    println("Menambah 50 XP...")
    player.addXp(50)
    println("Status saat ini: ${player.username} | Level: ${player.level}")

    println("Menambah 60 XP...")
    player.addXp(60)
    println("Status akhir: ${player.username} | Level: ${player.level}")
}