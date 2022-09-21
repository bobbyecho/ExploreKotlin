open class House {
    private fun wife() {
        println("Sarah is my wife")
    }

    protected open fun child(name: String) {
        println("my soon child is: $name")
    }

    // only consume for this project, other project cannot access this function
    internal open fun what() {

    }
}

open class Mezzanine: House() {
    public override fun child(name: String) {
        super.child(name)
    }
}

class ExpensiveRoom: Mezzanine()

fun main() {
    val mezzanine = Mezzanine()
    mezzanine.child("Bob Jr")

    val expensiveRoom = ExpensiveRoom()
    expensiveRoom.child("Sarah Jr")
}