fun returnHelloIf(name: String? = null): String {
    return if (name.isNullOrEmpty()) {
        "i dont have name"
    } else {
        "hello $name"
    }
}

fun returnHelloWhen(name: String? = null): String {
    return when (name) {
        "" -> "i dont have name"
        else ->  "i have name"
    }
}

fun main() {
    println(returnHelloIf("Sarah"))
    println(returnHelloIf(""))

    println(returnHelloWhen("Sarah"))
    println(returnHelloWhen(""))
}