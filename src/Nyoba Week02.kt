class MyCar {
    public var warna:String = "merah"
    public var kecepatan:Int = 100

    init {
        if(this.kecepatan>=70) {
            println("Kecepeten kocak")
        } else {
            println("Aman")
        }
    }

    constructor(speed: Int= 10, brake: Double= 1.3) {
        this.kecepatan = speed
        println("Dari secondary constructor: $kecepatan dan $brake")
    }

    fun mulai_jalan() {
        println("Kecepatan $warna nya luar biasa")
    }
}

fun main() {
    val myCar = MyCar(speed = 100, brake = 6.7)
    myCar.warna = "nyoba"
    myCar.mulai_jalan()
    myCar.warna = "biru"

    println ("Warna Mobil baru = ${myCar.warna}")
}

