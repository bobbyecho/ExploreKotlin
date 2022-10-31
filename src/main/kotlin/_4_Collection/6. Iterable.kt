package _4_Collection

fun <T> printIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while(iterator.hasNext()) println(iterator.next())
}

fun <T> printMutableIterable(iterable: MutableIterable<T>) {
//    we can just do it with for loop
//    for (item in iterable) {
//        println(item)
//    }

    val iterator = iterable.iterator()
    while(iterator.hasNext()) {
        println(iterator.next())
    }
}

fun main() {
    printIterable(listOf("Sarah", "Bobby"))
    printIterable(arrayListOf("Cam", "Cung"))
    printIterable(setOf("Cung", "Cam"))

    printMutableIterable(mutableListOf("Sarah", "Bobby"))
    printMutableIterable(arrayListOf("Cam", "Cung"))
    printMutableIterable(mutableSetOf("Cung", "Cam"))
}