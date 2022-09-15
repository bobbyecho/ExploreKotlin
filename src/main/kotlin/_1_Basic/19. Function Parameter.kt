fun sayMyName(firstName: String, middleName: String? = null, lastName: String) {
    val printMiddleName = {
        if (middleName.isNullOrEmpty()) {
            "I dont have middle name T_T"
        } else {
            "then, my middle name is $middleName"
        }
    }

    println("""
        |Hello
        |my first name is $firstName
        |${printMiddleName()}
        |last but not least, my last name is $lastName
    """.trimMargin() + "\n")
}

fun main() {
    sayMyName("Bobby", "Echo", "Prasetyo")
    sayMyName(firstName = "Dimas", lastName = "Wiratama")
}