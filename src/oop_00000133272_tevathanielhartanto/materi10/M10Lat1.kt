package oop_00000133272_tevathanielhartanto.materi10

// non - generic programming
class nonGeneric(var hasil: Any)

// generic programming
class generic<T>(var hasil:T)

// generic programming - 2 parameter
class Kota<T>(var kodepos:T, var telp:T)

// generic programming - function
fun <T> cobaFungsi(angka:T):T {
    return angka
}

//generic programming - type constraint
fun <T: Number> tambah(angka:T): Double{
    return angka.toDouble() + 50
}

fun <T: Number> kurang(angka:T): Int{
    return angka.toInt() - 50
}

//generic programming - function in class
class kalkulator<T:Number>(val a:T, val b:T){
    fun kali():Double {
        return a.toDouble() * b.toDouble()
    }
    fun bagi(): Int {
        return a.toInt() / b.toInt()
    }
}

//generic programming - WHERE
fun <T> nilaiKKM(list: List<T>, kkm:T): List<T> where T: Comparable<T> {
    return list.filter { it>=kkm }
}

fun main() {
    println("====== Generic - WHERE ======")
    val nilaiMhs = listOf(88,90,83,70,65,50,83,40,61)
    val nilaiFilterKKM = nilaiKKM(nilaiMhs, kkm = 70)
    println(nilaiMhs)
    println(nilaiFilterKKM)

    println("====== Generic - Function in class ======")
    val kalk = kalkulator(10.2, 3.5)
    println("Hasil Kali: ${kalk.kali()}")
    println("Hasil Bagi: ${kalk.bagi()}")

    println("====== Generic - Constraint ======")
    println("Hasil tambah" + tambah(100.5))
    println("Hasil kurang" + kurang(100.5))

    // pengaplikasian non-generic programming
    println("====== Non-Generic ======")
    val nGen = nonGeneric(100)
    val angkaNGen = nGen.hasil as Int
    println(angkaNGen+ 50)

    // pengaplikasian generic programming
    println("====== Generic ======")
    val gen = generic(200)
    println(gen.hasil + 50)

    println("====== Generic 2 Parameter ======")
    val city = Kota("12345", 880123)
    println("kodepos kamu " + city.kodepos)
    println("telp kamu " + city.telp)


    println("====== Generic = function ======")
    println("coba fungsi: " + cobaFungsi(10))
}