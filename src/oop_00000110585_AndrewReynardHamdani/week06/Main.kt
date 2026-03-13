package oop_00000110585_AndrewReynardHamdani.week06

fun main() {
    val hub = SmartHomeHub()

    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("--- Menjalankan Sistem Smart Home ---")
    hub.activateSecurityMode()

    println("\n--- Mematikan Seluruh Saklar ---")
    hub.turnOffAllSwitches()
}