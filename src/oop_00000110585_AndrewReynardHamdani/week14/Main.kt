package oop_00000110585_AndrewReynardHamdani.week14

fun main() {
    val repository = CsvOrderRepository()
    val notification = EmailNotifier()
    val processor = SafeOrderProcessor(repository, notification)

    val vipPromo = VipPricing()
    processor.processOrder("Laptop Gaming", 15000000.0, vipPromo)

    val regularPromo = RegularPricing()
    processor.processOrder("Mouse Wireless", 500000.0, regularPromo)
}