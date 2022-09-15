fun main() {
    val finalExam = 'E'

    when(finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again")
        else -> println("incorrect value")
    }

    val passValue = 'A'

    when(passValue) {
        'A', 'B', 'C' -> println("Congratulations, you pass exam")
        else -> println("not pass")
    }

    val passValues: Array<Char> = arrayOf('A', 'B', 'C')

    when(passValue) {
        in passValues -> println("Congratulations, you pass exam")
        !in passValues -> println("sorry, try again next year")
    }

    val name: Char = 'A'

    when(name) {
        is Char -> println("value is Char")
        !is Char -> println("value is not Char")
    }

    val examValue = 65

    when {
        examValue > 80 -> println("Amazing")
        examValue > 70 -> println("Good")
        examValue > 60 -> println("Not Bad")
        examValue > 50 -> println("Bad")
        examValue > 40 -> println("Try Again")
        else -> println("incorrect value")
    }
}