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

Kurze Beispiele sind auf der nächsten Seite!
<new_page>
Der Query Builder:```java
public Optional<Result> getResultNew(int id) {
  return builder(Result.class)
    .query("SELECT result FROM results WHERE id = ?")
    .parameters(stmt -> stmt.setInt(id))
    .readRow(rs -> new Result(rs.getString("result")))
    .firstSync(); // ohne sync für eine CompletableFuture!
}
```Und der DataSourceBuilder:```java
HikariDataSource dataSource = DataSourceCreator.create(PostgreSql.get())
  // We configure the usual stuff.
  .configure(config -> config.host("localhost")
     .port(5432)
     .user("root")
     .password("passy")
     .database("db")
   )
   .create() // We create the hikari data source
   // We set a max of 3 parallel connections.
   .withMaximumPoolSize(3)
   // And define that we want to keep always at least one connecction.
   .withMinimumIdle(1)
   .build();
```
Bock gekriegt? Auf der nächsten Seite sind Gradle und Maven Informationen!
<new_page>
Du kannst **SADU** importieren via **Maven** oder **Gradle**:```kts
dependencies {
    implementation("de.chojo.sadu", "sadu", "version")
}
``````xml
<dependency>
    <groupId>de.chojo.sadu</groupId>
    <artifactId>sadu</artifactId>
    <version>version</version>
</dependency>
```

Die aktuelle Version findest du in der Readme auf **[GitHub](<https://github.com/rainbowdashlabs/sadu>)**.
Außerdem kannst du auch die einzelnen Module importieren um nur zu haben, was du auch brauchst. Mehr dazu im **[Wiki](<https://github.com/rainbowdashlabs/sadu/wiki>)**.
