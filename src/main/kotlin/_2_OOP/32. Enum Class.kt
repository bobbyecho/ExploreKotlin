enum class Gender(val desc: String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescription() {
        println("desc: $desc")
    }
}

fun main() {
    val man = Gender.MALE
    val female = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val femaleFromString = Gender.valueOf("FEMALE")

    println(man)
    println(female)
    println(allGenders.toList())

    println(manFromString)
    println(femaleFromString)

    man.showDescription()
    female.showDescription()
}