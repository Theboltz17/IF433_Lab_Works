package oop_00000133272_tevathanielhartanto.materi09

fun main() {
    println("============= LIST OF =============")
    var arMhs = listOf("Budi", "Susi", "Titus")

    // view
    println(arMhs)
    // view panjang array
    println("Panjang List ${arMhs.size}")
    //abmil satuan data di listOf
    println(arMhs[1])
    // muncul semua-nya
    for(a in arMhs) {
        println("Mahasiswa bernama: $a")
    }

    println("============= MUTABLE LIST =============")
    var arAngka = mutableListOf(10,30,40,20,90,100,15)
    println(arAngka)

    // Nambah array
    arAngka.add(777)

    // Ganti - replace array
    arAngka[2] = 123

    // hapus - array
    arAngka.removeAt(3)

    // View hasil
    println(arAngka)

    println("============= SET OF =============")
    var arUrutan = setOf(20,30,40,20,70,30,10,100)
    println(arUrutan.size)
    println(arUrutan)
    println("ada angka 40 kagak?" + arUrutan.contains(40))

    println("============= SET OF =============")
    var arMakanan = mutableSetOf("Nasi","Bakpao","Mie","Ayam","Ayam Lagi")
    arMakanan.add("Ketoprak")
    arMakanan.remove("Mie")
    arMakanan.add("Mie")
    println(arMakanan)

    println("============= MAP OF =============")
    var arSiswa = mapOf(
        "Andi" to 89,
        "Toni" to 73,
        "Ivander" to 90
    )

    println("Banyak data siswa: " + arSiswa.size)
    println("Nilai si Andi " + arSiswa["Andi"])
    println("Semua keys: " + arSiswa.keys)
    println("Semua values: " + arSiswa.values)
    println("Nama siswa index 1: " + arSiswa.keys.elementAt(1))
    println(arSiswa)

    println("============= MAP OF MUTABLE =============")
    var arMenu = mutableMapOf(
        "Nasi" to 1000,
        "Ayam" to 2000,
        "Sayur Asem" to 1500
    )
    println("banyak menu: " + arMenu.size)
    arMenu["Nasi"] = 500
    arMenu.remove("Ayam")
    arMenu.put("Udang", 2300)
    println(arMenu)

    //Lambda
    println("============= LAMBDA =============")
    //function biasa
    fun tambah(a: Int, b: Int): Int {
        return a + b
    }
    // function lambda
    var kurang = {a: Int, b: Int -> a-b}
    println("Kurang-kurangan: ${kurang(5,3)}")

    println("===== IMPLICIT IT =====")
    var pangkat = {x: Int -> x+x}
    var hitungPangkat:(Int) -> Int = {it * it}
    println("Pangkat " + hitungPangkat(5))

    // tampilin semua hasil pakai looping
    arSiswa.forEach {
        siswa -> println(siswa)
    }
    for(sis in arSiswa) {
        println(sis)
    }

}