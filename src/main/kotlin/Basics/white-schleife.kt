package Basics

fun main(args: Array<String>){
    var x: Int = 10
    while (x > 0){
        x = x -1
    }
    //x = 0
    do {  // <- do wird so lange ausgeführt bis die bedingung der while-schleife erfüllt wird | Dazu wird do mindestens 1 mal ausgeführt auch wenn while auf false ist
        println(x)
        x = x + 1
    }while (x < 0)
    println(x)
}