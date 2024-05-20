fun selectionSort(input: List<Int>): List<Int> {
    val numberList = input.toMutableList()
    val output = mutableListOf<Int>()
    while (numberList.size > 0) {
        var temp = 0
        var i = 0
        while (i < numberList.size) {
            if (temp < numberList[i]) {
                temp = numberList[i]
            }
            i++
        }
        output.add(temp)
        numberList.remove(temp)
    }
    return output
}

println(selectionSort(listOf(2, 8, 5, 4, 9)))
// 출력 : [9, 8, 5, 4, 2]
