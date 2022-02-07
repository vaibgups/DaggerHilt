package com.example.daggerhilt.demo

import android.app.AppComponentFactory
import android.app.Application
import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface One{
    fun getName()
}

class ImplementOne @Inject constructor(private val name : String) : One{
    override fun getName() {
        Log.d("Main ", "My name is $name")
    }
}

class Main @Inject constructor(private val one: One){
    fun getName(){
        one.getName()
    }
}

//    First way to implement interface dependency
//    It is good way for dependency injection because
//    It create low boiler plate code as compare to other way
/*
@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule{
    @Binds
    @Singleton
    abstract fun binding( implementOne: ImplementOne) : One
}*/

@Module
@InstallIn(SingletonComponent::class)
class AppModule{
    @Provides
    @Singleton
    fun getName() : String = "Ridhika"

    @Provides
    @Singleton
    fun binding( name: String) : One = ImplementOne(name)
}

