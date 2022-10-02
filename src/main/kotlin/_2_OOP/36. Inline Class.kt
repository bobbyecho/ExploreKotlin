inline class Token(val value: String) {
    fun toUpper() = value.uppercase()
}

fun main() {
    val token = Token("Hasdkqwe")
    println(token.toUpper())
}