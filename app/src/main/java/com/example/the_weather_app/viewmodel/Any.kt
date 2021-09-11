package com.example.the_weather_app.viewmodel

import com.example.the_weather_app.domain.Weather

sealed class Any{
    object Loading:Any()
    data class Success(val weatherData: List<Weather>):Any()
    data class Error(val error:Throwable):Any()
}
