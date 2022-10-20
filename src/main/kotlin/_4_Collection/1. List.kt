package _4_Collection


fun main() {
    val list: List<String> = listOf("Cam", "Cung")
    val mutableList: MutableList<String> = mutableListOf("Bob", "ra")
    println(list[0] + list[1])
    println(list.joinToString(""))
    println(list.containsAll(listOf("Cam", "cung")))
    println(list.indexOf("Cam"))
    println(list.indexOf("cung"))
    println(list.containsAll(listOf("Cam")))
    println(list.isEmpty())
    println(list.isNotEmpty())

    mutableList.add("Dibop")
    mutableList[0] = "Bobby"
    mutableList.set(1, "sarah")

    println(mutableList.joinToString(""))
}