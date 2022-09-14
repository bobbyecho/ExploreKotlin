fun hello(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

fun main() {
    hello("Bobby", "Echo Prasetyo")
    hello("Sarah")
}