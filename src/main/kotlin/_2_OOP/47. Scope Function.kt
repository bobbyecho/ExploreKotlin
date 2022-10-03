fun main() {
    val student = Student("Bobby")

    val result1: String = student.let {
        "my name is ${it.name}"
    }

    val result2: String = student.run {
        "my name is ${this.name}"
    }

    val result3: Student = student.apply {
        "my name is ${this.name}"
    }

    val result4: Student = student.also {
        "my name is ${it.name}"
    }

    val result5: String = with(student) {
        "my name is ${this.name}"
    }

    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(result5)
}