package murad.akhundov.weatherapp.domain.use_case

import murad.akhundov.weatherapp.domain.model.ForeCast
import murad.akhundov.weatherapp.domain.repo.WeatherRepository

class GetForecastInfoUseCase(private val weatherRepository: WeatherRepository) {

    suspend operator fun invoke(lat:Double, long:Double):Result<List<ForeCast>>{
        return try {
            val response = weatherRepository.getForecastInfo(lat, long)
            Result.success(response)
        }catch (e:Exception){
            Result.failure(e)
        }
    }
}