package oop_00000133272_tevathanielhartanto.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value // salah
        }
}