plugins {
    id("java")
    id("maven-publish")
}

group = "net.raphdf201"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/raphdf201/lib")
            credentials {
                username = System.getenv("USERNAME")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
