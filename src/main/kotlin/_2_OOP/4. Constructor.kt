class PersonConstructor(firstNameParam: String, lastNameParam: String?) {
    var firstName: String = firstNameParam;
    var lastName: String? = lastNameParam ?: "i dont have last name";
}

fun main() {
    val person = PersonConstructor("Bobby", null);
    val secondPerson = PersonConstructor("Sarah", "Rahma");

    println("my name is: ${person.firstName} ${person.lastName}")
    println("my name is: ${secondPerson.firstName} ${secondPerson.lastName}")
}