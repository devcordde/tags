---
tag: paperweight
alias: ["userdev", "paper-nms", "nms"]
---

Wenn du nms benutzen möchtest, solltest du das `userdev` Plugin von `paperweight` benutzen.
Damit kannst du in einer Umgebung mit unverschleierten Namen entwickeln.
Es ist auch die einzige unterstützte Möglichkeit, auf die Interna von `org.bukkit.craftbukkit.v1_XX_RX` zuzugreifen.
Es stellt auch sicher, dass du beim Upgrade auf eine neue Version keinen Code ändern musst, der das `net.minecraft` Package verwendet.
Natürlich musst du trotzdem Code ändern, wenn Mojang etwas geändert hat.
Du musst auch immer noch die Paketnamen ändern, wenn du internen Code aus `org.bukkit.craftbukkit.v1_XX_RX` verwendest.

Wie du das `userdev` Plugin in gradle einrichtest, erfährst du [hier](<https://chojo.dev/blog/de/gradle_minecraft_basic_and_advanced/#nms-und-internals-mit-paperweight-userdev>)
