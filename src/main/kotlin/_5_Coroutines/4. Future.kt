package _5_Coroutines

import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import kotlin.system.measureTimeMillis

val executorService: ExecutorService = Executors.newFixedThreadPool(10)

fun main() {
//    testNonParallel()
    testFuture()
}

fun getFoo(): Int {
    Thread.sleep(1000)
    return 10
}

fun getBar(): Int {
    Thread.sleep(1000)
    return 20
}

fun testNonParallel() {
    val time = measureTimeMillis {
        val foo = getFoo()
        val bar = getBar()
        val result = foo + bar
        println("total: $result")
    }

    println("total time: $time")
}


fun testFuture() {
    val time = measureTimeMillis {
        val foo: Future<Int> = executorService.submit(Callable { getFoo()  })
        val bar: Future<Int> = executorService.submit(Callable {  getBar() })
        val result = foo.get() + bar.get()
        println("total: $result")
    }

    println("total time: $time")
}