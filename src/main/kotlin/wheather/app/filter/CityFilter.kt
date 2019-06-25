package main.kotlin.wheather.app.filter

import main.kotlin.wheather.app.weather.WeatherInfo

class CityFilter private constructor(): Filter {

    override fun filter(weathers: List<WeatherInfo>, city: String): MutableList<WeatherInfo>{

        val result = mutableListOf<WeatherInfo>()

        for(weather in weathers){
            if(weather.location.equals(city, true))
                result.add(weather)
        }

        return result
    }


    override fun print(weathers: List<WeatherInfo>){

        if(weathers.isEmpty()){
            println("Not found")
            return
        }

        println(weathers[0].location.toUpperCase())
        println("-------------")


        println("Day\tWeather\tTemperature")

        for(weather in weathers) {
            print(weather.day)
            print("\t" + weather.weather)
            print("\t" + weather.temperature + " C")
            println("")
        }

    }

    companion object {
        private var INSTANCE: CityFilter? = null
        fun getInstance(): CityFilter {
            if(INSTANCE == null){
                INSTANCE = CityFilter()
            }
            return INSTANCE!!
        }
    }
}