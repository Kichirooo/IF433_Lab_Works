package oop_00000110585_AndrewReynardHamdani.week11


fun String.addGreeting(): String {
    return "Hello, $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}