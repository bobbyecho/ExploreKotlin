interface AnonAction {
    fun action(): Unit
}

fun fireAction(action: AnonAction) {
    action.action()
}

class SampleAction: AnonAction {
    override fun action() {
        println("this is ample action")
    }
}

fun main() {
    fireAction(SampleAction())
    fireAction(object : AnonAction {
        override fun action() {
            println("this is anon function action")
        }
    })
}