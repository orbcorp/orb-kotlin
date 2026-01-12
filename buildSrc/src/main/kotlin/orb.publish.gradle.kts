import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set("API Reference")
        description.set("Orb's API is built with the following principles in mind:\n\n1. **Predictable developer experience**: Where applicable, the Orb API uses\n   industry-standard patterns such as cursor-based pagination and standardized\n   error output. To help with debugging in critical API actions, the API always\n   strives to provide detailed and actionable error messages. Aliases such as\n   external customer IDs aid in fast integration times.\n2. **Reliably real time**: Orb's event-based APIs, such as event ingestion are\n   designed to handle extremely high throughput and scale with concurrent load.\n   Orb also provides a real-time event-level credits ledger and a highly\n   performant webhooks architecture.\n3. **Flexibility at the forefront**: Features like timezone localization and the\n   ability to amend historical usage show the flexible nature of the platform.\n\nYou can download the latest OpenAPI spec\n[here](https://api.withorb.com/spec.json) - pass `?version=3.0` for an OpenAPI\n3.0-compatible spec.")
        url.set("https://docs.withorb.com/reference/api-reference")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Orb")
                email.set("team@withorb.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/orbcorp/orb-kotlin.git")
            developerConnection.set("scm:git:git://github.com/orbcorp/orb-kotlin.git")
            url.set("https://github.com/orbcorp/orb-kotlin")
        }
    }
}
