package murad.akhundov.weatherapp.data.remote

import murad.akhundov.weatherapp.data.model.WeatherResponse
import murad.akhundov.weatherapp.data.model.forecast.ForecastResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.path
import murad.akhundov.weatherapp.config.BuildKonfig

class ApiService(private val client: HttpClient) {

    suspend fun currentWeatherInfo(lat: Double, long: Double): WeatherResponse {
        return client.get {
            url {
                host = "api.openweathermap.org"
                path("data/2.5/weather")
                parameters.append("lat", lat.toString())
                parameters.append("lon", long.toString())
                parameters.append("appid", BuildKonfig.APP_ID)
            }
        }.body<WeatherResponse>()
    }

    suspend fun forecastInfo(lat: Double, long: Double): ForecastResponse {
        return client.get {
            url {
                host = "api.openweathermap.org"
                path("data/2.5/forecast")
                parameters.append("lat", lat.toString())
                parameters.append("lon", long.toString())
                parameters.append("appid", BuildKonfig.APP_ID)
            }
        }.body<ForecastResponse>()
    }
}
