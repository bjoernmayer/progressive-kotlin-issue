import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // kotlin("jvm") version "1.4.10" // works
    kotlin("jvm") version "1.4.20" // and later fails
}

group = "me.bmayer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-core:5.3.6")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf(
            "-progressive",
            "-Xinline-classes",
            "-Xjsr305=strict",
            "-Xjvm-default=enable",
            "-Xopt-in=kotlin.ExperimentalUnsignedTypes"
        )
        jvmTarget = "11"
    }
}