// properties on constructor only can be created on primary constructor

class PersonConstructorProps(val firstName: String, val lastName: String? = null) {

}

fun main() {
    val personOne = PersonConstructorProps("Bobby", "Prasetyo")
    println(personOne.firstName)
    println(personOne.lastName)
}