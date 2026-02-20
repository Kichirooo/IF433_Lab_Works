package oop_00000110585_AndrewReynardHamdani.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun printReceipt(title: String, finalPrice: Int, userNote: String? = null) {
    val note = userNote ?: "Tidak ada catatan"
    println("Judul: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: $note")
}

fun main() {
    val gameTitle = "Mario Bros"
    val price = 550010
    val note: String? = null

    printReceipt(
        title = gameTitle,
        finalPrice = price,
        userNote = note
    )
}