
---
tag: lizenzsystem
alias ["lizenz", "Lizenz", "Lizenzen"]
---

Du willst ein Plugin mit einem Lizenzsystem versehen?

**Frag dich erstmal, ob das wirklich nötig ist.** Selbst wenn du dein Plugin auf Seiten wie SpigotMC oder MCmarket verkaufen willst, ist eine Lizenzüberprüfung in aller Regel nicht nötig. Das meistverkaufte Spigot-Plugin, CMI, hat kein Lizenzsystem und der Ersteller lebt von diesem und anderen plugins bis heute.

**Wenn du wirklich ein Lizenzsystem machen willst**, dann hast du dafür viele Möglichkeiten:
- Mit Lizenzschlüsseln und Online-Verifikation: Du kannst dir einen Server mieten und dort ein Programm schreiben, was Lizenzen überprüft.
In deinem Plugin schickst du dann eine Anfrage an den Server (https), und schaust, ob die Lizenz gültig ist (Der Server antwortet ja)
*Nachteile: Du brauchst einen Server; Die Kommunikation kann abgefangen oder verändert werden; Du musst einen Server bezahlen*
- Mit HWID Protection und einem Obfuscator: Du kannst mit einem Obfuscator wie der von Superblaubeere27 (https://github.com/superblaubeere27/obfuscator) dein Plugin nicht nur unleserlich machen, sondern auch eine Hardware-ID-Überprüfung einbauen. Das Plugin läuft dann nur auf dem Server, dessen HWID du eingetragen hast. Dafür musst du dem Kunden aber manuell eine Datei schicken, die die HWID anzeigt.
**Vorteil: Es funktioniert ohne Server**
*Nachteile: Wenn 2 Leute genau den gleichen Server mieten, z.B. das gleiche Paket beim gleichen Hoster, dann haben sie auch die gleiche HWID ==> Sie können das Plugin dann austauschen. Außerdem musst du das Plugin dann für jeden Kunden neu obfuscaten, was Arbeit ist (außer du automatisierst es in einer Webseite, dann verlist du aber den Vorteil, dass es ohne Webseite/Server funktioniert*

Wie du siehst, ist es nicht ganz einfach. Daher nochmal der Tipp von oben: **Wenn du es nicht unbedingt brauchst, machst du dir unnötig Arbeit!!**
