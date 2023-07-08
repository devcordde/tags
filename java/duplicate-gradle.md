---
tag: duplicate-gradle
alias: ["dg", "gradle-duplicate"]
---

Hello fellow user!
Wenn du das siehst hast du wahrscheinlich auch das Problem, dass mit Gradle 7.0 ein Error kommt,
dass Gradle nicht weiß, wie es deine `plugin.yml` handeln soll.

**GROOVY**
Falls du das beheben möchtest, musst du folgenden Code in deine `build.gradle` kopieren:
```processResources {
    from(sourceSets.main.resources.srcDirs) {
        filter ReplaceTokens, tokens: [version: version]
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
    }
}```Wenn du das schon standardmäßig hast, füge unter
`filter ReplaceTokens, tokens: [version: version]`
einfach
`duplicatesStrategy = DuplicatesStrategy.INCLUDE`
ein. Nun sollte dein Problem gefixt sein.

**KOTLIN**
Falls du das beheben möchtest, musst du folgenden Code in deine `build.gradle.kts` kopieren:
```tasks {
    processResources {
        from(sourceSets.main.get().resources.srcDirs) {
            duplicatesStrategy = DuplicatesStrategy.INCLUDE
        }
    }
}```Falls du `processResources` schon hast, musst du einfach
`duplicatesStrategy = DuplicatesStrategy.INCLUDE` hinzufügen.
Nun sollte dein Problem gefixt sein.
Viel Spaß!
