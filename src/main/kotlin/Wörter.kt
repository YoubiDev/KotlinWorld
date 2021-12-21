fun main(args: Array<String>){
    var character: Char = 'a'
    character = '\t' // <- '\t' = Tabulator

    character = '\n' // <- '\n' = Neue Zeile

    character = '\'' // <- Möglichkeit auch den Backslash auszugeben

    character = '\u0A09' // <- Verwendung von Unicode in dem Fall: ਉ

    print(character)

    println("Hello \n \t World!") // <- Man kann auch \n sowie \t Im String verwenden
}