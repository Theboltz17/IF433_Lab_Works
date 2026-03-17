package oop_00000133272_tevathanielhartanto.materi07

enum class Arah(val petunjuk: String) {
    Atas("naik"),
    Bawah("turun"),
    Kiri("belok kiri"),
    Kanan("belok kanan");

    fun tampilkan_isi_param() {
        println("arah ke ${petunjuk}")
    }
}