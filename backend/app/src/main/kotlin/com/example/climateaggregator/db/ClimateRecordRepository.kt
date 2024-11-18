package com.example.climateaggregator

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClimateRecordRepository : JpaRepository<ClimateRecord, Long>