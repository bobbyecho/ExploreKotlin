fun main() {
    fun calculatorHOF(valueA: Int, valueB: Int, calculate:  (Int, Int) -> Int): Int {
        return calculate(valueA, valueB);
    }

    println(calculatorHOF(1, 2, fun(num1, num2): Int {
        return num1 + num2
    }))

    println(calculatorHOF(5, 5, fun(num1, num2): Int {
        return num1 * num2
    }))
}