class Invariant<T>(var data: T)

fun main() {
    val data1: Invariant<String> = Invariant("Bobby")
    data1.data = "Hehehe"

//    val data2: Invariant<Any> = data1 // error
//    data2.data = "Bobby" // bahaya
}