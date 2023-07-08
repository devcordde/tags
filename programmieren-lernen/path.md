
---
tag: path
alias []
---

> **Was ist der Unterschied zwischen dem absoluten und relativen Pfad?**

Der absolute Pfad bezieht sich immer auf ein Stammverzeichnis des Filesystems. Man erkennt es daran, dass dieser Pfad immer mit einem Slash beginnt.

> Beispiel: `/web/kunde/auftrag/`
> Windows: `C:\web\kunde\auftrag\`

Der relative Pfad zeigt die Struktur des Verzeichnisses an. Der Browser ist nicht in der Lage den absoluten Pfad einer Datei oder eines Befehls zu interpretieren. Hierzu wird der relative Pfad benötigt.

> Beispiel: `kunde/auftrag/`
> Windows: `kunde\auftrag\`

**_Windows hat mehrere Stammverzeichnisse, z.B.: C:\ oder D:\ _**
_In den meisten Programmiersprachen kann man entweder `/` oder `//` benutzen, und es würde das gleiche passieren._
_Bei Windows könnte man auch `\` benutzen, jedoch wird es auf Grund Kompatibilität mit anderen Betriebssystemen nicht empfohlen._
