data class Game(val name: String, val price: Int)

data class MinMax(val min: Int, val max: Int)

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

data class Login(val name: String, val pwd: String)
typealias loginLambda = (Login) -> Boolean

fun login(login: Login, callback: loginLambda): Boolean {
    return callback(login)
}

class LoginManual(val name: String, val pwd: String) {
    operator fun component1(): String {
        return name
    }

    operator fun component2(): String {
        return pwd
    }
}

fun loginFun(name: String, pwd: String): Pair<String, String> {
    return Pair(name, pwd)
}

fun main() {
    val game = Game("Ragnarok", 250_000)
    val (name, price) = game
    println(name, price.toString())

    val (min) = minmax(200, 600)
    println(min.toString())

    val request = Login("Bobby", "Bob1234")

    val result1 = login(request) { (username, pwd) ->
        username === "bob" && pwd == "Bob1234"
    }

    val result2 = login(request, fun (login): Boolean {
        val (name, password) = login
        return name == "Bobby" && password == "Bob1234"
    })

    println(result1.toString())
    println(result2.toString())

    val loginManual = LoginManual("bobby", "bobbysarah")
    val (a, b) = loginManual
    println(a, b)

    val (c, d) = loginFun("HH", "CC")
    println(c, d)
}

fun println(vararg string: String) {
    var result = ""

    for (str in string) {
        result += "$str "
    }

    kotlin.io.println(result)
}
