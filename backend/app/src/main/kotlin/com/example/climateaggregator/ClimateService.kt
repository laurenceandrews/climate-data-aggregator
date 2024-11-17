package com.example.climateaggregator

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
open class ClimateService {

    @Cacheable("climateCache")
    fun getClimateData(location: String): String {
        println("Fetching climate data for $location")
        return "Climate data for $location at ${System.currentTimeMillis()}"
    }
}
