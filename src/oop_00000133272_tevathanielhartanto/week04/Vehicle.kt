package oop_00000133272_tevathanielhartanto.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        println("$brand melaju. Kecepatan: $speed km/jam.")
    }

    open fun honk() {
        println("Beep beep!")
    }
}