package murad.akhundov.weatherapp.domain.use_case

import murad.akhundov.weatherapp.domain.model.Weather
import murad.akhundov.weatherapp.domain.repo.WeatherRepository

class GetCurrentWeatherInfoUseCase (private val weatherRepository: WeatherRepository){


    suspend operator fun invoke(lat:Double,long:Double) : Result<Weather>{
        return try {
            val response = weatherRepository.getCurrentWeatherInfo(lat, long)
            Result.success(response)
        }catch (e:Exception){
            Result.failure(e)
        }
    }

}