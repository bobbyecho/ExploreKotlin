open class SuperShape {
    open val corner: Int = 1

    open fun printName() {
        println("im super shape")
    }
}

class SuperBox: SuperShape() {
    override val corner: Int = 4
    val parentCorner = super.corner

    override fun printName() {
        println("im super box")
        super.printName()
    }
}

fun main() {
    println(SuperBox().corner)
    println(SuperBox().parentCorner)
    SuperBox().printName()
}