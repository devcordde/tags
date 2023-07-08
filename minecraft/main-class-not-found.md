
---
tag: main-class-not-found
alias: []
---

> Was bedeutet org.bukkit.plugin.InvalidPluginException: Cannot find main class com.schlaubi.isthebest.BotDeveloper
Wenn du einen derartigen Fehler bekommst bedeutet das, dass Spigot die Main Klasse deines Plugins nicht finden kann, dies kann folgende Ursachen haben:
**Ursache 1**:  Du hast dich vertippt
Die häufigste Ursache sind Tippfehler in der plugin.yml, bitte versichere dich, dass der name deiner Klasse 1:1 mit dem in der plugin.yml über einstimmt (Auch Groß-/Kleinschreibung beachten)

**Ursache 2**: Das Package ist falsch
Es kann vorkommen, dass sich das package unterscheidet, achte hier auf das selbe wie bei Ursache 1

**Ursache 3**: Dein Code ist nicht in der .jar-Datei
Es kann vorkommen, dass beim Exportieren deines Plugins ein Fehler passiert und der Code nicht in deiner .jar landet. Frage hierzu einfachmal die netten Menschen auf diesem Discord
