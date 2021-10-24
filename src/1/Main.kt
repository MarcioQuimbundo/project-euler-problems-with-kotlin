fun main() {
    val target = 1000
    var sum = 0
    var counter = 0

    while (counter < target) {
        if(counter % 3 == 0 || counter % 5 == 0) sum += counter
        counter++
    }
    println(sum)
}