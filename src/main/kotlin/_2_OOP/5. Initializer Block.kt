// don't create heavy task on initializer block

class PersonInitializerBlock(firstNameParam: String, lastNameParam: String?) {
    var firstName: String = firstNameParam;
    var lastName: String? = lastNameParam ?: "i dont have last name";

    init {
        println("hello, person $firstNameParam created")
    }
}


fun main() {
    val Bobby = PersonInitializerBlock("Bobby", null)
    val Sarah = PersonInitializerBlock("Sarah", null)
}