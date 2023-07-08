---
tag: mc-main
alias: []
---

Die `Main`-Class beschreibt in gängigen Programmiersprachen den Startpunkt des Programms. Der Computer weiß so, womit er beginnen soll, wenn ein Programm ausgeführt wird. Von der Main-Klasse aus erfolgt der gesamte Rest.
Ein Minecraft-Plugin ist nicht direkt ein Programm, weshalb hier auch keine Main-Class benötigt wird. Dass man in der ``plugin.yml`` eine *main* angeben muss, ist nur eine unglückliche (falsche) Benennung von Spigot.
Benenne den Startpunkt deines Plugins also nach dem Namen des Plugins. Hierin implementierst du nun die `onEnable` Methode von Bukkit/Bungeecord, um den eigentlichen Startpunkt festzulegen.

Beim compilen muss demnach auch keine Main angegeben werden!
