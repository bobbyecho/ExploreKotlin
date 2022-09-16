class PersonOverLoading {
    fun doRun(name: String) {
        println("$name is running")
    }

    fun doRun(name: String, distance: Int) {
        println("$name is running about $distance km")
    }
}

fun main() {
    val person = PersonOverLoading()
    person.doRun("Bobby")
    person.doRun("Bobby", 16)
}