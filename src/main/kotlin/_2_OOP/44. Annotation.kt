@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)

@Fancy("bobby")
class Program(private val name: String, private val version: Int) {
    fun info(): String = "Application: $name-$version"
}

fun main() {
    val program = Program("iOS", 34)
}