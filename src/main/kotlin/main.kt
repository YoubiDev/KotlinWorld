fun main(args: Array<String>){
    val width: Int = 1920

    //Byte: 8 Bit, Short: 16 Bit, Int: 32 Bit, Long: 64 Bit

    val height: Int = 1080
    var Pixels: Int = width * height

    // val = Value (Final), var = Varibale (veränderbar)

    val pi: Double = 3.14

    //Float: 32 Bit, Double: 64 Bit

    val Finn: String = "Finn"

    //Man kann auch String als val benutzen

    println(width + height)
    println(Pixels)
    println(Finn)



    val experiment: Float = 3.14351222f
    val experimentd: Double = 3.124123342436236223423
    val Nachkommerstelle: Double = 3.0 // <- Man muss eine Nachkommerstelle angeben genau wie bei Float
    
    println(experiment)

    //Ergebnis: 3.1435122

    println(experimentd)

    //Ergebnis: 3.1241233424362362
}