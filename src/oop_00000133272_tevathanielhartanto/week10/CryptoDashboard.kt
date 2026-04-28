package oop_00000133272_tevathanielhartanto.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.85))
    coinRepo.add(Coin("ETH", 5.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")
    println("\n--- COIN LIST ---")
    response.data.forEach { println("Coin: ${it.name} | Balance: ${it.balance}") }
}