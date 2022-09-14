fun countTotalArr(values: Array<Int>): Int {
    var total = 0

    for(value in values) {
        total += value
    }

    return total
}

fun countTotalVarargs(vararg values: Int): Int {
    var total = 0

    for(value in values) {
        total += value
    }

    return total
}

fun main() {
    println(countTotalArr(arrayOf(1, 2 ,3 ,4)))

    println(countTotalVarargs(1, 2, 3, 4))
}