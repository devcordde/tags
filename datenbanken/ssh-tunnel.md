---
tag: ssh-tunnel
alias: []
---

Wenn du dich zu einem Dienst auf deinem Server verbinden willst ist es oftmals die schlechtestes Lösung den Port zu öffnen.
Angreifer suchen automatisiert nach offenen Diensten wie Datenbanken und starten gezielt Brutforce oder andere Angriffe um Zugriff auf deine Daten zu erhalten.

Um Abhilfe zu schaffen existieren SSH Tunnel.

Für Datenbanken haben [**DataGrip**](<https://www.jetbrains.com/help/datagrip/configuring-ssh-and-ssl.html>) und [**HeidiSQL**](<https://marcus-obst.de/wiki/Database%20-%20HeidiSQL%20SSH%20Tunnel%20Setup>) bereits Integrationen und das Einstellen ist extrem simpel.

Alternativ kannst du über dein Terminal einfach einen SSH Tunnel herstellen.
```
ssh -L 3000:localhost:3306 -i /path/to/key_file user@my_server.com
```
Dieser Befehl macht deinen Dienst, welcher auf deinem Server auf dem `localhost` mit Port `3306` verfügbar ist, auf deinem System unter Port `3000` verfügbar. Natürlich auch auf dem `localhost`.

Wenn deine Datenbank in einem Docker Container läuft musst du `localhost` eventuell durch die interne IP des Containers ersetzen.

Weitere Informationen zum SSH Command: [**tldr**](<https://github.com/tldr-pages/tldr/blob/main/pages/common/ssh.md>) oder [**Ausführlich**](<https://www.everythingcli.org/ssh-tunnelling-for-fun-and-profit-local-vs-remote/>)

Wenn du Server untereinander verbinden willst ist AutoSSH empfehlenswert: [**tldr**](<https://github.com/tldr-pages/tldr/blob/main/pages/common/autossh.md>) oder [**Ausführlich**](<https://www.everythingcli.org/ssh-tunnelling-for-fun-and-profit-autossh/>)
