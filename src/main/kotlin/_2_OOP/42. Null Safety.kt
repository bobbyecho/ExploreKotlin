data class Friend(val name: String)

fun sayHelloFriend(friend: Friend?) {
    val name = friend?.name ?: "Friend"
    println("hello $name")
}

fun main() {
    sayHelloFriend(Friend("Eko"))
    sayHelloFriend(null)
}

