class Laptop(val brand: String)

fun main() {
    val laptop = Laptop("Asus")
    println(laptop.toString())
    println(laptop.hashCode())
}