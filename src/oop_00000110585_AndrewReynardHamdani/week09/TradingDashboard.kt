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
}