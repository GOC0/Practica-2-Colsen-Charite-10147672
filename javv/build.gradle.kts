import org.gradle.api.internal.plugins.MainClass

plugins {
    id("java")
    id("application")

}

group = "javv"
version = "1.0-SNAPSHOT"

application {
    mainClass="javv.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.javalin:javalin:6.7.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}