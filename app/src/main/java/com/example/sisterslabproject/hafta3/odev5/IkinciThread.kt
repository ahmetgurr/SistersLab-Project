package com.example.sisterslabproject.hafta3.odev5

class IkinciThread:Runnable {
    override fun run() {
        for (i in 1..10){
            println("İkinci Thread: $i")
            Thread.sleep(3000)
        }
    }
}