plugins {
    id("orb.kotlin")
    application
}

dependencies {
    implementation(project(":orb-kotlin-core"))
    implementation(project(":orb-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :orb-kotlin-example:run` to run `Main`
    // Use `./gradlew :orb-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.withorb.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
