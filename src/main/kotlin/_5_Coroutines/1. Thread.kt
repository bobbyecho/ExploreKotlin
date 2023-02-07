package _5_Coroutines

import java.util.Date
import kotlin.concurrent.thread

fun main() {
    thread {
        println(Date())
        Thread.sleep(2000)
        println("FINISH: ${Date()}")
    }

    println("MENUNGGU SELESAI")
    Thread.sleep(3000)
    println("Selesai")
}