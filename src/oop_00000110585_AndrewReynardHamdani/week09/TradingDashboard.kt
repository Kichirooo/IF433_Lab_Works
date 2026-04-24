package oop_00000110585_AndrewReynardHamdani.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 15.5, "CLOSED"), // Profit
        TradeLog("ETHUSDT", "SHORT", 5, -5.2, "CLOSED"), // Loss
        TradeLog("BTCUSDT", "LONG", 20, -12.0, "OPEN"),  // Loss
        TradeLog("SOLUSDT", "LONG", 15, 25.0, "CLOSED"), // Profit
        TradeLog("ETHUSDT", "LONG", 10, 8.5, "OPEN"),    // Profit
        TradeLog("BTCUSDT", "SHORT", 5, 2.1, "CLOSED")   // Profit
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }

    worstPerformersString.forEach { println(it) }

    println("\nKoin yang ditradingkan:")
    println(uniquePairs)
}