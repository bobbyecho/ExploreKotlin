// kata kunci IN, tidak boleh untuk return data, hanya untuk set

class Contravariant<in T> {
    fun setSomething(name: T) {
        println("Hello $name")
    }
}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny
    contravariantString.setSomething("Bobby")

    val contravariantList: Contravariant<List<String>> = contravariantAny
    contravariantList.setSomething(listOf("Bobby"))
}