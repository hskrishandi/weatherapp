package main.kotlin.wheather.app.filter

import main.kotlin.wheather.app.weather.WeatherInfo

class AndFilter(private val filter: Filter, private val otherFilter: Filter) : BinaryFilter {

    override fun filter(weathers: List<WeatherInfo>, arg1: String, arg2: String): MutableList<WeatherInfo> {

        val firstFilterItems = filter.filter(weathers, arg1)
        val secondFilterItems = otherFilter.filter(weathers, arg2)

        for(item in firstFilterItems){
            if(secondFilterItems.contains(item).not())
                secondFilterItems.add(item)
        }

        return secondFilterItems

    }

    override fun print(weathers: List<WeatherInfo>) {
        filter.print(weathers)
    }

}