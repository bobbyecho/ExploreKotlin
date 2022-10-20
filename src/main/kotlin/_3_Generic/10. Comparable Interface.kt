class Fruits(val name: String, private val quantity: Int): Comparable<Fruits> {
    override fun compareTo(other: Fruits): Int {
        return quantity.compareTo(other.quantity)
    }
}

fun main() {
    val fruit1 = Fruits("Apple", 10)
    val fruit2 = Fruits("Banana", 50)

    println(fruit1 > fruit2)
    println(fruit2 > fruit1)
}