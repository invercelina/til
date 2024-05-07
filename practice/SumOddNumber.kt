fun main() {
    var sum = 0
    for (i in 2..100 step 2) sum += i
    println(sum)

    var sum1 = 0
    for (i in 1..100)
        if (i % 2 == 0) {
            sum1 += i
        }
    println(sum1)

    var sum2 = 0
    for (i in 1..100)
        when {
            i % 2 == 0 -> sum2 += i
        }
    println(sum2)
}
