package oop_00000133272_tevathanielhartanto.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}