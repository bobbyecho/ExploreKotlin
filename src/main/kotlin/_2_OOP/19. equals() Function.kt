class Company(val name: String) {
    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Company -> this.name === other.name
            else -> false
        }
    }
}

fun main() {
    val company1 = Company("Ralali")
    val company2 = Company("Ralali")

    println(company1.equals(company2))
    println(company1.equals(company1))
    println(company2.equals(company2))
}