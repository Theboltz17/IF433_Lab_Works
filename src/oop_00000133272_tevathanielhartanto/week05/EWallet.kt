package oop_00000133272_tevathanielhartanto.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("EWallet: Pembayaran berhasil. Sisa saldo: $balance")
        } else {
            println("EWallet: Saldo tidak cukup. ")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("EWallet: Top berhasil. Saldo sekarang: $balance")
    }
}