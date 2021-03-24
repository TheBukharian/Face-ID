package com.example.myfaceapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.provider.Settings.Global.getString
import com.example.myfaceapp.tflite.SimilarityClassifier

class SharedPreferences(context: Context){
    private val  sharedPref: SharedPreferences = context.getSharedPreferences("String",0)
    private val editor: SharedPreferences.Editor = sharedPref.edit()

    fun saveFacesMap(key: String, data: String){
        editor.putString(key,data)
        editor.apply()
    }

    fun getFacesMap(key:String): String? {
        return sharedPref.getString(key,null)
    }
}