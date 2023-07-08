
---
tag: invaliddescriptionexception
alias ["plugin.yml"]
---

> Was ist eine `InvalidDescriptionException`
Eine `InvalidDescriptionException` kann mehrere Ursachen haben:
**Ursache 1:** Deine JAR enthält keine plugin.yml
Die häufigste Ursache ist, dass in deine JAR gar keine plugin.yml ist, das heißt du musst beim Exportieren von deinem Plugin darauf achten die `plugin.yml` mit zu exportieren

**Ursache 2:** Formatierung
Außerdem kann es sein, dass deine `plugin.yml` nicht richtig formatiert ist. Um dies zu prüfen kannst du einfach mal auf https://yamllint.com gehen

**Ursache 3:** Deine plugin.yml enthält ungültige Zeichen
Welche zeichen du für Namen verwenden darfst findest du hier: https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/plugin/PluginDescriptionFile.html

**Ursache 4:** Fehlende Informationen
Um zu überprüfen, ob deine `plugin.yml` vollständig ist prüfe ob sie diese Werte setzt `name`, `version`, `main`, `author`
