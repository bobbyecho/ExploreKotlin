/**
 * CONSTANT VARIABLE
 * use for global purposes
 *
 * you have to use VAL, instead of VAR
 */
const val VERSION = "0.0.1"
//const var APPLICATION = "org.fingerpeople.explorekotlin" => ERROR

fun main() {

    println("version: $VERSION")
    /**
     * val = immutable
     * var = mutable
     */

    var nameMutable = "bobby"
    nameMutable += " echo prasetyo"
    println(nameMutable)

    val nameImmutable = "bobby"
//    nameImmutable += " Echo Prasetyo" ==> error
    println(nameImmutable)

    /**
     * nullable
     */

    var nameNullable: String? = null
    nameNullable = "Bobby"
    println(nameNullable)

    var nameNullableAfter: String? = "Bobby"
    nameNullableAfter = null

    println("length of char: ${nameNullableAfter?.length}")
}