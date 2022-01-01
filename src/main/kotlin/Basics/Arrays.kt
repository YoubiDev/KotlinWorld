fun main(args: Array<String>){
    var myArray = arrayOf(123,234,456,"Hellow World!")

    // myArray[x] = 0: 123; 1: 234; 2:456; 3: "Hello World!"
    // Man fängt immer ab der 0 an
    //ICH WAR HIER ;P
    println(myArray[2]) // Ausgabe: 456

    myArray[2] = "Lerning by doing!" // <- Überschreibung des Zweiten Arguments daher:  2 != 456  ->  2 = "Lerning by doing!"

    println(myArray[2]) // Ausgabe: "Lerning by doing!"

    myArray = Array(2){i -> i}

    println(myArray[1])             // Ausgabe: 1
}

