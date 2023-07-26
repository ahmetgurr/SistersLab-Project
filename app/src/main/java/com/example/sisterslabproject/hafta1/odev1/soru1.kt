package com.example.sisterslabproje

import java.util.Scanner

fun main(){

    val scanner = Scanner(System.`in`)
    print("Kullancıı adını gir: ")
    val kullanici = scanner.nextLine()
    print("Şifreni gir: ")
    val sifre = scanner.nextLine()


    if (kullanici.equals("ahmet.gurr", ignoreCase = true)&&sifre.equals("ahmet1", ignoreCase = false))
        println("Hoş Geldiniz! ")
    else{
        println("Kullanıcı adı veya şifre hatalı!")
    }

}