package oop_00000110585_AndrewReynardHamdani.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach {
        println(it)
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 1.5))
    txRepo.add(Transaction("TX002", 50.0))
}