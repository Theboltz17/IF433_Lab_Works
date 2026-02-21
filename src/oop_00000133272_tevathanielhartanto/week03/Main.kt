package oop_00000133272_tevathanielhartanto.week03

fun main() {
    val e = Employee("Budi")

    // Test validasi salary
    e.salary = -1000 // Harusnya error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // Test encapsulation
    e.increasePerformance()
    // e.performanceRating = 5, kalo uncomment merah

    // Test computed property
    println("Pajak yang harus dibayar: ${e.tax}")
}