package oop_00000110585_AndrewReynardHamdani.week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Input nama Hero: ")
    val heroName = scanner.nextLine()

    print("Stat Damage: ")
    val heroDamage = scanner.nextInt()

    val myHero = Hero(heroName, heroDamage)

    var enemyHp = 100

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- PERTEMPURAN ---")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            myHero.attack("Enemy")
            enemyHp -= myHero.baseDamage
            println("Sisa HP musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                myHero.takeDamage(enemyDamage)
                println("Musuh membalas! $heroName menerima $enemyDamage damage.")
            }

            println("Sisa HP $heroName: ${myHero.hp}")
        } else if (choice == 2) {
            println("Kamu memilih kabur... Pertarungan berakhir.")
            break
        }
    }

    println("\n--- HASIL AKHIR ---")
    if (enemyHp <= 0) {
        println("Selamat! ${myHero.name} menang!")
    } else if (!myHero.isAlive()) {
        println("Yah... ${myHero.name} kalah dalam pertarungan.")
    }
}