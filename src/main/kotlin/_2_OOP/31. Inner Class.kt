class Boss (val bossName: String) {
    inner class Employee(val name: String) {
        fun hi() {
            println("Hi, my name is $name, and my boss name is $bossName")
        }
    }
}

fun main() {
    val boss = Boss("bobby").Employee("Sarah").hi()
}