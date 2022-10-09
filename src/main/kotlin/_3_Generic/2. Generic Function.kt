class Function(val name: String) {
    fun <T> sayHello(param: T) {
        println("Hello$name my name is $param")
    }
}

fun main() {
    val function = Function("Bobby")
    function.sayHello(1)
    function.sayHello("Sarah")
}