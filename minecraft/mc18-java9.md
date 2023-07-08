
---
tag: mc18-java9
alias []
---

> Was bedeutet `java.lang.RuntimeException: Unable to access address of buffer`
Dieser Fehler entsteht bei veralteten Minecraft Versionen unter der Verwendung neuerer Java Versionen
z.B. Minecraft 1.8.8 mit Java 11

> Wie kann ich das beheben?
**Möglichkeit 1 (Empfohlen):** `use-native-transport` deaktivieren
Eine Möglichkeit ist es in der `server.properties` Datei `use-native-transport=false` einzustellen
**Achtung:** Gegebenenfalls musst du diese Zeile neu hinzufügen
**Möglichkeit 2:** Eine ältere Java Version nutzen
Die andere Möglichkeit wäre es die Java Version die von deiner Minecraft Version unterstützt wird zu benutzen.
Für 1.8 wäre das Java 8
