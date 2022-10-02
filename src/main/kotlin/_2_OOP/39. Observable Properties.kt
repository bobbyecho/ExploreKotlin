import kotlin.properties.Delegates

class ObservableProperties(name: String) {
    var name: String by Delegates.observable(name) {
        property, oldValue, newValue ->
            println("${property.name} changed from $oldValue to $newValue")
    }
}

fun main() {
    val observe = ObservableProperties("Bobby")
    observe.name = "Sarah"
    observe.name = "CamCung"
}