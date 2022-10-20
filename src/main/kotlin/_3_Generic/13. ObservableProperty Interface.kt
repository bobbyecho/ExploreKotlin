import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(data: T): ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("before change property ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        super.afterChange(property, oldValue, newValue)
        println("after change property ${property.name} from $oldValue to $newValue")
    }
}

class NewCar(brand: String,year: Int, description: String, color: String) {
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
    var owner: String by Delegates.notNull<String>()
    var description: String by Delegates.vetoable(description) { property, oldValue, newValue ->
        println("before change property ${property.name} from $oldValue to $newValue")
        true
    }
    var color: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("after change property ${property.name} from $oldValue to $newValue")
        true
    }
}
fun main() {
    val car = NewCar("Toyota", 2022, "black metalic", "black")

    car.brand = "Hyundai"
    println(car.brand)

    car.owner = "Bobby"
    car.description = "White Metalic"
    car.color = "White"

    println(car.year)
}