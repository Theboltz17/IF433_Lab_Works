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
    scanner.nextLine() // bersihkan buffer newline

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

    // Implement the game
    println("\nMINI RPG BATTLE")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val heroDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, heroDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMENU")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            hero.attack("Musuh")

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh sekarang: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas dengan damage $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("HP ${hero.name} sekarang: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.hp > enemyHp) {
        println("${hero.name} MENANG!")
    } else if (enemyHp > hero.hp) {
        println("Musuh MENANG!")
    } else {
        println("Pertarungan berakhir imbang.")
    }

}