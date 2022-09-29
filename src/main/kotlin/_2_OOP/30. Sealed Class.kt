package _2_OOP

sealed class Operation(val name: String)
class Plus: Operation("Plus")
class Minus: Operation("Minus")
class Modulo: Operation("Modulo")

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(1, 5, Plus()))
    println(operation(5, 4, Minus()))
    println(operation(5, 2, Modulo()))
}