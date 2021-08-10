package com.example.androiddevchallenge.model

data class Weather(
    val dayOfWeek: String,
    val max: Float,
    val min: Float
)

val weatherlist = listOf<Weather>(
    Weather("Monday",19F, 17F),
    Weather("Tuesday",19F, 17F),
    Weather("Wednesday",19F, 17F),
    Weather("Thursday",19F, 17F),
    Weather("Friday",19F, 17F),
    Weather("Saturday",19F, 17F),
    Weather("Sunday",19F, 17F)
)