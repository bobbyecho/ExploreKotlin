fun main() {
    val firstName: String = "Bobby"
    val middleName: String = "Echo"
    val lastName: String = "Prasetyo"
    println("$firstName $middleName $lastName have ${firstName.length + middleName.length + lastName.length} characters")

    val address: String = """
        Jl. Gunung Agung X16
        Denpasar
        Bali
    """
    println(address)

    /**
     * String Trim Margin
     */
    val addressJakarta: String = """
        |Jl. Mawar III
        |Pondok Indah
        |Jakarta
    """.trimMargin()
    println(addressJakarta)

    val addressBandung: String = """
        >Jl. Cihampelas Indah
        >Cihampelas
        >Bandung
    """.trimMargin(">")
    println(addressBandung)
}