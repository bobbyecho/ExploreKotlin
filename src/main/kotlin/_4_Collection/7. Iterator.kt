package _4_Collection


fun <T> printListIterator(listIterator: ListIterator<T>) {
    println("Display Next")
    while(listIterator.hasNext()) {
        println(listIterator.next())
    }

    println("Display Previous")
    while(listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while(mutableListIterator.hasNext()) {
        val item = mutableListIterator.next()
        if (item % 2 == 1) mutableListIterator.remove()
    }
}
fun main() {
    printListIterator(listOf("Bobby", "Sarah").listIterator())
    val number = mutableListOf(1,2,3,4,5,6)
    removeOddNumber(number.listIterator())
    printListIterator(number.listIterator())
}