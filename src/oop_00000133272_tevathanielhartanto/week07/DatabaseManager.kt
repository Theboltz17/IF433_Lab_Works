package oop_00000133272_tevathanielhartanto.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready. ")
    }
}