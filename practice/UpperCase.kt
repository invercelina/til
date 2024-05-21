practice()

fun practice() {
    println("== 변수 활용 ==")
    repeat(5) { swap((1..100).random(), (1..100).random()) }

    println("== 조건문 활용 ==")
    repeat(5) {
        val score = (50..100).random()
        println("$score 의 등급은 ${convertToGrade(score)} 입니다.")
    }

    println("== 반복문 조건문 활용 ==")
    val wordList = listOf("intel", "Android", "easy", "hello world")
    wordList.forEach { println("${it}'s uppercase is ${getUppercase(it)}") }

}

fun swap(input1: Int, input2: Int) {
    var a = input1
    var b = input2
    println("swap 전 - a: $a, b: $b")
    val temp = a
    a = b
    b = temp
    println("swap 후 - a: $a, b: $b")
}

fun convertToGrade(input: Int): String {
    //
    //TODO: 90 점 이상이면 A, 80이상 90미만 B, 70이상 80미만 C, 60이상 70미만 D, 60미만 F
    //
    val str: String = when {
        input >= 90 -> "A"
        input >= 80 -> "B"
        input >= 70 -> "C"
        input >= 60 -> "D"
        else -> "F"
    }
    return str
}

fun getUppercase(input: String): String {
    //
    //TODO: 입력받은 단어를 전부 대문자로 바꾸는 함수
    // 주의 - uppercase() 함수 사용 금지
    //
    val chars = mutableListOf<Char>()
    input.forEach {
        if (it.code > 96) {
            chars.add((it.code - 32).toChar())
        } else {
            chars.add((it.code).toChar())
        }
    }
    val output: String = chars.joinToString(separator = "")

    return output
}
