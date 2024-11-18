package com.example.climateaggregator

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class ClimateRecord(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val latitude: Double,
    val longitude: Double,
    val temperature: Double,
    val humidity: Double,
    val timestamp: String
)
