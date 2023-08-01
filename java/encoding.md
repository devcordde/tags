---
tag: encoding
alias: ["utf-8", "utf8"]
---

**Eclipse**: Oben auf Window -> Preferences -> General -> Workspace -> "Text file encoding" -> Other -> UTF-8
**IntelliJ**: Oben auf File -> Settings -> Editor -> File Encodings -> "Global Encoding" und "Project Encoding" (und am besten auch noch "Properties Files"), alle auf UTF-8 setzen

__Bei einer Verwendung  von einem Build Tool, muss in der Konfigurationsdatei vom Build Tool **und** in den Settings der IDE das Encoding gesetzt sein. Und Achtung, beim ändern des Encodings in der IDE, kann es vorkommen dass die Zeichen (§ und andere) sich "*verändert*" haben, also bitte prüft nach und setzt alle ? die einmal § o.ä. waren neu.__
**Gradle**: in der build.gradle (Groovy DSL): 
```groovy
compileJava.options.encoding = "UTF-8"
```
in der build.gradle**.kts** (Kotlin DSL):
```
groovy
tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}
```
**Maven**: in der pom.xml in <project>:
```xml
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
```
**Spigot Server (JVM < 18)**: Damit ist es möglich Umlaute und § in der plugin.yml und andere yaml Dateien (Configs) zu benutzen. Dafür muss man bei `java -jar meine.jar`, das hier hinzufügen: `-Dfile.encoding="UTF-8"` (vor `-jar` (wichtig!)), bei höhren Java Versionen ist dies aber nicht mehr nötig.
