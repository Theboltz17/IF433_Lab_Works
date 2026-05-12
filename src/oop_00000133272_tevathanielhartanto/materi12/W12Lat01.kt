package oop_00000133272_tevathanielhartanto.materi12

import java.text.NumberFormat

fun pembagian() {
    try {
        val a = 10
        val b = 2
        val hasil = a/b
        println("Hasil bagi $hasil")
    } catch (e: Exception) {
        println("Ada error " + e.message)
    } finally {
        println("Selesai try catch")
    }
}

fun cek_tipe_variable() {
    var angka:Int = try {
        Integer.parseInt("123123")
    } catch (e: Exception) {
        println("ada error ${e.message}")
        -77
    }
    println(angka)
}

fun cek_nilai(nilai:Int) {
    if(nilai<0) {
        throw IllegalArgumentException("Masa Nilai Minus")
    } else if (nilai > 100) {
        throw IllegalArgumentException("Nilai ga bisa lebih dari 100")
    } else {
        println("Nilai kamu adalah " + nilai)
    }
}

class cek_saldo_rekening(val pengeluaran:Int, val saldo:Int):
    Exception("Saldo kamu sisa $saldo, gak cukup buat belanja $pengeluaran")

class transaksi_keuangan(val totalBelanja:Int) {
    fun narik_uang(balance:Int) {
        if(totalBelanja > balance) {
            try {
                throw cek_saldo_rekening(totalBelanja, balance)
            } catch (e: Exception) {
                println(e.message)
            }
        } else {
            println("Transaksi Berhasil, sisa saldo ${balance - totalBelanja}")
        }
    }
}

fun multiple_catch(input:String) {
    try {
        val angka:Int = input.toInt()
        val hitungBagi:Int = angka/0
        println("Hasil bagi $hitungBagi")
    } catch (e: NumberFormatException) {
        println("Ga bisa membagi bilangan huruf ${e.message}")
    } catch (e: ArithmeticException) {
        println("Masa pembagian pake 0 : ${e.message}")
    } catch (e: Exception) {
        println("Ada error di multiple catch ${e.message}")
    }
}

sealed class BANKException(pesan:String): Exception("Error di BANK Exception $pesan")

class cek_saldo(val pengeluaran:Int): BANKException("Belanja $pengeluaran > saldo")
class cek_input(val transaksi:Int): BANKException("transaksi masa minus $transaksi")

fun transaksi_belanja(saldoKamu:Int, jajanKamu:Int):Int {
    if(jajanKamu < 0) {
        throw cek_input(jajanKamu)
    } else if(saldoKamu < jajanKamu) {
        throw cek_saldo(jajanKamu)
    }
    return saldoKamu - jajanKamu
}

fun main() {
    runCatching { transaksi_belanja(1000, 800) }
        .onSuccess {println("Belanja Berhasil, sisa saldo $it ")}
        .onFailure {println(it)}

    multiple_catch("abc")

    pembagian()
    cek_tipe_variable()
    try {
        cek_nilai(110)
    } catch(e:Exception) {
        println("ada error di nilai: " + e.message)
    }
    val trx = transaksi_keuangan(1000)
    trx.narik_uang(1200)
}