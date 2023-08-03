package com.example.sisterslabproject.hafta3.odev5

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() {
    val birinciThread=BirinciThread()
    birinciThread.start()//threadler için start methodu gereklidir

    val ikinciThread = Thread(IkinciThread())
    ikinciThread.start()
    for (i in 1..10){
        println("Main Thread: $i")
        Thread.sleep(6000)
    }
}