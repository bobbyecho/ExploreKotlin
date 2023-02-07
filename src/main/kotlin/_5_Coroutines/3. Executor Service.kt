package _5_Coroutines

import java.util.Date
import java.util.concurrent.Executors

fun main() {
//    singleThreadPool()
//    fixThreadPool()
    cacheThreadPool()
}

fun singleThreadPool() {
    val executorService = Executors.newSingleThreadExecutor()
    repeat(10) {
        executorService.execute {
            Thread.sleep(500)
            println("Done $it ${Thread.currentThread().name} ${Date()}")
        }

        println("creating queue $it")
    }

    println("Waiting...")
    Thread.sleep(6000)

    println("Finish...")

    executorService.shutdown()
}

fun fixThreadPool() {
    val executorService = Executors.newFixedThreadPool(3)
    repeat(10) {
        executorService.execute {
            Thread.sleep(500)
            println("Done $it ${Thread.currentThread().name} ${Date()}")
        }

        println("creating queue $it")
    }

    println("Waiting...")
    Thread.sleep(6000)

    println("Finish...")
    executorService.shutdown()
}

/**
 * not recommended
 * it will create amount of thread based on total queue
 */
fun cacheThreadPool() {
    val executorService = Executors.newCachedThreadPool()
    repeat(10) {
        executorService.execute {
            Thread.sleep(500)
            println("Done $it ${Thread.currentThread().name} ${Date()}")
        }

        println("creating queue $it")
    }

    println("Waiting...")
    Thread.sleep(6000)

    println("Finish...")
    executorService.shutdown()
}