fun toUpper(value: String): String = value.uppercase()

fun main() {
    val lambdaName: (String) -> String = { name ->
        "Hello $name"
    }

    println(lambdaName("Bobby"))

    /**
     * METHOD REFERENCES
     */
    val lambdaToUpper: (String) -> String = ::toUpper

    println(lambdaToUpper("bobby"))

}