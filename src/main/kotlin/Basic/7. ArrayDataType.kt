fun main() {
    val arrOfString: Array<String> = arrayOf("Bobby", "Echo", "Prasetyo")
    println(arrOfString[0])

    val arrOfFullName: Array<String?> = arrayOfNulls(5);
    arrOfFullName[0] = "raden"
    arrOfFullName[1] = "bambang"
    arrOfFullName[2] = "bobby"
    arrOfFullName[3] = null
    arrOfFullName[4] = "prasetyo"
    println(arrOfFullName.size)

    val arrOfNumber: Array<Int> = arrayOf(0, 0, 1)
    println(arrOfNumber.size)


}