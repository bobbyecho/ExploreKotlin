import java.util.StringJoiner

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "Standard")
}

class PremiumCustomer: Customer {
    constructor(name: String) : super(name)
    constructor(name: String, balance: Long) : super(name, type = "Premium", balance = balance)
}

class ExecutiveCustomer(name: String, balance: Long): Customer(name, "Executive", balance)

fun main() {
    val executiveCustomer: ExecutiveCustomer = ExecutiveCustomer("Bobby", 50_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.type)
    println(executiveCustomer.balance)
}