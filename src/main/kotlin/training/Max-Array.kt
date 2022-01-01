package training

fun main(args: Array<String>){
    var maxArray = arrayOf(235,325,25,25,25,25,32,67,4578,548,5678,675,856,2452,327,37,33,458,45,8,4,2,4,231,413,12,64,4,5,45,7,86,97,687,7087,345244235,442532,5436,3,6,65,75,68,5698,5,678,57435,34,63,634,63,634,643,3,623,63)
    var max: Int = 0
    for (value in maxArray){
        if (value > max){
            max = value
        }
    }

    print(max)
}