package com.example.the_weather_app.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.the_weather_app.repository.RepositoryImpl
import java.lang.Thread.sleep

class MainViewModel(
    private val liveDataToObserve: MutableLiveData<Any> = MutableLiveData(),
    private val repositoryImpl: RepositoryImpl = RepositoryImpl()
) : ViewModel() {

    fun getLiveData() =liveDataToObserve;

    private fun getDataFromLocalSource(isRussian:Boolean) {
        liveDataToObserve.postValue(Any.Loading)
        Thread {
            sleep(1000)
            if(isRussian){
                liveDataToObserve.postValue(Any.Success(repositoryImpl.getWeatherFromLocalStorageRus()))
            }else{
                liveDataToObserve.postValue(Any.Success(repositoryImpl.getWeatherFromLocalStorageWorld()))
            }

        }.start()
    }



}