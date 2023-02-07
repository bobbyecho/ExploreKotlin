package _5_Coroutines

import java.util.*

fun main() {
    val thread = Thread {
        println(Date())
        Thread.sleep(2000)
        println("Finish thread 1: ${println(Date())}")
    }

    val thread2 = Thread {
        println(Date())
        Thread.sleep(2000)
        println("Finish thread 2: ${println(Date())}")
    }

    thread.start()
    thread2.start()

    println("waiting for finish...")
    Thread.sleep(3000)

    println("finish")
}