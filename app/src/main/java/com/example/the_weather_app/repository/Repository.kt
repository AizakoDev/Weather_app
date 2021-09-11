package com.example.the_weather_app.repository

import com.example.the_weather_app.domain.Weather

interface Repository {
    fun getWeatherFromRemoteSource():Weather
    fun getWeatherFromLocalSource():Weather

    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}