import kotlinx.coroutines.*
import kotlin.concurrent.*
import kotlin.system.measureTimeMillis

fun main () = runBlocking {
        println("$this")
        launch {
            println("$this")
             launch {
                 println("$this")
             }
        }
        async {
            println("$this")
        }
    println("h")
    }