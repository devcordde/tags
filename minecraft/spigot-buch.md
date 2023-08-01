---
tag: spigot-buch
alias: ["sb", "buch"]
---

Hey! Wie es aussieht möchtest du gerade ein Buch erstellen und es dem Spieler öffnen.
Befolge diese Anleitung und du wirst wissen wie es geht:
```java
ArrayList<String> bookContent = new ArrayList<>();
//hier erstellen wir die Seiten

bookContent.add("Seite 1 \n Zweite Zeile 2");
bookContent.add("Seite 2 \n Zweite Zeile Seite 2")
//hier setzen wir die Seiten. Jeder Eintrag ist eine Seite. Man kommt in die nächste Zeile des Buches in dem man entweder "\n" schreibt oder bis zum Ende der Zeile schreibt.

ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
//Wir erstellen das Buch als ItemStack

BookMeta bookMeta = (BookMeta) book.getItemMeta();
//Wir holen uns die Attribute aus dem Buch

bookMeta.setPages(bookContent);
//Wir setzem die Seiten

bookMeta.setTitle("Buch");
//Wir setzen den Titel des Buches (eigentlich irrelevant wenn ihr es direkt öffnet), jedoch solltet ihr dieses Attribut nutzen (zur Sicherheit)

bookMeta.setAuthor("Server");
//Auch irrelevant, jedoch solltet ihr dieses Attribut ebenfalls nutzen (zur Sicherheit)

book.setItemMeta(bookMeta);
//Hier geben wir dem Buch die Attribute auf den Weg

```
Nun habt ihr ein voll-funktionales Buch! Ihr könnt es entweder dem Spieler geben oder seit der 1.14 dem Spieler direkt öffnen:
```java
player.openBook(book);
//"player" ist hierbei der Spieler dem ihr es öffnen möchtet und "book" der ItemStack
```
Es gibt auch Wege das Buch direkt zu öffnen in Versionen niedriger als 1.14, fragt einfach mal in <#486919187038470155>.
Ich hoffe das hat euch geholfen!
