class Contact(name: String) {
    var name: String = name
        get() {
            println("getter method")
            return field
        }
        set(value) {
            println("setter method")
            if (value.isNotBlank()) {
                field = value
            } else {
                field = "name cannot blank"
            }
        }
}

class BigContact(name: String) {
    val bigTitle: String = name
        get() = field.uppercase()
}

fun main() {
    val contact = Contact("Bobby")
    println(contact.name)

    contact.name = ""
    println(contact.name)

    val bigContact = BigContact("Sarah")
    println(bigContact.bigTitle)
}