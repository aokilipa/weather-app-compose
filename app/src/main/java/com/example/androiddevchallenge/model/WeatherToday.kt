package com.example.androiddevchallenge.model

data class Hourly (
    val time: String,
    val temp: Double
)

val hourlyList = listOf<Hourly>(
    Hourly("10 AM", 19.00),
    Hourly("11 AM", 19.00),
    Hourly("12 AM", 19.00),
    Hourly("01 AM", 19.00),
    Hourly("02 AM", 19.00)
)