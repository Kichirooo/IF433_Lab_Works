package oop_00000110585_AndrewReynardHamdani.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        pritnln("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }
}

fun mengajar() {
    println("[$nama] sedang mengajar mahasiswa di kelas.")
}