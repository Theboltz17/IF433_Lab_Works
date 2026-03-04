package oop_00000133272_tevathanielhartanto.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengjar() // INI AKAN ERROR karena tipe referensinya adalah pegawai

        // Smart Casting dengan is dan when
        when(pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------")

        println(" TEST OVERLOADING ")
        val mathHelper = MathHelper()

        println("Luas Persegi (4): ${mathHelper.hitungLuas(4)}")
        println("Luas Persegi Panjang (4x5): ${mathHelper.hitungLuas(4, 5)}")
        println("Luas Lingkaran (r=7): ${mathHelper.hitungLuas(7.0)}")
        println()

        println(" TEST PAYMENT SYSTEM")

        val eWallet = EWallet("Teva Wallet", 50000.0)
        val creditCard = CreditCard("Teva Card", 100000.0)

        val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

        for (payment in paymentMethods) {

            payment.processPayment(75000.0)

            if (payment is EWallet) {
                payment.topUp(50000.0)
                payment.processPayment(75000.0)
            }

            println()
        }
    }
}