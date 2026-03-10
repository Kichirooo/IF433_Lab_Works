package oop_00000110585_AndrewReynardHamdani.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran Rp$amount berhasil menggunakan Kartu Kredit. Total tagihan $accountName: Rp$usedAmount")
        } else {
            println("Transaksi ditolak: Melampaui batas limit kartu!")
        }
    }
}