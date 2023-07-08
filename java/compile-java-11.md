---
tag: compile-java-11
alias: ["compile-java"]
---

**Eclipse**: Im Package Explorer -> Rechtsklick auf dein JRE -> Configure Buildpath -> (Configure Buildpath ->) auf das JRE klicken -> Edit -> Java 11 stellen
**IntelliJ**: File -> File Structure -> Project -> Project Language Level -> 11
**Gradle**: in der build.gradle am Ende```groovy
sourceCompatibility = 11
targetCompatibility = 11
```**Maven:**: in die pom.xml```xml
<properties>
    <maven.compiler.target>11</maven.compiler.target>
    <maven.compiler.source>11</maven.compiler.source>
</properties>
```
