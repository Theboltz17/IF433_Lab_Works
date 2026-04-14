package oop_00000133272_tevathanielhartanto.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai Safe Calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        // Blok ini HANYA jalan jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: harga belum di-set!"

    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String

        // Hanya cetak jika cast sukses (text tidka null)
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100 // Tipe aslinya Integer
    // Coba cast ke String. Jika gagal (null), gnati dengan "Unknow String"
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST THE RED BUTTON (!!) ===")
    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        // Alih-alih apiResponse["token"]!!
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumentException) {
        println(e.message) // Mencetak pesan custom kita, bukan crash buta
    }
}