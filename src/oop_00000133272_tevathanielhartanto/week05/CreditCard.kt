package oop_00000133272_tevathanielhartanto.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("CreditCard: Transaksi berhasil. Total terpakai: $usedAmount")
        } else {
            println("CreditCard: Transaksi ditolak. Melebihi limit.")
        }
    }
}