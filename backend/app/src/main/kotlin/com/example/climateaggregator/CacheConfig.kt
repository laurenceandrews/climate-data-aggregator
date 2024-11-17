package com.example.climateaggregator

import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Configuration
import org.springframework.cache.CacheManager
import org.springframework.cache.jcache.JCacheCacheManager

@Configuration
@EnableCaching
open class CacheConfig {
    fun cacheManager(): CacheManager {
        return JCacheCacheManager()
    }
}
