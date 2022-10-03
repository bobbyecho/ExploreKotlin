open class Employee() {
    open fun sayHello(name: String) {
        println("Hello $name, im your employee")
    }
}

class Manager: Employee() {
    override fun sayHello(name: String) {
        println("Hello $name, im your Manager")
    }
}

fun main() {
    var employee = Employee()
    employee.sayHello("Sarah")

    employee = Manager()
    employee.sayHello("Bobby")
}