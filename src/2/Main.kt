package `2`

fun main() {
    var counter = 0
    var term1 = 0
    var term2 = 1
    var sum = 0
    var temp: Int

    while (counter < 33) {
        if (term2 % 2 == 0) {
            sum += term2
        }
        temp = term2
        term2 += term1
        term1 = temp
        counter ++
    }
    println(sum)
}