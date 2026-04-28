package oop_00000133272_tevathanielhartanto.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.85))
    coinRepo.add(Coin("ETH", 5.2))
    coinRepo.add(Coin("USDT", 1500.0))
}