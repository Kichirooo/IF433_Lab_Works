package oop_00000110585_AndrewReynardHamdani.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}