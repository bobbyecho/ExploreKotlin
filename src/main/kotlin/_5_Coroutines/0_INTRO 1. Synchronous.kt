package _5_Coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.*

fun main() {
    println("HH")
    val time = measureTimeMillis {
        runBlocking {
            println("Weather Forecast")
            printForecast()
            printTemperature()
        }
    }

    println("Execution time: ${time / 1000.0} seconds")
}

suspend fun printForecast() {
    delay(1000)
    println("sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}
