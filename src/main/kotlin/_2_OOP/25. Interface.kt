interface Action {
    fun shakeHand() {
        println("Shaking Hand!")
    }
}

interface Interaction: Action {
    val name: String

    // concrete function on interface
    fun sayHello() {
        println("Hello my name is $name")
    }
}

interface Go {
    fun go() {
        println("Go!")
    }
}

class NewStudent: Interaction, Go {
    override val name: String = "Bobby"
}

class OldStudent(override val name: String): Interaction, Go

class BadStudent(override val name: String = "Yo-sua"): Interaction, Go

interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

// conflict on interface, we have to override
class Move: MoveA, MoveB {
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("move from this class")
    }
}

fun main() {
    val student = NewStudent()
    student.sayHello()
    student.go()
    student.shakeHand()

    val newStudent = OldStudent("Sarah")
    newStudent.sayHello()
    newStudent.go()
    newStudent.shakeHand()

    val badStudent = BadStudent()
    badStudent.sayHello()
    badStudent.go()
    badStudent.shakeHand()

    val move = Move()
    move.move()

}