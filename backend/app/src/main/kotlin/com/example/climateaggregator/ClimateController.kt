package com.example.climateaggregator

import org.springframework.web.bind.annotation.*
import org.slf4j.LoggerFactory

@RestController
open class ClimateController(private val climateService: ClimateService) {

    private val logger = LoggerFactory.getLogger(ClimateController::class.java)

    @GetMapping("/climate")
    fun getClimate(@RequestParam location: String): String {
        logger.info("GET request received for location: $location")
        return climateService.getClimateData(location)
    }

    @PostMapping("/climate")
    fun receiveClimateData(@RequestBody payload: Map<String, Any>): String {
        logger.info("POST request received with payload: $payload")
        return climateService.saveClimateData(payload)
    }
}
