package com.sotkou.viewmodelapp

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    //private var counter = 0

    // Δημιουργούμε μια οντότητα του MutableLiveData
    private var counter = MutableLiveData<Int>()
    // MutableLiveData: Μια υποκλάση του LiveData που κρατάει και
    // διαχειρίζεται Observable data

    init {
        counter.value = 0
    }

    // Increment counter μέθοδος
    fun incrementCounter(view: View) {
        //counter++

        counter.value = counter.value?.plus(1)
    }
    // Getter για τον counter
    fun getCurentCounter(): MutableLiveData<Int> {
        return counter
    }
}