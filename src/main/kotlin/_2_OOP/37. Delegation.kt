interface Base {
    fun sayHello(name: String)
}

class MyBase: Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}


// manual delegation
class MyBaseDelegate(private val base: Base): Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
}

// delegation with kotlin way
class MyBaseDelegateAutomatic: Base by MyBaseDelegate(MyBase())
// or
class MyBaseDelegateSecondaryAutomatic(private val base: Base): Base by base

fun main() {
    val base = MyBase()
    base.sayHello("cung")

    val myBaseDelegate = MyBaseDelegate(base)
    myBaseDelegate.sayHello("Cam")

    val automaticDelegate = MyBaseDelegateAutomatic()
    automaticDelegate.sayHello("HEHEHE")

    val secondaryAutomatic = MyBaseDelegateSecondaryAutomatic(base)
    secondaryAutomatic.sayHello("HHIHIHI")
}