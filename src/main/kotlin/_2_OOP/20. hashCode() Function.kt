class classHashCode(private val hash: String) {
    override fun hashCode(): Int {
        return this.hash.hashCode()
    }
}

fun main() {
    val chc1 = classHashCode("bob").hashCode()
    val chc2 = classHashCode("bob").hashCode()
    println(chc1.hashCode() === chc2.hashCode())
    println(chc1.hashCode())
    println(chc2.hashCode())
}