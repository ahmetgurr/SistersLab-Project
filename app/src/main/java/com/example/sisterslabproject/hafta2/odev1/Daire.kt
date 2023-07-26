package com.example.sisterslabproject.hafta2.odev1

class Daire (val yaricap: Double) {

     fun alan(): Double{

        return Math.PI*yaricap*yaricap
    }

     fun cevre():Double{
        return Math.PI*2*yaricap
    }
}