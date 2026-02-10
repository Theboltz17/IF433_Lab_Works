package oop_00000133272_tevathanielhartanto.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Bersihkan buffer newline

    // validasi di sisi pemanggil (Main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        // Program berhenti di sini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Instansiasi Objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

    // Setelah input NIM dan validasi panjang NIM

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // Consume newline

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        // Memanggil Primary Constructor
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        // Memanggil Secondary Constructor, jurusan otomatis "Non-Matriculated"
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

    // Library input system

    println("\n Library Fine System")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Durasi Peminjaman (Hari): ")
    var duration = scanner.nextInt()

    // Validasi Logika
    if (duration < 0) {
        println("Durasi peminjaman tidak boleh minus, otomatis berubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(bookTitle, borrower, duration)

    println("\nDetail Peminjaman")
    println("Judul Buku         : ${loan.bookTitle}")
    println("Peminjam           : ${loan.borrower}")
    println("Durasi Peminjaman  : ${loan.loanDuration} hari")
    println("Harga Denda        : Rp ${loan.calculateFine()}")
}