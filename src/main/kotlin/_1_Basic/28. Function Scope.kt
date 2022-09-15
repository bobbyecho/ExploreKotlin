fun one() {
//    error
//    sayHello("bob")
}

fun two() {
    //    error
//    sayHello("bob")
}

fun main() {
    fun sayHello(name: String) {
        println("hello $name")
    }

    sayHello("Bob")
}