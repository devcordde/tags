---
tag: download spigot
alias: ["buildtools"]
---

__**Wie kann ich Spigot herunterladen?**__
Nach dem DMCA-Debakel von 2014 (<https://www.spigotmc.org/wiki/unofficial-explanation-about-the-dmca/>) musste der Weg um Server-Software, welche auf Bukkit basiert (Spigot, Paper, etc) neu konzipiert werden. Daher gibt es jetzt keinen direkten Download mehr zu einer "spigot.jar" oder ähnlichem.
Um das Copyright von Mojang nicht zu verletzen, bieten die Entwickler von Bukkit-Forks nun ein Tool an, welches den offiziellen Server von Mojangs Servern herunterlädt und die benötigten Patches anschließend hinzufügt. Die bekanntesten 2 Tools sind BuildTools von Spigot selbst und PaperClip von PaperMC.

__**PaperClip**__
PaperClip hat den Vorteil, deutlich schneller zu patchen als BuildTools, allerdings pushed es bis zur 1.16.2 nicht die gepatchte jar in das maven local repository, was benötigt wird, wenn man NMS während der Entwicklung eines Plugins benutzen will. Ab der 1.16.2 gibt es folgenden Befehl: `java -Dpaperclip.install=true -jar paperclip.jar`.

**Verwendung:** Um PaperClip zu benutzen, lädt man einfach eine Version von PaperSpigot herunter und startet diese, der Rest passiert automatisch.
Latest: https://papermc.io/downloads
Legacy (1.14.4 und älter): <https://papermc.io/legacy>

__**BuildTools**__
Spigot's BuildTools bietet die Möglichkeit, gleich Spigot und Bukkit (letzteres bis zur 1.12) zu builden und fügt beide dem maven local repository hinzu.

**Wichtig:** Auf Windows wird Git Bash bennötigt! Das findet ihr hier: <https://git-scm.com/>
Um nun Spigot zu builden, müsst ihr einfach `java -jar BuildTools.jar --rev 1.16.5` ausführen.
Wenn ihr die neuste Version buildet, könnt ihr euch das `--rev` weglassen.
**Vorsicht:** Führt BuildTools am besten in einem eigenen Ordner aus.
