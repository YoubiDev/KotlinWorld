fun main(args: Array<String>) {

    var a: Int = 12
    var b: Int = 132

    var wahrheitswert: Boolean = a > b
    println(wahrheitswert)      // false

    var wahrheitswert1: Boolean = a < b
    println(wahrheitswert1)     // true

    var wahrheitswert2: Boolean = a == b
    println(wahrheitswert2)     // false

    var wahrheitswert3: Boolean = a < b && 42 > 5
    println(wahrheitswert3)     // true

    var wahrheitswert4: Boolean = a < b || 42 > 5
    println(wahrheitswert4)     // true

    var wahrheitswert5: Boolean = ((a < b) || (42 > 5)) && ("hallo"[0] == 'h')
    println(wahrheitswert5)     // true

    if (((a < b) || (42 > 5)) && ("hallo"[0] == 'h')){
        println("true")           // true wird geprinted weil die if-Abfrage richtig ist
    }

    val wahrheit1: Boolean = a == b
    val wahrheit2: Boolean = 42 < 5
    val wahrheit3: Boolean = wahrheit1 || wahrheit2
    var wahrheitswert6: Boolean = wahrheit3 && ("hallo"[0] == 'h')

    if (wahrheitswert6){
        println(wahrheitswert6) // true
    }
}

