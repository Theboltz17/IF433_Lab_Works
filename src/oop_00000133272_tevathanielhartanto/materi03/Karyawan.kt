package oop_00000133272_tevathanielhartanto.materi03

open class Karyawan {
    private var nama:String = "Kosong"
    private var gaji:Int = 0
    protected var namaPacar:String = "ntntntnt"

    public var umur:Int = 0
        set(value) {
            if(value < 0) {
                println("Tulis umur yang bener kocak")
            } else{
                field = value;
            }
        }
        get() {
            return field
        }

    public fun set_nama(namakamu:String) {
        if(namakamu.length == 0) {
            println("Nama kagak boleh kosong")
        } else {
            this.nama = namakamu
        }
    }
    public fun get_nama():String {
        return this.nama + " tambahan "
    }
    public fun set_gaji(gajikamu:Int) {
        if(gajikamu < 0 ) {
            println("Gaji kamu gak boleh kosong")
        } else {
            this.gaji = gajikamu
        }
    }
    public fun get_gaji():Int {
        return this.gaji
    }
}

class DataPribadi: Karyawan() {

    fun ambil_data_pacar():String {
        return this.namaPacar
    }
}

fun main() {
    var kry = Karyawan()
    kry.set_nama("Kevin Rendy")
    println("Hai " + kry.get_nama())
    kry.set_gaji(2000000)
    println("Gajimu " + kry.get_gaji())

    var dp = DataPribadi();
    dp.set_nama("uwawwwww")
    println("Nama Pacar: " + dp.ambil_data_pacar());
    println("Nama karyawan: " + dp.get_nama());
    dp.umur = 50
    println("Nama karyawan: " + dp.get_nama() + " umur anda " + dp.umur)
}