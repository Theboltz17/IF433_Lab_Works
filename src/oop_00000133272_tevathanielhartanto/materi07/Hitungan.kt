package oop_00000133272_tevathanielhartanto.materi07

class Hitungan private constructor(val tipe:String) {
    init {
        println("Isi param class: ${tipe}")
    }

    companion object {
        const val namaMtk:String = "Matematika"

        fun tambah(a:Int, b:Int) {
            println("Hasil tambah: " + (a+b))
        }
        fun kali(a:Int, b:Int) {
            println("Hasil perkalian: " + (a*b))
        }

        fun buat_data(tipeUser:String) {
            Hitungan(tipeUser)
        }
    }
}