plugins {
    kotlin("jvm").version("1.5.30")
}

allprojects {
    group = "org.example"
    version = "1.0-SNAPSHOT"
    description = "Issue with modules"

    repositories {
        mavenCentral()
    }
}
subprojects {
    apply(plugin="org.jetbrains.kotlin.jvm")
    dependencies {
        // Kotlin
        implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.30")
        implementation("org.jetbrains.kotlin:kotlin-reflect:1.5.30")
    }
}


tasks.wrapper {
    gradleVersion = "7.2"
    distributionType = Wrapper.DistributionType.ALL
}
