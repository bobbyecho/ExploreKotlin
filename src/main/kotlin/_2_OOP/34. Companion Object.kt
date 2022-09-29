class ApplicationCompanion(val name: String) {
    companion object {
        fun hello(name: String): Unit {
            println("Hellowww, $name")
        }
    }
}

fun main() {
    ApplicationCompanion.hello("Hello") // recommended
    ApplicationCompanion.Companion.hello("Hello") // we can access hello without companion
}