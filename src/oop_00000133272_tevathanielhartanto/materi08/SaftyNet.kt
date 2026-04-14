package oop_00000133272_tevathanielhartanto.materi08

fun main() {
    var nama:String? = "Teva"

    try {
        println("hai $nama")
        println("Huruf kapital: ${nama!!.uppercase()}")
    } catch (e: NullPointerException) {
        println("ada error exception, ini pesan errornya ${e.message}")
    }

    val mixedData: List<Any?> = listOf(1, "Budi", 10, "Online", null)
    for(item in mixedData) {
        val hasil = item as? String
        if(hasil!=null) {
            println(hasil)
        }
    }
}