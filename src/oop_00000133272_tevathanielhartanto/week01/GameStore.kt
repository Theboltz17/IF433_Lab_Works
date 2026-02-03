package oop_001_johnthor.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 599000

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
    )
}

fun calculateDiscount(price: Int) =
    if (price > 500_000) price * 80 / 100
    else price * 90 / 100

fun printReceipt(title: String, finalPrice: int) {
    println("Judul game : $title")
    println("Harga akhir: Rp$finalPrice")
}
