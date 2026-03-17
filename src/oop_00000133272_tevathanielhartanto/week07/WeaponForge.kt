package oop_00000133272_tevathanielhartanto.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            println("Menempa Pedang Kayu Bapuk...")
            return Weapon(
                item = GameItem("Pedang Kayu Bapuk", damage = 5, rarity = ItemRarity.COMMON),
                durability = 50
            )
        }

        fun forgeEpicSword(): Weapon {
            println("Menempa Pedang Naga Merah...")
            return Weapon(
                item = GameItem("Pedang Naga Merah", damage = 80, rarity = ItemRarity.EPIC),
                durability = 200
            )
        }
    }
}
