package _4_Collection

fun main() {
    val arrayString = listOf("Sarah", "Bobby")
    val numberString = 1..100

    val arrayStringToList = arrayString.toList()
    val arrayStringToMap = arrayStringToList.toSet()

    val arrayStringToMutableList = arrayString.toMutableList()
    val arrayStringToMutableSet = arrayString.toMutableSet()
}