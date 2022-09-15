infix fun String.to(type: String): String {
    return when(type) {
        "upcase" -> this.uppercase()
        "downcase" -> this.lowercase()
        else -> this
    }
}

fun main() {
    println("Bobby" to "downcase")
    println("Bobby" to "upcase")
    println("Bobby" to "snackcase") // type not found, return itself
}