package com.example.climateaggregator

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
open class ClimateController(private val climateService: ClimateService) {

    @GetMapping("/climate")
    fun getClimate(@RequestParam location: String): String {
        return climateService.getClimateData(location)
    }
}
