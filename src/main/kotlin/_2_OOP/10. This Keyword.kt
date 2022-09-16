class Student(val name: String) {
    fun sayHelloToOtherStudent(name: String): Unit {
        println("Hello $name, my name is ${this.name}")
    }
}

fun main() {
    val student = Student("Bobby")
    student.sayHelloToOtherStudent("Sarah")
}