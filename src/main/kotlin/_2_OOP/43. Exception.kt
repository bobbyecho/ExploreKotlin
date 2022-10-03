class ValidationException(message: String): Throwable(message)

fun sayHello(name: String) {
    if (name.isBlank()) {
        throw  ValidationException("Name is blank")
    }

    println(name)
}

fun main() {
    val list = listOf<String>("1", "2")
    try {
        sayHello("")
        sayHello(list[0])
        sayHello(list[4])
    } catch (e: ValidationException) {
        println("ERROR with message ${e.message}")
    } catch(e: Throwable) {
        println("ERROR Null Exception with message ${e.message}")
    } finally {
        println("program end")
    }
}