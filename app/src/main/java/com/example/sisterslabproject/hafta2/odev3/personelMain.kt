package com.example.sisterslabproject.hafta2.odev3

import kotlin.concurrent.thread

fun main() {
    val personel = Personel("Ahmet","GÜR","Junior Dev.",11500.0)


    println("Personel adı: ${personel.ad}")
    println("Personel soyadı: ${personel.soyad}")
    println("Personel Pozisyonu: ${personel.pozizyon}")
    println("Personel Maaşı: ${personel.maas}")


    personel.maasArttir(15000.0)
    println("Personel maasaı arttırıldı: ${personel.maas}")




}