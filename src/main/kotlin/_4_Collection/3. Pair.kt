package _4_Collection

//pair itu seperti key value
//pair merepresentasikan dengan data yg berpasangan

fun main() {
    val pair = Pair("Cam", "Cung")
    val pair2 = "Cam" to "Cung"

    println(pair.first)
    println(pair.second)

    println(pair2.first)
    println(pair2.second)

    val modifyPair2 = pair2.toList().toMutableList()
    modifyPair2[0] = "dibop"
    println(modifyPair2)

    println(pair2.toString())
    println(modifyPair2.toString())
}