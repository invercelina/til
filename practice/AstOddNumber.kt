fun main() {
    val n = 9
    for (i in 1..n)
        if (i % 2 == 1) {
            for (j in 1..i) {
                print("*")
            }
            println("")
        }
}
