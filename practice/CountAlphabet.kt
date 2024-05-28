fun countAlphabet(str: String): Int {
    val alphabetSet = mutableSetOf<Char>()
    for (i in str) {
        alphabetSet.add(i)
    }
    val answer = alphabetSet.size
    return answer
}
countAlphabet("apple")
countAlphabet("banana")

//대소문자 동일 처리
fun countAlphabet2(str: String): Int {
    val alphabetSet = mutableSetOf<Char>()
    for (i in str) {
        if (i.code in 65..90) {
            alphabetSet.add(((i.code + 32).toChar()))
        } else {
            alphabetSet.add(i)
        }
    }
    val answer = alphabetSet.size
    return answer
}
countAlphabet2("banAna")
//알파벳만 카운트
fun countAlphabet3(str: String): Int {
    val alphabetSet = mutableSetOf<Char>()
    str.forEach {
        when (it) {
            in 'A'..'Z' -> alphabetSet.add(it + ('a' - 'A'))
            in 'a'..'z' -> alphabetSet.add(it)
        }
    }
    return alphabetSet.size
}
countAlphabet3("ban Ana")
println('a'.toInt())
println(('A').toInt())
