
---
tag: spigot-colorcodes
alias: ["scc", "colorcodes", "farbcodes"]
---

**Folgende Farbcodes kannst du in Spigot verwenden:**

§0 - Schwarz
§1 - Blau
§2 -Grün
§3 - Türkis
§4 - Rot
§5 - Violett
§6 - Orange
§7 - Grau
§8 - Dunkelgrau
§9 - Hellblau

§a - Hellgrün
§b - Aqua
§c - Hellrot
§d - Rosa
§e - Gelb
§f - Weiß (Standard)

**Sondercodes:**

§l - Bold, "fett"
§k - Magic, "magisch, unleserlich"
§o - Italic, "kursiv"
§m - Striketrough - "durchgestrichen"
§n - Underline - "unterstrichen"
§r - Reset "zurücksetzen der Farbcodes, es tritt Farbe §f ein."

**Info:**

Der **Farbcode** muss **immer** **vor** dem **Sonder-code** stehen, sonst wird der Sonder-code **zurückgesetzt**. Die Reihenfolge bei **mehreren Sonder-codes** ist nicht fest bestimmt und kann **beliebig ausgewählt werden**.

Bitte stelle deine **Projektkodierung UTF-8**, damit alle **Color-codes funktionieren**.

Was ist UTF-8? Viele Antworten darauf findest du hier: <https://en.wikipedia.org/wiki/UTF-8>
Standard in vielen Ländern ist die Kodierung **UTF-4**, diese eignet sich aber nicht für die deutsche Sprache, auf Grund der fehlenden Symbole, zum Beispiel *ä, ü, ö* ist UTF-4 nicht empehlenswert. Vor Allem in **Config-Files** werden die *§* falsch angezeigt, dies führt zu einem Ausfall der Color-Codes. Es erscheinen **komische Symbole** statt der eigentlichen Color-codes. *(Siehe Link-Embed (Link-Einbettung (Link-Vorschau)))*
https://images-ext-1.discordapp.net/external/HiACKpSXJOESDWBQg5Qggq06l-8QDeVErxm1iLdXRNk/https/media.discordapp.net/attachments/810517049331679253/811189998585118820/9k.png

**Alternativ kannst du natürlich auch das ChatColor-Enum verwenden**. Es ist in den **meisten Fällen übersichtlicher **und lässt sich in allen grafischen Benutzeroberflächen**beliebig nutzen**, exakt so wie die normalen **Color-codes**.

**Die Dokumentation zu dem ChatColor enum findest du hier:** <https://hub.spigotmc.org/javadocs/spigot/org/bukkit/ChatColor.html>
