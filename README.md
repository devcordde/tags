# DevCord Tags

This is our tag repository for the Discord Bot [Krile](https://github.com/rainbowdashlabs/krile).

Our tags are german, so sorry in advance english speaking peeps c:

Feel free to propose changes and enhancements to our tags and use them on your own server!

---

Ab hier gehts auf Deutsch weiter.

## Tag Meta

Aliase von Tags werden in der Tag Meta definiert.
Diese ist optional und muss wenn vorhanden am Anfang des Files stehen.

```md
---
# Ändere die Tag-ID.
# Standardmäßig ist die Tag-ID der Dateiname ohne .md.
# Die id hier zu setzen ist hilfreich, wenn du die Datei umbenennst, aber die id beibehalten willst.
# Die id wird z.B. für die Zählung von Statistiken verwendet.
id: my tag
# Der eigentliche Tag-Name
# Standardmäßig ist dies die id
tag: my cool tag
# Eine Liste von Aliasen, die für diesen Tag angezeigt werden.
# Aliase haben eine niedrigere Priorität als der eigentliche Tag-Name.
# Im Falle eines Konflikts hat der Tag, der den Namen direkt verwendet, Vorrang.
alias: ["my tag", "another tag"]
# Die Kategorien des Tags. Sie werden für die Suche nach Tags verwendet und auch in der Entdeckungsfunktion eingesetzt.
category: ["java", "tutorial", "tags"]
# Ein Bild, das für den Tag angezeigt werden soll
image: https://krile.dev/my_image.png
---

# Cooler tag

Hier beginnt der eigentliche Tag. Du kannst alles an markdown verwenden was Discord her gibt!

Es gehen sogar mehr als 2000 Zeichen. Der Bot fügt in dem Fall automatisch neue Seiten hinzu.

Du kannst mit <new_page> auch selbst einfach eine neue Seite beginnen.
```

## Tags bearbeiten

Wenn du einen Tag bearbeiten willst kannst du einfach das File öffnen. 
Am schnellsten findest du es wenn du in Discord auf das Fragezeichen unter dem Tag drückst und anschließen auf den File Link im Info Embed.
Du kannst den Tag direkt hier auf GitHub bearbeiten.

## Tags erstellen

Um einen Tag zu erstellen musst du nur ein Markdown (.md) File in einem unserer Repos anlegen.
Die Repos und was sie enthalten findest du etwas weiter unten.
Dein Tag wird dann nach einiger Zeit auf dem Server verfügbar sein wenn die PR dafür gemerged wurde.

## Repositories

Dieses Repo

### github:devcordde/tags/database

Verzeichnis: database

Tipps zu Datenbanken und auch mit dem Umgang von SQL mit Java

### github:devcordde/tags/general

Verzeichnis: general

Generelle Tags die einfach allgemein Hilfreich sind.
