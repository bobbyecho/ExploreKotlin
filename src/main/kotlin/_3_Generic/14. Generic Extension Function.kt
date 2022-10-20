class Data<T>(val data: T)

fun Data<Any>.print() {
    println("String value: ${this.data}")
}

fun main() {
    val data1 = Data("Cung" as Any)
    data1.print()

    val data2 = Data(1 as Any)
    data2.print()
}