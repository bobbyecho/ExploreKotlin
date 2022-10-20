import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class NameWithLog(param: String) {
    val name: String by LogReadonlyProperties(param)
}

class LogReadonlyProperties(val data: String) : ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Accessing property ${property.name} with value $data")
        return data.uppercase()
    }
}

fun main() {
    val log = NameWithLog("Bobby Echo Prasetyo")
    println(log.name)
    println(log.name)
}