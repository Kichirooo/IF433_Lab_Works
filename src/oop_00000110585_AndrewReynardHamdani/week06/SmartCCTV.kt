package oop_00000110585_AndrewReynardHamdani.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name (ID: $id) diaktifkan.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name (ID: $id) dinonaktifkan.")
    }

    override fun startRecord() {
        println("CCTV $name: Sensor gerak aktif, mulai merekam video...")
    }
}