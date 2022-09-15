class PersonProperties {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""
}

class CarProperties {
    var brand: String = ""
    var year: Int = 2020
}

fun main() {
    val person = PersonProperties()
    person.firstName = "Bobby"
    person.middleName = "Echo"
    person.lastName = "Prasetyo"

    println("my name is: ${person.firstName} ${person.middleName} ${person.lastName}")
}