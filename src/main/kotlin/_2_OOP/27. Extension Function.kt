// extension function cannot access private

class Vape(val name: String?)

fun Vape.printBrand() = println(this.name)

// nullable extension function

fun Vape?.checkBrand() {
    if (this?.name?.isNotBlank() == true) {
        println("checking brand for ${this.name} is success")
    } else {
        println("Vape not initialize yet")
    }
}

fun main() {
    Vape("Vaporesso").printBrand()
    Vape("Vaporesso").checkBrand()
    Vape("").checkBrand()

    val vape: Vape? = null
    vape?.checkBrand()
}