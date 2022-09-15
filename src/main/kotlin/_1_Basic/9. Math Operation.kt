fun main() {
    /**
     * OPERATOR
     * ( + )
     * ( - )
     * ( / )
     * ( * )
     * ( % )
     */

    val result1: Int = 10 / 3
    println(result1)

    val result2: Int = 10 + 10 / 2
    println(result2)

    var result3: Double = 10 / 3.0
    println(result3)

    result3 += 1
    result3 /= 2
    result3 *= 4
    result3 %= 3
    println(result3)

    /**
     * UNARY OPERATOR
     * ( ++ ) -> a = a + 1
     * ( -- ) -> a = a - 1
     * ( - ) -> Negative
     * ( + ) -> Positive
     * ( ! ) -> Opposite Boolean
     */

    var plus = 1;
    plus++
    plus--
    plus--
    plus++
    println(plus)

    val suhu = -1
    println(suhu)

    val flag = true
    println(!flag)
}