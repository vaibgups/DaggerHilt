package com.example.daggerhilt.demo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private var engine: Engine, private var wheel: Wheel) {


    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("Main ", "car is running")
    }
}