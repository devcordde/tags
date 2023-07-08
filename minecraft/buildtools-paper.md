
---
tag: buildtools-paper
alias: []
---

**Buildtools-Paper**
Warum Buildtools von Spigot nutzen, die 200000x länger brauchen ||und spigot ist halt allgemein scheiße <:kekw:848497138357764127> ||, wenn man Paper haben kann <:smart:601098240624033830>

Wie?
0. Maven installieren, empfohlen: SDKman!!! wenn nicht halt mal googlen wies geht :D

1. Auf https://papermc.io/downloads gehen und die gewünschte Version runterladen, wehe wenn nicht latest <:hAA:601099320460312586>

2. Die runtergeladene Jar mit `java -Dpaperclip.install=true -jar <name deiner Jar>.jar` starten

3. In deinem Projekt kannst du dann als dependency von paper nehmen und `paper-api` durch `paper` ersetzen (das ist die artifact id ||(für die Maven user)||) und als repository dein maven local angeben

4. Dann kannst du dein Maven/Gradle Projekt reloaden und fertsch, du hast NMS  uns  so
