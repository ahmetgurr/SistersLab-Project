package com.example.sisterslabproject.hafta2.odev2

class Basketbolcu(val ad: String, val yas: Int, val takim: String, val puanlama: String) {


    fun smac() {
        println("$ad smaç bastı!.")
    }

    fun puan(){
        println("$ad $yas yasında $puanlama değerinde sayı attı!")
    }

}