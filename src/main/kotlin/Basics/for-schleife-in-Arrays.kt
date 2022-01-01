package Basics

fun main(args: Array<String>){
    val meinArray: String = "hello world!"
    for (buchstabe in meinArray){
        print(buchstabe+3)
    }

    print("\n")
    for (index in meinArray.indices){
        print(index)
        print(meinArray[index])
    }

    //Aufgabe
    var verschluesselt = arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')
    for (buchstabe: Char in meinArray){
        print(buchstabe+3)
    }
    print("\n")
    for (index in meinArray.indices){
        verschluesselt[index] = meinArray[index] + 3
    }

    val encrypted: String = String(verschluesselt.toCharArray())
    println(encrypted[5])

    if (false) {
        for (buchstabe: Char in verschluesselt) {
            print(buchstabe - 3)
        }
    }
}
