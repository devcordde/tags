---
tag: java-installation
alias: ["java installation", "sdkman"]
image: https://github.com/devcordde/tags/assets/46890129/56cfd7a2-dcb0-423f-b151-e5764ebbeaab
---

## Anleitung für Windows:

- Java **21** (neuste LTS Version) downloaden (schon ausgewählt) [**JDK (JDK = JRE + Tools)**](<https://adoptium.net/temurin/releases/?jvmVariant=hotspot&version=21&os=windows>) 
- Datei (.msi) starten
- Wie im Bild, alles auswählen: auf das X klicken - > Installieren, damit es dann wie im Bild unten aussieht
- Fertig

## Anleitung für Linux & Mac:
**SDKMAN!** stellt eine kinderleichte Möglichkeit dar, bspw. Java-Versionen auf Unix-Betriebssystemen zu installieren und zu verwalten.
- **[SDKMAN!](<https://sdkman.io/install>) installieren**
- **Liste** der verfügbaren Java-Versionen **anzeigen lassen**: `sdk list java`
- **Java-Version auswählen** und den **Identifier** (letzte Spalte) **kopieren**. Empfohlen wird die neuste LTS Version von Temurin, 21 (Stand 26.03.24).
- **Java** mit dem Befehl `sdk install java <Identifier>` **installieren**.
- Warten und anschließend `y` eingeben, um die neue **Installation als Standard** zu **setzen**
- Fertig
