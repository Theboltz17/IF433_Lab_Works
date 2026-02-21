package oop_00000133272_tevathanielhartanto.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== Testing Weapon ===")

    val sword = Weapon("Excalibur")

    sword.damage = -50
    println("Damage sekarang: ${sword.damage}")

    sword.damage = 9999
    println("Damage sekarang: ${sword.damage}")
    println("Tier: ${sword.tier}")
    println("\n=== Testing Player ===")

    val player = Player("Teva")

    //println(player.xp), cannot access var xp

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")

}