import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LogSetterGetter(var param: String) : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get data ${property.name} with value ${this.param}")
        return this.param
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set data ${property.name} with value $value")
        this.param = value
    }
}

class NameWithLogSetterGetter(param: String) {
    var name: String by LogSetterGetter(param)
}

fun main() {
    val log = NameWithLogSetterGetter("Sarah")
    println(log.name)
    log.name = "Bobby"
    println(log.name)
}