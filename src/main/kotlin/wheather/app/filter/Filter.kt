package main.kotlin.wheather.app.filter

import main.kotlin.wheather.app.weather.WeatherInfo

interface FilterPrinter {
    fun print(weathers: List<WeatherInfo>)
}

interface Filter : FilterPrinter {
    fun filter(weathers: List<WeatherInfo>, filterQuery: String): MutableList<WeatherInfo>
}

interface BinaryFilter : FilterPrinter {
    fun filter(weathers: List<WeatherInfo>, arg1: String, arg2: String): MutableList<WeatherInfo>
}