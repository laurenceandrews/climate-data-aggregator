package com.example.climateaggregator

import org.springframework.stereotype.Service

@Service
open class ClimateService(private val climateRecordRepository: ClimateRecordRepository) {

    fun saveClimateData(payload: Map<String, Any>): String {
        val latitude = payload["latitude"]?.toString()?.toDoubleOrNull() ?: 0.0
        val longitude = payload["longitude"]?.toString()?.toDoubleOrNull() ?: 0.0
        val currentWeather = payload["current_weather"] as? Map<*, *>
        val temperature = currentWeather?.get("temperature")?.toString()?.toDoubleOrNull() ?: 0.0
        val timestamp = currentWeather?.get("time") as? String ?: "unknown"
        val humidity = payload["humidity"]?.toString()?.toDoubleOrNull() ?: 0.0

        val record = ClimateRecord(
            latitude = latitude,
            longitude = longitude,
            temperature = temperature,
            humidity = humidity,
            timestamp = timestamp
        )

        climateRecordRepository.save(record)
        return "Data saved successfully for location ($latitude, $longitude)"
    }

    fun getClimateData(location: String): String {
        // Simulate returning cached climate data or fetching from DB
        return "Climate data for $location at ${System.currentTimeMillis()}"
    }

    fun getRecentClimateData(): List<ClimateRecord> {
        return climateRecordRepository.findAll().takeLast(10) // Fetch the last 10 records
    }
}