package oop_00000133272_tevathanielhartanto.materi07

fun main() {
    Koneksi.kon = "localhost:8080"
    println("Link ${Koneksi.kon}")
    Koneksi.coba_konek_db()

    Hitungan.tambah(10, 20)
    Hitungan.kali(30, 50)
    println("Nama matkul: ${Hitungan.namaMtk}")

    Hitungan.buat_data("User biasa")

    val dt = SaveData("Rendy",
        100,
        8,
        50)
    println("Nama char ${dt.namaChar}")
    println(dt)

    val dtCopy = dt.copy(namaChar = "Luigi")
    println("Nama ${dtCopy.namaChar}")
    println(dtCopy)

    println("=== class ENUM===")
    val arh = Arah.Atas
    println(arh.tampilkan_isi_param())

    println("--- SEALED Class ---")

    val hsl: Hasil = Hasil.Sukses(",Berhasil simpan")
    hsl.handle_response(hsl)
}