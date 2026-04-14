package oop_00000133272_tevathanielhartanto.materi08

class profile_page(val idprofile:String?, val statusOnline:String?) {
    fun ganti_foto(filePhoto:String?) {
        println("foto kamu ${filePhoto}")
    }
}

fun main() {
    var nama:String? = "Teps"
    nama = null
    println("nama kamu $nama")

    val profile = profile_page("123456", "null")
    println("id ${profile.idprofile}, status ${profile.statusOnline}")

    profile.ganti_foto(null)
}