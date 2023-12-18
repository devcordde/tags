plugins {
    java
    id("net.minecrell.plugin-yml.bukkit") version "0.6.0"
    // Falls du Abhängigkeiten in deinem Plugin benötigst, welche nicht von Paper oder anderen Plugins bereitgestellt werden.
    // id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.example"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    withSourcesJar()
    withJavadocJar()
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }

    compileTestJava {
        options.encoding = "UTF-8"
    }

    javadoc {
        options.encoding = "UTF-8"
    }

    // Falls du shadow benutzt
    //build {
    //    dependsOn(shadowJar)
    //}
    //shadowJar {
    //    val mapping = mapOf("com.example.mylib" to "mylib")
    //    val base = "com.example.myplugin.libs."
    //    for ((pattern, name) in mapping) relocate(pattern, "${base}${name}")
    //}

}

bukkit {
    // Dokumentation für Befehle etc gibts hier https://github.com/Minecrell/plugin-yml#bukkit
    name = "MyPlugin"
    main = "com.example.myplugin.MyPlugin"
}
