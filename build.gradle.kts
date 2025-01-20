plugins {
    kotlin("jvm") version "2.1.0"
}

group = "com.daveleeds"
version = "0.22.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
    implementation("io.ktor:ktor-client-core-jvm:3.0.3")
    implementation("io.ktor:ktor-client-cio-jvm:3.0.3")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
