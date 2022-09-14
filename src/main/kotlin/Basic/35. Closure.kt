// Closure is function, lambda, or anonymous function that interact around the data in same scope
// please be wise with closure while making an application

fun main() {
    var counter = 0;

    val lambdaIncrement: () -> Unit = {
        println("lamba increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("anon func increment")
        counter++
    }

    fun functionIncrement() {
        println("function increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}
