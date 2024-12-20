plugins {
    id("orb.kotlin")
    application
}

dependencies {
    implementation(project(":orb-kotlin"))
}

application {
    mainClass = "com.withorb.api.example.MainKt"
}
