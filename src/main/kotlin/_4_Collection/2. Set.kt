package _4_Collection

class Person(val name: String) {
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return (other as Person).name == name
    }

    override fun toString(): String {
        return "your name is $name"
    }
}
//set cocok untuk menyimpan data yg unique
//set tidak akan menyimpan data yg duplikat

fun main() {
    val set: Set<String> = setOf("bobby", "sarah")
    val persons: Set<Person> = setOf(
        Person("Sarah"),
        Person("Bob"),
        Person("Sarah")
    )

    val mutablePersons: MutableList<Person> = mutableListOf()

    println(set.contains("sarah"))
    println(set.size)
    println(set.find { it == "bobby" })

    println(persons.size)
    println(persons.contains(Person("bobby")))
    println(persons.contains(Person("Sarah")))

    for(person in persons) {
        println(person)
    }

    mutablePersons.add(Person("Dibop"))
    mutablePersons.add(Person("Cam"))

    for (person in mutablePersons) {
        println(person)
    }
}