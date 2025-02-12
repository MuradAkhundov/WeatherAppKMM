package murad.akhundov.weatherapp.data.mapper

import murad.akhundov.weatherapp.data.model.WeatherResponse
import murad.akhundov.weatherapp.data.model.forecast.ForecastResponse
import murad.akhundov.weatherapp.domain.model.ForeCast
import murad.akhundov.weatherapp.domain.model.Weather

fun WeatherResponse.toDomain(): Weather {
    return Weather(
        name= name,
        temperature = this.main.temp.minus(273).toString(),
        iconUrl = getImageUrl(this.weather.first().icon)
    )
}

fun ForecastResponse.toDomain():List<ForeCast>{
    return this.list.map {
        ForeCast(
            date = formatDate(it.dt.toLong()),
            temperature = it.main.temp.minus(273).toString(),
            iconUrl = getImageUrl(it.weather.first().icon)
        )
    }
}


expect fun formatDate(millis:Long):String

fun getImageUrl(iconId:String)="https://openweathermap.org/img/wn/$iconId@2x.png"