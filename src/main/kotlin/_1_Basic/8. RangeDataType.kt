fun main() {
    val range = 1..100
    println(range)
    println(range.count())
    println(range.contains(100))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)

    println("\n--------------\n")

    val rangeDownTo = 100 downTo 1
    println(rangeDownTo)
    println(rangeDownTo.count())
    println(rangeDownTo.contains(100))
    println(rangeDownTo.contains(200))
    println(rangeDownTo.first)
    println(rangeDownTo.last)
    println(rangeDownTo.step)

    println("\n--------------\n")

    val rangeStep5 = 1..100 step 5
    println(rangeStep5)
    println(rangeStep5.count())
    println(rangeStep5.contains(100))
    println(rangeStep5.contains(200))
    println(rangeStep5.first)
    println(rangeStep5.last)
    println(rangeStep5.step)

    println("\n--------------\n")

    val rangeDownToStep10 = 100 downTo 1 step 10
    println(rangeDownToStep10)
    println(rangeDownToStep10.count())
    println(rangeDownToStep10.contains(100))
    println(rangeDownToStep10.contains(200))
    println(rangeDownToStep10.first)
    println(rangeDownToStep10.last)
    println(rangeDownToStep10.step)
}