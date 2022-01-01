fun main(args: Array<String>){
    //Fakultät: 5! = 5*4*3*2
    var n: Int = 5
    var x: Int = 1
    var fakultaet: Int = 1
    while (x <= n){
        fakultaet = fakultaet*x
        x = x+1
        print(fakultaet)
    }
}