data class DataHuman(
    val name: String,
    val age: Number
)

fun main() {
    val bobby = DataHuman(
        name = "bobby",
        age = 17
    )

    val sarah = bobby.copy(name = "sarah")

    println(bobby)
    println(bobby.name)
    println(bobby.age)

    println(sarah)
}