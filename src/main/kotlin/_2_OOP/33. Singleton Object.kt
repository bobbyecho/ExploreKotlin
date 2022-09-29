object Utilities {
    val name = "Utilities"
    fun toUpper(value: String): String {
        return value.uppercase()
    }
}

class Application(val name: String) {
    object Utilities {
        fun hello(name: String): Unit {
            println("Hello $name")
        }
    }
}

fun main() {
    println(Utilities.toUpper("Bobby"))
    println(Utilities.name)

    Application.Utilities.hello("Bobby")
}