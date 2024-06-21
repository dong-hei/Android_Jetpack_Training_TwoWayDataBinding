package com.dk.twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var mutableNum = MutableLiveData(0)

    fun plus(){

        mutableNum.value = mutableNum.value?.plus(1)
    }
}