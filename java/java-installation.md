
---
tag: java-installation
alias ["java installation", "sdkman"]
---

__Anleitung für Windows:__
**-** Java **18** mit Hotspot downloaden (schon ausgewählt)
**JDK (JDK = JRE + Tools)**: <https://adoptium.net/?variant=openjdk18&jvmVariant=hotspot>
**-** Datei (.msi) starten
**-** Wie im Bild, alles auswählen: auf das X klicken - > Installieren, damit es dann wie im Bild unten aussieht
https://cdn.discordapp.com/attachments/486919573229010944/702076808027439114/Screenshot_1143.png
**- Fertig**

__Anleitung für Linux & Mac:__
**SDKMAN!** stellt eine kinderleichte Möglichkeit dar, bspw. Java-Versionen auf Unix-Betriebssystemen zu installieren und zu verwalten.
**-** **SDKMAN! installieren**: <https://sdkman.io/install>
**-** **Liste** der verfügbaren Java-Versionen **anzeigen lassen**: `sdk list java`
**-** **Java-Version auswählen** und den **Identifier** (letzte Spalte) **kopieren**. Empfohlen wird die neuste Version von Temurin, 18 (Stand 13.04.22).
**-** **Java** mit dem Befehl `sdk install java <Identifier>` **installieren**.
**-** Warten und anschließend `y` eingeben, um die neue **Installation als Standard** zu **setzen**
**- Fertig**
