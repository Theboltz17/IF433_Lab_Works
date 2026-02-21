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
}