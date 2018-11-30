package com.example.nicolargh.opengltest.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val liveData = MutableLiveData<MainViewEvent>()

    fun handleStartClicked(){
        liveData.postValue(MainViewEvent.StartPressed)
    }
}

sealed class MainViewEvent {
    object StartPressed : MainViewEvent()
}
