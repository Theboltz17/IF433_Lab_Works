package oop_00000133272_tevathanielhartanto.week14

import java.io.File

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP), Melakukan kalkulasi + I/O + Notifikasi sekaligus
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {

        // VIOLATION: Kaku jika ada tipe customer/diskon baru di masa depan (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP"     -> basePrice * 0.90 // Diskon 10%
            else      -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// === SRP & DIP FIX ===

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File("orders_safe.csv").printWriter().use { writer ->
            writer.println("$itemName,$finalPrice,$customerType")
        }
        println("Order disimpan ke CSV: $itemName, $finalPrice, $customerType")
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
) {
    fun processOrder(itemName: String, finalPrice: Double, customerType: String) {
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.90
}

fun main() {
    println("=== BAD ORDER PROCESSOR ===")
    val bad = BadOrderProcessor()
    bad.processOrder("Laptop", 15000000.0, "VIP")

    println("\n=== SAFE ORDER PROCESSOR (SOLID) ===")
    val repo     = CsvOrderRepository()
    val notifier = EmailNotifier()
    val safe     = SafeOrderProcessor(repo, notifier)

    val vipPricing     = VipPricing()
    val regularPricing = RegularPricing()

    safe.processOrder("Laptop",    vipPricing.calculate(15000000.0),     "VIP")
    safe.processOrder("Headphone", regularPricing.calculate(500000.0), "REGULAR")
}