package _5_Coroutines

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("${Thread.currentThread().name} - runBlocking function")
        launch {
            println("${Thread.currentThread().name} - launch function")
            val context = withContext(Dispatchers.Default) {
                println("${Thread.currentThread().name} - withContext function")
                delay(1000)
                println("10 results found.")
                "hello i'm finished"
            }

            with(context) {
                println(this)
            }

            println("${Thread.currentThread().name} - end of launch function")
        }
        println("Loading...")
    }
}