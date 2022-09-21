fun Vape.printUpperCase() = println(name?.uppercase())

fun String.printWithBobby() = println("$this with Bobby")

fun main() {
    Vape("Dotmod").printUpperCase()

    val name: String = "Sarah"
    name.printWithBobby()
}