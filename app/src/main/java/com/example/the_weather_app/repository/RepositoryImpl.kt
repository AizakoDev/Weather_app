package com.example.the_weather_app.repository

import com.example.the_weather_app.domain.Weather
import com.example.the_weather_app.domain.getRussianCities
import com.example.the_weather_app.domain.getWorldCities

class RepositoryImpl:Repository {
    override fun getWeatherFromRemoteSource(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalSource(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorageRus(): List<Weather> {
        return getRussianCities()
    }

    override fun getWeatherFromLocalStorageWorld(): List<Weather> {
        return getWorldCities()
    }

}