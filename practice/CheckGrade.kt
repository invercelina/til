practice()

fun practice() {
    repeat(5) {
        val score = (50..100).random()
        val grade = listOf('a','b','c','d','f').random()
        println("'{$score}의 등급 == ${grade}' is ${checkGrade(score, grade)}")
    }
}

fun checkGrade(score: Int, grade: Char): Boolean {
    val checker : Char = when {
        score >= 90 -> 'a'
        score >= 80 -> 'b'
        score >= 70 -> 'c'
        score >= 60 -> 'd'
        else -> 'f'
    }
    var result = true
    if(grade != checker){
        result = false
    }
    return result
}
