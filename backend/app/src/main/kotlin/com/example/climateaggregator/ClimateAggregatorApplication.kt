package com.example.climateaggregator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
open class ClimateAggregatorApplication

fun main(args: Array<String>) {
    runApplication<ClimateAggregatorApplication>(*args)
}
