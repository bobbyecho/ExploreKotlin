class PersonFunction {
    val firstName: String = "Bobby"

    fun sayHello() {
        println("Hello $firstName")
    }

    fun doRun() {
        println("$firstName is running")
    }
}

fun main() {
    val person = PersonFunction()
    person.sayHello()
    person.doRun()
}