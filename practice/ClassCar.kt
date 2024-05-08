fun main() {
    val car1 = Car("K5", 20, 200, Car.Color.Black)

    car1.printInfo()

    println("현재 속도는 ${car1.getSpeeds()}km/h 입니다.")

    car1.increaseSpeed(20)

    println("현재 속도는 ${car1.getSpeeds()}km/h 입니다.")

    car1.addGas(40)
}

class Car(val model: String, var speed: Int, var gas: Int, val color: Color) {

    enum class Color {
        Black,
        White,
        Green,
        Blue,
        Red,
    }

    fun printInfo() {
        println("model: $model")
        println("color: $color")

    }

    fun getSpeeds(): Int {
        return speed
    }

    fun increaseSpeed(acc: Int) {
        speed += acc
    }

    fun addGas(newGas: Int): Unit {
        println("현재 ${gas + newGas}만큼 남아있습니다.")
    }

}
