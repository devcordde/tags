
---
tag: javahome
alias ["java-home"]
---

**Wie setze ich meine JAVA_HOME variable? (Windows)**
1. Suche in der Suchleiste nach "Umgebungsvariablen" und gehe in die vorgeschlagenen Einstellungen.
2. In dem Fenster, klicke unten rechts auf `Umgebungsvariablen...`
3. Schaue bei den Systemvariablen nach einer Variable `JAVA_HOME`. Wenn sie nicht existiert, erstelle sie. Setze ihren Wert auf den **Pfad** zu dem JDK, was du benutzen willst.
4. Wähle in den Systemvariablen die Variable `Path` aus und klicke auf bearbeiten. Wenn es in der Liste Pfade gibt, die mit Java zu tun haben, lösche sie. Falls er noch nicht existiert, füge einen Wert namens `%JAVA_HOME%\bin` hinzu.
5. Wiederhole 4. für die `Path` Variable unter "Benutzervariablen"
6. Schließe alle Einstellungen mit `OK`.
7. Öffne ein neues Command Prompt (`Windows + R` und in dem Fenster "cmd" eingeben) und gib `java -version` ein. Deine gewünschte Version sollte nun angezeigt werden.
