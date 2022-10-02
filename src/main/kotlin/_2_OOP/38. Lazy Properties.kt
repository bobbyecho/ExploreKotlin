class Lazy {
    val name: String by lazy {
        println("Lazy")
        "Bobby"
    }
}

fun main() {
    val lazy = Lazy()
    println(lazy.name)
    println(lazy.name)
    println(lazy.name)
}