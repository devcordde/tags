
---
tag: deprecated
alias: []
---

> Wieso ist diese Methode da durchgestrichen?
Wenn eine Methode von deiner IDE durchgestrichen ist, bedeutet das dass, diese deprecated ist und nicht mehr benutzt werden soll und bald entfernt wird

Das kann dann so aussehen
```java
/**
  * @deprecated use coolMethod() instead
  *
  */
@Deprecated
void dumbMethod();

void coolMethod();
```
wie man schon in der Dokumentation darüber (`@deprecated use coolMethod() instead`) lesen kann sollte man `coolMethod()` stattdessen benutzen.
Dies behebt nicht nur, dass die Methode nicht mehr durchgestrichen ist sondern ihr seit auf der sicheren Seite da deprecated Methoden meistens in neueren Versionen entfernt werden
