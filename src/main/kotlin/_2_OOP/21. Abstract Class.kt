abstract class Location(val address: String)

class Map(address: String): Location(address)

fun main() {
    val googleMap = Map("Bali, Bumi Indah")
    println(googleMap.address)
}