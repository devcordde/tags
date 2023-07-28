---
tag: sadu
alias: ["sadu-lib"]
---

**[SADU](<https://github.com/rainbowdashlabs/sadu>)** ist eine **SQL Library**, welche versucht **Boilerplate Code zu verringern** und zusätzlich die größten **Fehler** bei der Arbeit mit SQL Datenbanken **vermeidet**.

Was SADU dir bietet:
- **[Query Builder](<https://github.com/rainbowdashlabs/sadu/wiki/SADU-Queries>)** zum einfachen senden von Queries an deine Datenbank und zum auslesen der Antwort
- **[Data Source Creator](<https://github.com/rainbowdashlabs/sadu/wiki/SADU-Datasource>)** Einfaches erstellen einer DataSource basieren auf [HikariCP](<https://github.com/brettwooldridge/HikariCP>)
- **[Database Updater](<https://github.com/rainbowdashlabs/sadu/wiki/SADU-Updater>)** Setup und Update deiner Datenbank mit der Hilfe von sql patches.
- **[Support der Bekannten Datenbanken](<https://github.com/rainbowdashlabs/sadu/wiki/SADU-Sql-Types>)** SADU untersützt PostgreSQL, MariaDB, MySQL und SqLite

Du kannst **SADU** importieren via **Maven** oder **Gradle**:
```kts
dependencies {
    implementation("de.chojo.sadu", "sadu", "version")
}
```
```xml
<dependency>
    <groupIdde.chojo.sadu</groupId>
    <artifactId>sadu</artifactId>
    <version>version</version>
</dependency>
```

Die aktuelle Version findest du in der Readme auf **[GitHub](<https://github.com/rainbowdashlabs/sadu>)**.
Außerdem kannst du auch die einzelnen Module importieren um nur zu haben, was du auch brauchst. Mehr dazu im **[Wiki](<https://github.com/rainbowdashlabs/sadu/wiki>)**.
