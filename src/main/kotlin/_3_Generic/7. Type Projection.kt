class Container<T>(var data: T)

fun copyContainer(from: Container<out String>, to: Container<in Any>) {
    to.data = from.data
}

fun main() {
    val container1 = Container("Echo")
    val container2: Container<Any> = Container("Bobby")

    copyContainer(container1, container2)

    println(container1.data)
    println(container2.data)
}