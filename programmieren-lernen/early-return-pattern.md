---
tag: early-return-pattern
alias: ["early return pattern", "erp", "bouncer-pattern", "bouncer pattern", "early return", "early-return"]
---

Das Early Return Pattern (oder auch Bouncer Pattern genannt) dient dazu, Verschachtelungen im Code aufzulösen und dadurch den Code besser lesbar zu machen.
Der Code...
```java
if (Bedingung) {
  if (Bedingung2) {
    if (Bedingung3) {
      doSomething();
    }
  }
}
```
sollte laut dem Early Return Pattern folgendermaßen geschrieben werden:
```java
if (!Bedingung) {
  return; // Optional: return <Rückgabewert>;
}

if (!Bedingung2) {
  return;
}

if (!Bedingung3) {
  return;
}

doSomething();
```
Der Code ist deutlich besser lesbar und man kann einfacher nachvollziehen, wo es ggf. Probleme gibt.

Weitere Infos sowie weitere Argumente für und gegen das Pattern findest du hier: <https://medium.com/better-programming/are-early-returns-any-good-eed4b4d03866>
