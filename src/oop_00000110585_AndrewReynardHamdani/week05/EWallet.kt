package oop_00000110585_AndrewReynardHamdani.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran Rp$amount berhasil. Sisa saldo $accountName: Rp$balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Berhasil top up Rp$amount. Saldo $accountName sekarang: Rp$balance")
        }
    }
}