typealias Square = Box
typealias StringSupplier = () -> String


fun sayHellow(supplier: StringSupplier) {
    println("hello ${supplier()}")
}

fun main() {
    val square = Square()
    println(square.toString())
    sayHellow {
        "bobby"
    }
    sayHellow(fun(): String {
        return "Sarah"
    })
}