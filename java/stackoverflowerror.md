---
tag: stackoverflowerror
alias: []
---

> Was ist ein java.lang.StackOverflowError
Doc: `Thrown when a stack overflow occurs because an application recurses too deeply.`
Ein StackOverflow error tritt auf wenn eine Methode sich selber zu oft wieder aufruft also quasi eine nie endende Rekusrsion

```java
public void println(String string) {
  println(string);
}```
Hier im Beispiel ruft println sich selber wieder auf was wieder println aufruft und so weiter -> es hört also nie auf daher der Fehler.

Häufig tritt dies unter anderem bei Overloads auf.

```java
public void println(String string) {
  println(string);
}

public void println(String string, boolean makeUpperCase) {
  if (makeUpperCase) {
    println(string.toUpperCase());
  } else {
    println(string);
  }
}

```

hier sehen wir wie vergessen wurde beim oberen overload den 2. parameter hinzuzufügen weswegen es nicht `println(String, boolean)` sondern`println(String)` und dadurch immer wieder sich selber aufruft
