package oop_00000110585_AndrewReynardHamdani.week05

fun main() {
    val helper = MathHelper()

    println("--- Testing MathHelper Overloading ---")

    val luasPersegi = helper.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = helper.hitungLuas(10, 5)
    println("Luas Persegi Panjang (10x5): $luasPersegiPanjang")

    val luasLingkaran = helper.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")
}