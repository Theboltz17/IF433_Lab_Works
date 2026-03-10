package oop_00000133272_tevathanielhartanto.materi06

class KRS(
    override val nama: String,
    override val namaSiswa: String) : Mahasiswa, Siswa {

    override fun belajar() {
        println("si $nama belajar")
        println("si $namaSiswa belajar juga")
    }

    override fun main_game() {
        super<Siswa>.main_game()
        super<Mahasiswa>.main_game()
    }

    override fun serang() {
        println("si $nama nyerang, aw")
    }

    override fun makan() {
        println("Mahasiswa $nama makan")
    }

    override fun mandi() {
        println("$nama mandi")
    }

}