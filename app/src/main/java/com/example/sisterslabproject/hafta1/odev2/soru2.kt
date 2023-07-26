package com.example.sisterslabproje

import java.lang.Exception
import java.util.Scanner

fun main(){

    val scanner = Scanner(System.`in`)
    println("Yaşınızı girin: ")

    try {
        val kullanici = scanner.nextInt()

        if(kullanici>=18){
            println("Oy kullanabilirsiniz!")
        }
        else {
            println("Oy kullanamazsın.")
        }
    }catch (e: Exception) {
        println("Geçerli bir yaş girmediniz.")
    }


}