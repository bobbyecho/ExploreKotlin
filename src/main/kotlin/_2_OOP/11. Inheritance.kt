// if you want the call can't inherit, use keyword final

open class TheHuman(val name: String) {
    fun sayHello() = println("Hello my name is ${this.name}")

    fun canWalk() {
        println("i can walk")
    }
}

final class Boy(name: String): TheHuman(name)

class Girl(name: String): TheHuman(name) {

}

fun main() {
    val girl = Girl("Sarah")
    girl.sayHello()
    girl.canWalk()
    val boy = Boy("Bobby")
    boy.sayHello()
    boy.canWalk()
}