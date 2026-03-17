package oop_00000133272_tevathanielhartanto.materi07

sealed class Hasil{

    data class Sukses(val data:String) : Hasil()
    data class Error(val ex: Exception) : Hasil()
    object loading:Hasil()

    fun handle_response(res:Hasil) {
        when(res) {
            is Sukses -> { println("Sukses lempar data ${res.data}") }
            is Error -> { println("Pesan Error ${res.ex}") }
            loading -> { println("Lagi Loading...") }
        }
    }
}