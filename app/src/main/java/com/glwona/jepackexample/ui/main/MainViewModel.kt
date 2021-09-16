package com.glwona.jepackexample.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val usedToEuRate = 0.74f
//    private var dollarText = ""
    var dollarValue: MutableLiveData<String> = MutableLiveData()
//    private var result: Float = 0f
    var result: MutableLiveData<Float> = MutableLiveData()

    fun convertValue(){
        dollarValue.let {
            if(!it.value.equals("")){
                result.value = it.value?.toFloat()?.times(usedToEuRate)
            }else{
                result.value = 0f
            }
        }
    }

/*  fun setAmount(value: String){
        this.dollarText = value
//        result = value.toFloat() * usedToEuRate
        result.value = value.toFloat() * usedToEuRate
    }*/
    /*fun getResult(): MutableLiveData<Float> {
        return result
    }*/
}