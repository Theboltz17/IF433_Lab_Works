package oop_00000133272_tevathanielhartanto.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Speaker '$name' menyala.")
    }

    override fun turnOff() {
        println("Speaker '$name' dimatikan.")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}