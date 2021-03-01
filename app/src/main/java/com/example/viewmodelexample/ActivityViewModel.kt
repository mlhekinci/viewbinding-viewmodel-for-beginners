package com.example.viewmodelexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityViewModel : ViewModel() {

    var number: Int = 0

    val numberCounter: MutableLiveData<Int> by lazy() { MutableLiveData<Int>() }

    fun addNumber() {
        number++
        numberCounter.value = number
    }
}
