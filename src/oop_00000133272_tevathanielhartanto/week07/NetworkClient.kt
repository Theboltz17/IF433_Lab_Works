package oop_00000133272_tevathanielhartanto.week07

class NetworkClient private constructor(val urL: String) {

    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connectiong to $BASE_URL...")
    }
}