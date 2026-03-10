package oop_00000110585_AndrewReynardHamdani.week05

fun main() {
    val myEWallet = EWallet("Andrew", 50000.0)
    val myCreditCard = CreditCard("Andrew", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    println("--- Simulasi Pembayaran E-Commerce ---")

    for (method in paymentList) {
        method.processPayment(75000.0)
        println("-----------------------------------")
    }
}