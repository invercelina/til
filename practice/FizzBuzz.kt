fun main() {
    for (i in 1..100)
    when {
        i % 15 == 0 -> print("FizzBuzz")
        i % 3 == 0 -> print("Fizz")
        i % 5 == 0 -> print("Buzz")
        else -> print(i)
    }

for (j in 1..100)
    if (j % 15 == 0) {
        print("FizzBuzz")
    } else if (j % 3 == 0) {
        print("Fizz")
    } else if (j % 5 == 0) {
        print("buzz")
    } else {
        print(j)
    }
}
