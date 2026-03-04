package oop_00000133272_tevathanielhartanto.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama) sedang duduk di depan komp[uter melayani administrasi.")
    }

    // Fungsi unik/spesifik yang hanya dimiliki Admin
    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa. ")
    }
}