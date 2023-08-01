---
tag: classversion
alias: ["class-version", "UnsupportedClassVersionError"]
---

> Was bedeuted der java.lang.UnsupportedClassVersionError?

Wenn du einen `java.lang.UnsupportedClassVersionError` während des Ladens deines Plugins bekommst bedeutet dies, dass du zum kompilieren deines Plugins eine neuere Java Version als zum laden (Starten des Minecraft servers) verwendet hast.
Die Zahlen (meistens 52, 55, 59, 60, 61 sind respektiv die Java Versionen 8, 11, 15, 16 und 17, kannst mit `/tag major-version` nachschlagen)

Sollte die Version, die dir deine IDE anzeigt, neuer sein kannst du folgendes tun:

**Möglichkeit 1:**  Du lädst dir das JDK passend zu deiner zu kompilierenden Java version herunter (siehe `/tag java-installation`).

**Möglichkeit 2:** Du kompilierst mit der Version (oder älter als) die zum ausführen brauchst (siehe `Hinweis 3`, kann auch andere Version angegeben werden).

**Beispiel:** Java 8 PC, Java 17 IDE:
 - Java 17 downloaden und installieren (**empfohlen für MC 1.16.5+** (Java 11 klappt mit allen Versionen unter MC 1.16))
 - oder Hinweis 3.

Hinweis 1: Mit `/tag major-versions` kannst du herausfinden was die major Version bedeutet.
Hinweis 2: Du kannst auch direkt das JRE innerhalb deines JDKs benutzen um den Server zu starten. (BiVieh Fanboiiis hier klicken: ||Dieses findet ihr ggf. auf eurem Desktop im Development Ordner||). Dieses findet ihr im `bin/` Verzeichnisse eures JDKs (`java(.exe)`).
__Hinweis 3: Benutze `/tag compile-java-8` (compile-java-11 gibt's auch) um herauszufinden wie du deine Version zum kompilieren (auf Java 8/11) änderst.__
(***`/tag` cmds in 🤖-bot-commands ausführen***)
