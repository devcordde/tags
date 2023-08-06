---
tag: plugin shading
alias: ["gradle shading", "minecraft shading"]
---

Nehmen wir an unsere Library befindet sich nicht im Maven Central und/oder wir können den Library Loader nicht verwenden.

In diesem Fall müssen wir ein anderes Plugin namens shadow verwenden um die Library in unser plugin zu shaden.
Außerdem müssen wir unsere geshadeten dependencies relocaten um Konflikte mit anderen Plugins zu vermeiden.

Wie das geht erfährst du [hier](<https://chojo.dev/blog/de/gradle_minecraft_basic_and_advanced/#abhangigkeiten-in-unser-jar-shaden>)
