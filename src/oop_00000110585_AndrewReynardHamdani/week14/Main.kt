package oop_00000110585_AndrewReynardHamdani.week14

fun main() {
    val repository = CsvOrderRepository()
    val notification = EmailNotifier()

    val processor = SafeOrderProcessor(repository, notification)

    processor.processOrder("Laptop Gaming", 15000000.0, "VIP")
}