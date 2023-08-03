package com.example.sisterslabproject.hafta3.odev5

class BirinciThread: Thread() {

    //run metodu thread ozelliğini saglar ,
    override fun run() {
        //super.run()
        for (i in 1..10){
            println("birinci thread: $i")
            Thread.sleep(5000)
        }
    }
}