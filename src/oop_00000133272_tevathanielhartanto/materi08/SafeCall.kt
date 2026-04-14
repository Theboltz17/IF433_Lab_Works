package oop_00000133272_tevathanielhartanto.materi08

class Alamat(val kota:String?)
class Mahasiswa(val address: Alamat)

fun main() {
    val mhs1 = Mahasiswa(Alamat("Tangerang"))
    val mhs2 = Mahasiswa(Alamat(null))

    println("mahasiswa1: ${mhs1.address.kota}")
    println("mahasiswa2: ${mhs2.address.kota}")

    val tetapAlamat = Alamat("Jakarta")
    val defaultAlamat = tetapAlamat.kota?.let {
        adrs->"Alamatnya adalahhhh $adrs"
    } ?: "Alamat kamu Kosong"
    println("Alamat kamu ${defaultAlamat}")
}