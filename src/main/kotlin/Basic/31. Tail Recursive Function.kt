// tailrec transform recursive into for loop to avoid callstack overflow
// tailrec can't call anthing after call himself

// INCORRECT
//tailrec fun decrement(value: Int): Int {
//    if (value < 0) {
//        return 1
//    }
//
//    return display(value - 1) * value
//}

tailrec fun display(value: Int): Int {
    println("value: $value")
    if (value == 1) {
        return value
    }
    return display(value - 1)
}

tailrec fun factorialTailRec(value: Int, total: Int = 1): Int {
    return when(value) {
        1 -> total
        else -> factorialTailRec(value - 1,total * value)
    }
}

fun main() {
    println(display(10))


    println(factorialTailRec(5))
    // factorialTailRec(5, 1)
    // factorialTailRec(4, 5)
    // factorialTailRec(3, 20)
    // factorialTailRec(2, 60)
    // factorialTailRec(1, 120)
    // 1 -> stop -> 120

}