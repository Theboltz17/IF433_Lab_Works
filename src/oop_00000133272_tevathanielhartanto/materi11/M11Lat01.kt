package oop_00000133272_tevathanielhartanto.materi11

//basic extension function
fun String.DasarExtension():String {
    return "halo $this"
}

//extension function dasar
fun String.RubahHurufBesarDepan():String {
    var hasil = ""
    hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return hasil
}

//extension function pake parameter
fun String.tentukanKelulusan(nilai:Int):String {
    var hasil = ""
    if(nilai > 70) {
        hasil = "Lulus"
    } else {
        hasil = "Remedial"
    }
    return this + "" + hasil
}

fun String?.CekNulldanEmpty():String {
    var hasil = ""
    if(this == null || this.isEmpty()) {
        hasil = "Ga boleh null atau kosong"
    } else {
        hasil = "Password kamu: $this"
    }
    return hasil
}

//untuk SCOPE - APPLY (Data Class)
//data class Manusia(var nama:String, var umur:Int)

//untuk SCOPE - APPLY (Class biasa)
class Manusia() {
    var nama:String = ""
    var umur: Int = 0
}

fun main() {
    //extension function - cek null dan empty
    var passwordKamu:String? = null
    println(passwordKamu.CekNulldanEmpty())

    //call extension function + parameter
    println("Kelulusan Kamu ".tentukanKelulusan(71))

    //penerapan basic function
    println("Teva abcdef ghijk lmnopq rstuv wxyz".DasarExtension())

    //tanpa extension function
    val nama1 = "budi sihombing"
    println(nama1.uppercase())

    //SCOPE - LET
    val huruf:String = "UMN"
    val hasilKampus = huruf.let {
        huruf.let {
            if (it == "UMN") {
                println("Kampus saya")
            } else {
                println("Bukan kampus saya")
            }
        }
    }
    println(hasilKampus)

    //SCOPE - RUN
    var nilaiKamu = 70.run {
        if(this >= 70) {
            println("Lulus")
        } else {
            println("Gagal")
        }
    }

    //SCOPE - WITH
    val pekerjaan = with("Mahasiswa") {
        if(this=="Mahasiswa") {
            println("Pelajar")
        } else {
            println("Pekerja")
        }
    }

    //SCOPE - APPLY
    val orang = Manusia().apply {
        nama = "Budi"
        umur = 27
    }
    println("nama kamu ${orang.nama} umur kamu ${orang.umur}")

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(1,2,3,4)
    deretAngka.also {
        println("Sebelum $deretAngka")
    }.add(5)
    print("Setelah $deretAngka")

    //dengan extension function
    println("budi udin".RubahHurufBesarDepan())
}