plugins {
    id("java")
    id("maven-publish")
}

if (hasProperty("buildScan")) {
    extensions.findByName("buildScan")?.withGroovyBuilder {
        setProperty("termsOfServiceUrl", "https://gradle.com/terms-of-service")
        setProperty("termsOfServiceAgree", "yes")
    }
}

group = "net.raphdf201"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "net.raphdf201"
            artifactId = "lib"
            version = "0.1"

            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/raphdf201/lib")
            credentials {
                username = "Raphdf201"
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
