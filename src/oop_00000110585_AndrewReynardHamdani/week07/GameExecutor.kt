package oop_00000110585_AndrewReynardHamdani.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Peringatan! Kamu berhadapan dengan monster: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            println("Selamat! Kamu mendapatkan loot: ${event.item.name} (Kelangkaan: ${event.item.rarity})")
        }
        is BattleState.GameOver -> {
            println("Layar Menghitam... Game Over! Alasan: ${event.reason}")
        }
        is BattleState.SafeZone -> {
            println("Kamu memasuki Zona Aman. Silakan beristirahat dan memulihkan HP.")
        }
    }
}