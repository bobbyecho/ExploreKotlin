// kata kunci out tidak boleh untuk set data, hanya untuk boleh return

class Covariant<out T>(val data: T) {
    fun sayHello(): T {
        return data
    }
}


fun main() {
    val data1: Covariant<String> = Covariant("Bobby")
    val data2: Covariant<Any> = data1

    println(data2.sayHello())
}