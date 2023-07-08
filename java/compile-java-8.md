
---
tag: compile-java-8
alias: []
---

**Eclipse**: Im Package Explorer -> Rechtsklick auf dein JRE -> Configure Buildpath -> (Configure Buildpath ->) auf das JRE klicken -> Edit -> Java 1.8 stellen
**IntelliJ**: File -> File Structure -> Project -> Project Language Level -> 8
**Gradle**: in der build.gradle am Ende```groovy
sourceCompatibility = 1.8
targetCompatibility = 1.8
```**Maven:**: in die pom.xml```xml
<properties>
    <maven.compiler.target>1.8</maven.compiler.target>
    <maven.compiler.source>1.8</maven.compiler.source>
</properties>
```
