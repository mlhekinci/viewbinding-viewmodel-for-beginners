package com.example.viewmodelexample

import androidx.lifecycle.ViewModel

class ActivityViewModel : ViewModel() {

    var number = 0

    fun addNumber() {
        number++
    }
}
