package oop_00000133272_tevathanielhartanto.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS. ")
    }

    // Fungsi unik/spesifik yang hanya Dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas. ")
    }
}