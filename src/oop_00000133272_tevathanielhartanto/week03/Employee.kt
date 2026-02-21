package oop_00000133272_tevathanielhartanto.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0 // pake field jangan this.salary
            } else {
                field = value // pake field buat assign nilai asli
            }
        }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat =! Rating: $performanceRating")
    }

    // Kita tidak buat getter untuk performanceRating, jadi data ini benar-benar rahasia
    // Kecuali kita buat function khusus untuk print
    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
    // pajak
    val tax: Double
        get() = salary * 0.1
}