package oop_00000133272_tevathanielhartanto.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop",   "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt",  "type" to "CLOTHING",   "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse",    "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // warranty rusak
        mapOf("name" to "Ghost Item",              "type" to "CLOTHING"),  // tidak ada ID!
        mapOf("id" to "X01", "name" to "Unknown",  "type" to "FOOD")       // tipe tidak dikenal
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product: Product? = parser.parseProduct(raw)

            product?.let {
                when (it) {
                    is Electronic -> println("📦 Electronic: ${it.name} | Warranty: ${it.warrantyMonths} bulan")
                    is Clothing   -> println("👕 Clothing  : ${it.name} | Size: ${it.size}")
                }
                parser.checkout(it)
            } ?: println("⚠️  SKIP: Tipe produk tidak dikenal untuk data -> $raw")

        } catch (e: IllegalArgumentException) {
            println("❌ DATA KORUP: ${e.message}")
        }
        println("Sudah di tes dan outputnya sama")
    }
}