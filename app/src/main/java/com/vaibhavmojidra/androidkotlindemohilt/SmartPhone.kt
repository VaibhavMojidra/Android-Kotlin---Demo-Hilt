package com.vaibhavmojidra.androidkotlindemohilt

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(){
    init {
        Log.i("MyTag","Smartphone class initialized.")
    }

    fun isSmartPhoneAvailable(){
        Log.i("MyTag","SmartPhone is available.")
    }
}
