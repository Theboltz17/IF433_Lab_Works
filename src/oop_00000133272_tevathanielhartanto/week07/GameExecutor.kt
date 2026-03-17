package oop_00000133272_tevathanielhartanto.week07

fun processEvent(event: BattleState) {
    val message = when (event) {
        is BattleState.MonsterEncounter -> "  Monster muncul: ${event.monsterName}! Bersiaplah bertarung!"
        is BattleState.LootDropped      -> "  Item ditemukan: ${event.item.name} | Damage: ${event.item.damage} | Rarity: ${event.item.rarity}"
        is BattleState.GameOver         -> "  Game Over! Alasan: ${event.reason}"
        BattleState.SafeZone            -> "  Kamu berada di Safe Zone."
    }
    println(message)
}