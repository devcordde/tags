---
tag: paper-gradle-kts
alias: ["paper-build-kts"]
---

```gradle
plugins {
    java

    // falls du weitere Abhängigkeiten in deinem Plugin benötigst, welche nicht von Paper bereitgestellt werden:
    // id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.wlosp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
}

java.toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
}

tasks {
    // statt den richtigen Namen und die Version in die plugin.yml zu schreiben
    // kannst du ${name} und ${version} hineinschreiben und es wird automatisch
    // mit dem Namen und der Version deines Gradle-Projektes ersetzt
    processResources {
        from(sourceSets.main.get().resources.srcDirs) {
            filesMatching("plugin.yml") {
                expand(
                        "version" to project.version,
                        "name" to project.name
                )
            }
            duplicatesStrategy = DuplicatesStrategy.INCLUDE
        }
    }
}
```

Falls du die NMS Klassen benötigst, empfiehlt sich das Paperweight-Plugin:
https://raw.githubusercontent.com/PaperMC/paperweight-test-plugin/master/build.gradle.kts
https://raw.githubusercontent.com/PaperMC/paperweight-test-plugin/master/settings.gradle.kts
