
---
tag: spigot-gradle-kts
alias: ["spigot.gradle.kts"]
---

```kotlin
import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    id("com.github.johnrengelman.shadow") version "6.0.0"
    java
}

group = "org.wlosp"
version = "1.0-SNAPSHOT"

/**
 * Location of developers plugins directory in gradle.properties.
 */
val spigotPluginsDir: String? by project

repositories {
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots")

    // maven("https://oss.sonatype.org/content/repositories/snapshots/") // falls du 1.15.2 un älter benutzt
    // mavenLocal() // falls du die ganze server jar brauchst
}

dependencies {
    compileOnly("org.spigotmc", "spigot-api", "1.16.1-R0.1-SNAPSHOT")
}

tasks {
    // statt die richtige version in die plugin.yml zu schreiben kannst du "@version@" rein schreiben und es wird mit deiner gradle projekt version ersetzt
    processResources {
        from(sourceSets.main.get().resources.srcDirs) {
            expand(
              "version" to project.version,
              "name" to project.name
            )
            duplicatesStrategy = DuplicatesStrategy.INCLUDE
        }
    }


    task<Copy>("installPlugin") {
        dependsOn(shadowJar)
        from(shadowJar)
        include("-all.jar")
        into(spigotPluginsDir ?: error("Please set spigotPluginsDir in gradle.properties"))
    }
}```
