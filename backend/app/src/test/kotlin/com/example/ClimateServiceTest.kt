package com.example.climateaggregator

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ClimateServiceTest {

    private val mockRepository = mockk<ClimateRecordRepository>()
    private val climateService = ClimateService(mockRepository)

    @Test
    fun testSaveClimateData() {
        val payload = mapOf(
            "latitude" to 40.7128,
            "longitude" to -74.0060,
            "current_weather" to mapOf("temperature" to 15.0, "time" to "2024-11-17T22:00"),
            "humidity" to 70.0
        )

        every { mockRepository.save(any()) } returns ClimateRecord(
            id = 1,
            latitude = 40.7128,
            longitude = -74.0060,
            temperature = 15.0,
            humidity = 70.0,
            timestamp = "2024-11-17T22:00"
        )

        val result = climateService.saveClimateData(payload)
        assertTrue(result.contains("Data saved successfully"), "Result should confirm data saved")
    }
}
