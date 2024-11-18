plugins {
    // Apply the Kotlin JVM plugin for Kotlin support
    kotlin("jvm") version "1.9.10"

    // Apply the Spring Boot plugin for building web applications
    id("org.springframework.boot") version "3.2.0"

    // Dependency management for Spring Boot
    id("io.spring.dependency-management") version "1.1.3"

    // Application plugin for CLI applications
    application
}

repositories {
    // Use Maven Central for resolving dependencies
    mavenCentral()
}

dependencies {
    // Spring Boot Starter for building RESTful web applications
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Spring Boot Starter for cache management
    implementation("org.springframework.boot:spring-boot-starter-cache")

    // Ehcache dependency for caching support
    implementation("org.ehcache:ehcache:3.10.8")

    // Kotlin standard library
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.jetbrains.kotlin:kotlin-reflect") // Add this line

    // Spring Boot test support
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // JUnit Jupiter for testing
    testImplementation("org.junit.jupiter:junit-jupiter")

    // JUnit Platform Launcher (optional if needed)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // For Kotlin test utilities
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.xerial:sqlite-jdbc:3.43.0.0")
    implementation("com.h2database:h2")
    testImplementation("io.mockk:mockk:1.13.5")
}

// Apply a specific Java toolchain for consistent Java versioning
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(20)) // Keep this for Java toolchain
    }
}

application {
    // Define the main class for the application
    mainClass.set("com.example.climateaggregator.ClimateAggregatorApplicationKt")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "20" // Match Java's target here
    }
}