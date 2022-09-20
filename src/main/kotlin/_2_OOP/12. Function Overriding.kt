open class PeopleOverriding {
    open fun sayHello() {
        println("Hello people")
    }
}

open class Bob: PeopleOverriding() {
    override fun sayHello() {
        println("Hello Bob")
    }
}

class SuperBob: Bob() {
    // to make another child can't implement this method, use keyword final
    final override fun sayHello() {
        println("Hello Super Bob")
    }
}

fun main() {
    Bob().sayHello()
    SuperBob().sayHello()
}