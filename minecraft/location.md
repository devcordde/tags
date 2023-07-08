---
tag: location
alias: []
---

Statt die Komponenten einer `Location` einzeln in einer yaml-config zu speichern, kannst du `Location`-Objekte direkt setzen:
```java
config.set("my.location", location); // serialisieren
Location loc = (Location) config.get("my.location"); // deserialisieren
```
