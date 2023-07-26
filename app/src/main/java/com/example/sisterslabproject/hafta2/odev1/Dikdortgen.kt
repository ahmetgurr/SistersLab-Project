package com.example.sisterslabproject.hafta2.odev1

class Dikdortgen (val uzunluk: Double, val genislik: Double): geometrikSekil(){
        override fun alan():Double{
            return uzunluk*genislik
        }

        override fun cevre():Double{
            return 2*(uzunluk * genislik)
        }
}