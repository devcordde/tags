
---
tag: spigot-gradle
alias []
---

```gradle
plugins {
  id "java"
}

repositories {
  maven { url "https://hub.spigotmc.org/nexus/content/repositories/snapshots/" }
  maven { url "https://oss.sonatype.org/content/repositories/snapshots" }
  mavenCentral()
  mavenLocal()
}

dependencies {
  compileOnly "org.spigotmc:spigot-api:1.17.1-R0.1-SNAPSHOT"
  // falls du die ganze server jar brauchst, musst die Build Tools ausführen
  // compileOnly "org.spigotmc:spigot:1.17.1-R0.1-SNAPSHOT"
}

jar { // optional
  destinationDirectory = file("pfad/zum/export/ordner") // zb. M:/MeinServer/spigot/1.8.8/plugins
  archivesBaseName = "NameMeinerJar" // zb. MeinPlugin
}

compileJava.options.encoding = "UTF-8"
```
