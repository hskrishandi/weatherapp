package main.kotlin.wheather.app.filter

import main.kotlin.wheather.app.weather.WeatherInfo
import wheather.app.Day

class DayFilter private constructor() : Filter {

    override fun filter(weathers: List<WeatherInfo>, day: String): MutableList<WeatherInfo>{

        val result = mutableListOf<WeatherInfo>()

        for(weather in weathers){
            if(weather.day == Day.valueOf(day))
                result.add(weather)
        }

        return result
    }


    override fun print(weathers: List<WeatherInfo>){

        if(weathers.isEmpty()){
            println("Not found")
            return
        }

        println(weathers[0].day)
        println("-------------")

        for(weather in weathers) {
            println(weather.location)
            println("Weather: " + weather.weather)
            println("Temperature: " + weather.temperature)
            println("")
        }

    }

    companion object {
        private var INSTANCE: DayFilter? = null
        fun getInstance(): DayFilter {
            if(INSTANCE == null){
                INSTANCE = DayFilter()
            }
            return INSTANCE!!
        }
    }
}