import kotlinx.coroutines.*
import kotlin.system.*

fun main() {
//    demoLaunch()
//    demoAsync()
    demoParalel()
}

fun demoLaunch() {
    val time = measureTimeMillis {
        try {
            runBlocking {
                println("Weather Forecast")
                val job = launch {
                    printForecast()
                }
                launch {
                    printTemperature()
                }
                job.cancel()
                println("Have a good day!")

                // cancel() // --> will throw error
            }
        } catch (e: IllegalStateException) {
            println("Caught exception $e")
        }
    }

    println("Execution time: ${time / 1000.0} seconds")
}

fun demoAsync() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather Forecast")
            val forecast: Deferred<String> = async {
                returnForecast()
            }
            val temperature: Deferred<String> = async {
                returnTemperature()
            }
            val resultForecast = forecast.await()
            val resultTemperature = temperature.await()
            println("$resultForecast $resultTemperature")
            println("Have a good day!")
        }
    }

    println("Execution time: ${time / 1000.0} seconds")
}

fun demoParalel() {
    runBlocking {
        println("Weather Forecast")
        println(getWeatherReport())
        println("Have a good day!")
    }
}

suspend fun printForecast() {
    delay(1000)
    println("sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}

suspend fun returnForecast(): String {
    delay(1000)
    return "sunny"
}

suspend fun returnTemperature(): String {
    delay(1000)
    return "30°C"
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast: Deferred<String> = async {
        returnForecast()
    }
    val temperature: Deferred<String> = async {
        returnTemperature()
    }

    val resultForecast = forecast.await()
    val resultTemperature = temperature.await()

    "$resultForecast $resultTemperature"
}