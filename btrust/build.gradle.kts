plugins {
    kotlin("jvm") version "2.2.21"
}

group = "btrust"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:dataframe:1.0.0-Beta4")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.json:json:20240303")
}


kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}