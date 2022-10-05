package _3_Generic

class MyData<T>(val myData: T) {
    fun getData(): T = myData

    fun printData() {
        println("Data type $myData")
    }
}

fun main() {
    val dataString = MyData("1")
    dataString.getData()
    dataString.printData()

    val dataNumber = MyData(1)
    dataNumber.getData()
    dataNumber.printData()

    val myDataList = MyData(listOf("1"))
    myDataList.getData()
    myDataList.printData()
}