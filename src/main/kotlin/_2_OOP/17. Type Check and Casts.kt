fun printObject(any: Any) {
    if (any is Laptop) {
        println("my phone is: ${any.brand}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> {
            println("my phone is: ${any.brand}")
        }
        else -> {
            println(any)
        }
    }
}

fun printAsString(any: Any) {
    val value = any as String;
    println(value)
}

fun printAsStringNullable(any: Any) {
    val value = any as? String;
    println(value)
}

fun main() {
    printObject("Hello")
    printObject(Laptop("Asus"))
    printObjectWithWhen(any = "hello")
    printObjectWithWhen(any = Laptop("MacBook Pro"))

//    printAsString(1) // error
    printAsStringNullable(1) // --> null
}