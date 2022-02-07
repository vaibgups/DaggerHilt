package com.example.daggerhilt.demo

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier

class Main2 @Inject constructor(@FName private val fName: String,
                                @LName private val lName: String) {
    fun getName() {
        Log.d("Main ", "My first name is $fName and last name is $lName")
    }

}

@Module
@InstallIn(SingletonComponent::class)
class ModuleApp{
    @Provides
    @FName
    fun getFNAme() : String = "Vaibhav"

    @Provides
    @LName
    fun getLName() : String = "Gupta"
}
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName