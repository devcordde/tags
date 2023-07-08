
---
tag: plugin-already-initialized
alias: ["InvalidPluginException", "invalidpluginexception"]
---

Wenn du beim Starten deines Plugins eine Fehlermeldung erhälst, die die Zeile `org.bukkit.plugin.InvalidPluginException: java.lang.IllegalArgumentException: Plugin already initialized!` enthält, liegt das höchstwahrscheinlich daran, dass du mehrere Plugins mit den gleichen oder nicht vorhandenen Packagebezeichnungen verwendest.

Wenn dies der Fall ist, solltest du dein Projektnamen in deine Packagebezeichnung integrieren. Ein Beispiel dafür wäre die Bezeichnung `de.maxmustermann.lobby`. In diesem Fall ist dein (Nick-)Name `maxmustermann` und dein Projektname `lobby`. Bestenfalls gehört dir auch die Domain `maxmustermann.de`. Dein Problem sollte nun behoben sein.

Wenn nicht, könnte dies durch eine Fehler beim Reloaden des Servers entstanden sein. Bitte benutze Neustarts, wenn das der Fall ist.
