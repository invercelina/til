fun insertionSort(input: List<Int>): List<Int> {
    val output = input.toMutableList()
    for (i in 1 until output.size) {
        val temp: Int = output[i]
        for (j in i - 1 downTo 0) {
            if (temp > output[j]) {
                output[j + 1] = output[j]
                output[j] = temp
            } else {
                break
            }
        }
    }
    return output
}

print(insertionSort(listOf(7, 5, 9, 4, 2)))
// 출력 : [9, 7, 5, 4, 2]
