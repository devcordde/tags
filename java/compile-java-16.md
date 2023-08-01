---
tag: compile-java-16
alias: []
---

**Eclipse**: Im Package Explorer -> Rechtsklick auf dein JRE -> Configure Buildpath -> (Configure Buildpath ->) auf das JRE klicken -> Edit -> Java 16 stellen
**IntelliJ**: File -> File Structure -> Project -> Project Language Level -> 16
**Gradle**: in der build.gradle am Ende
```groovy
sourceCompatibility = 16
targetCompatibility = 16
```
**Maven:**: in die pom.xml
```xml
<properties>
    <maven.compiler.target>16</maven.compiler.target>
    <maven.compiler.source>16</maven.compiler.source>
</properties>
```
