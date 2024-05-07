fun main() {
    val n = 5
    for (i in 1..n)
        if (i % 2 == 1) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }

    val m = 11
    var k = 1
    var l = 0
    while (k <= m) {
        while (k % 2 == 1) {
            while (l < k) {
                print("*")
                l++
            }
            l = 0
            println()
            k++
        }
        k++
    }
}
