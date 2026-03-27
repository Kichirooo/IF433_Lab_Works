package oop_00000110585_AndrewReynardHamdani.week07

class NetworkCline private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url")
    }
}