class Car(val name: String) {
    override fun toString(): String {
        return "Car with Name $name"
    }
}

fun main() {
    println(Car("Toyota"))
    println(Car("Toyota").toString())
}