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

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 250.0))
    txRepo.add(Transaction("TX002", -50.0))
    txRepo.add(Transaction("TX003", 1000.0))

    println("\n--- TRANSACTION LIST ---")
    txRepo.getAll().forEach { println("ID: ${it.id} | Amount: ${it.amount}") }
}