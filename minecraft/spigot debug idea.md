---
tag: spigot debug idea
alias: []
---

> Wie debugge ich ein Minecraft Plugin in IntelliJ
**Schritt 1:** Erstelle eine neue `Remote` run configuration
https://rice.by.devs-from.asia/idea64_H38Ylw7cqp.png
**Schritt 2:** Füge `Build Artifacts` zu `Before run` hinzu. Wichtig ist hierbei, dass ein Artifact, welches du auswählst, das Plugin direkt in den `plugins/` exportiert wird
https://rice.by.devs-from.asia/idea64_lWdenTUKDE.png
**Schritt 3:** Füge `Run external tool` als `Before Run` hinzu um den Spigot Server zu starten.
https://rice.by.devs-from.asia/idea64_aXvaBHu62u.png
Achte hierbei darauf, dass du das `-agentlib` Argument von der Run configuration kopierts
https://rice.by.devs-from.asia/idea64_GFvVfqPnEx.png
