package _4_Collection

fun <T> printCollection (collection: Collection<T>) {
    for(item in collection) {
        println(item)
    }
}

fun <T> printMutableCollection (collection: MutableCollection<T>) {
    for(item in collection) {
        println(item)
    }
}

fun main() {
    printCollection(listOf("Bobby", "Sarah"))
    printCollection(setOf("Dimas", "Yosua"))
    printCollection(arrayListOf("Umar", "Heidi"))
    printCollection(arrayListOf("Bobby", "Sarah"))
    printCollection(mapOf("Bobby" to "sarah").entries)

    printMutableCollection(mutableListOf("Bobby", "Sarah"))
    printMutableCollection(mutableSetOf("Dimas", "Yosua"))
    printMutableCollection(arrayListOf("Umar", "Heidi"))
    printMutableCollection(arrayListOf("Bobby", "Sarah"))
    printMutableCollection(mutableMapOf("Bobby" to "sarah").entries)

}