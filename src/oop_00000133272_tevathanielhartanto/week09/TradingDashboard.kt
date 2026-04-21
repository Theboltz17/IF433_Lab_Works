package oop_00000133272_tevathanielhartanto.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",  20,  15.5,  "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10,  -5.2,  "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15,   8.3,  "CLOSED"),
        TradeLog("SOLUSDT", "LONG",   5, -12.1,  "CLOSED"),
        TradeLog("ETHUSDT", "LONG",  10,  22.7,  "CLOSED"),
        TradeLog("BTCUSDT", "LONG",  25,   3.4,  "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 10,  -2.1,  "OPEN")
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
}