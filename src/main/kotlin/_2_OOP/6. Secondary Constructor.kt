// don't create heavy task on initializer block

class PersonSecondaryConstructor(firstNameParam: String, lastNameParam: String?) {
    var firstName: String = firstNameParam;
    var lastName: String? = lastNameParam ?: "i dont have last name";

    init {
        println("Object person $firstNameParam created")
    }

    constructor(firstNameParam: String, middleName: String, lastNameParam: String): this(firstNameParam, null) {
        println("secondary constructor 1: $firstNameParam $middleName $lastNameParam")
    }

    constructor(firstParam: String): this(firstParam, "", "") {
        println("secondary constructor 2: $firstParam")
    }
}


fun main() {
    val Bobby = PersonSecondaryConstructor("Bobby", null)
    val Sarah = PersonSecondaryConstructor("Bobby", "Echo", "Prasetyo")
    var BobbySarah = PersonSecondaryConstructor("BobbySarah")
}