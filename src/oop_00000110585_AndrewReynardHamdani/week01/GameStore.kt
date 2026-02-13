package oop_00000110585_AndrewReynardHamdani.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
    (price * 0.2).toInt()
} else {
    (price * 0.1).toInt()
}

fun printReceipt(title: String, finalPrice: Int, userNote: String? = null) {
    println("Judul Game  : $title")
    println("Harga Akhir : Rp $finalPrice")

    val note = userNote ?: "Tidak ada catatan"
    println("Catatan: $note")
}

fun main() {
    val gameTitle = "TEKKEN 8"
    val price = 700000

    val userNote: String? = null
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = userNote
    )
}