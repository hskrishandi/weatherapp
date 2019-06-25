package main.kotlin.wheather.app.weather

import wheather.app.Day

data class WeatherInfo(
    val weather: Weather,
    val temperature: Int,
    val day: Day,
    val location: String)