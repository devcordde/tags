---
tag: casting
alias: []
---

Casting ist keine Magie!
Mit einem cast lässt sich nicht jedes Objekt X in ein Objekt Y umwandeln. Es kann überhaupt nur dann funktionieren, wenn der Typ, zu dem man castet, von dem Typen erbt, den man hat.

Beispielsweise kann man einen `CommandSender` zu `Player` casten, weil `Player` von `CommandSender` erbt. Es gibt aber noch andere `CommandSender` - z.B. die Konsole oder Command Blocks - deshalb sollte man vorher mit `instanceof` überprüfen, ob es sich wirklich um einen `Player` handelt.

Man kann jedoch nicht etwa ein `BlockBreakEvent` zu einem `Player` casten, auch wenn ein `Player` etwas mit dem event zu tun hat. `BlockBreakEvent` und `Player` sind **nicht verwandt**, somit wird der cast **immer** einen Fehler erzeugen. In solchen Fällen sollte man schauen, ob es einen Weg gibt, um an das Objekt zu kommen, was man haben will. Beim `BlockBreakEvent` z.B. gibt es eine Methode `getPlayer()`, mit der man den `Player` erhält.
