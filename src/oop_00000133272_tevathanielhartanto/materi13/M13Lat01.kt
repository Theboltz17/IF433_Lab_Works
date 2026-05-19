package oop_00000133272_tevathanielhartanto.materi13

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    //baca file - cara1
    println("=== Cara1 Baca File ===")
    val fileSaya = File("src/oop_00000133272_tevathanielhartanto/materi13/contohfile.txt")
    val bacaFile = fileSaya.readText()
    println(bacaFile)

    //baca file - cara2
    println("\n=== Cara2 Baca File ===")
    var fileKamu = File("src/oop_00000133272_tevathanielhartanto/materi13/contohfile.txt")
    var bacaFile2 = fileKamu.readLines()
    bacaFile2.forEach() {
        println("Ke2:::: " + it)
    }

    //baca file - cara3 (bufferedReader)
    println("\n=== Cara3 Baca File - BUFFERED READER ===")
    val br = BufferedReader(FileReader("src/oop_00000133272_tevathanielhartanto/materi13/contohfile.txt"))
    var baris:String? = br.readLine()
    while(baris!=null){
        println(baris)
        baris = br.readLine()
    }
    br.close()

    //baca file - cara4 (bufferedReader)
    println("\n=== Cara4 Baca File - BUFFERED READER (Versi.USE)===")
    val br2 = BufferedReader(FileReader("src/oop_00000133272_tevathanielhartanto/materi13/contohfile.txt"))
    br2.use {
        baris -> baris.lineSequence()
        .filter { it.isNotEmpty() }
        .forEach { println(it) }
    }

    //Buat file - Cara1
    println("\n=== Cara1 Buat File ===")
    val fileBuat = File("src/oop_00000133272_tevathanielhartanto/materi13/fileBuatanSaya.txt")
    fileBuat.writeText("ini adalah baris pertama\n Ini Keduaa!!!")

    fileBuat.appendText("\nIni Baris KEtiGAaaaAaaaaAA..")
    fileBuat.appendText("\njoaidjoisajidasidj qwerty")
    fileBuat.appendText("\ndajowjidjioadwjoi qwerty")

    val contohList = listOf("Nasi Goreng", "Bakpau", "Siomay")
    fileBuat.appendText("\n" + contohList.joinToString("\n"))

    println("\n=== Cara2 Buat File ===")
    fileBuat.printWriter()
}