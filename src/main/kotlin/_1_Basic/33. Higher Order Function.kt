fun helloHOF(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}

fun calculatorHOF(valueA: Int, valueB: Int, calculate:  (Int, Int) -> Int): Int {
    return calculate(valueA, valueB);
}

fun main() {
    println(helloHOF("bobby", {
        it.uppercase()
    }))

    /**
     * trailing lambda
     */
    println(calculatorHOF(1,2) { value1, value2 ->
        value1 + value2
    })

    println(calculatorHOF(5,2) { value1, value2 ->
        value1 * value2
    })
}