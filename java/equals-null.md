---
tag: equals-null
alias: []
---

> Wieso throwed Object#equals(Object) eine NPE
Wie man ja schon bei `/tag npe` lesen kann tritt eine NPE dann auf wenn man eine Methode/ein Field eines Objektes aufrufen will welches null ist. Equals
dies lässt sich auf 2 wege vermeiden

> b.equals(a)
Wenn nur eines der beiden Objekte null sein kann kann man equals einfach die methode des nicht nullable objektes aufrufen
```java
public boolean test(@Nullable objectA, @NotNull objectB) {
  return objectB.equals(objectA);
}
```

> Objects.equals
Wenn beide Objekte null sein können kann man `Objects#equals(Object, Object)`  benutzen (https://docs.oracle.com/javase/8/docs/api/java/util/Objects.html#equals-java.lang.Object-java.lang.Object-

```java
Objects.equals("a", "a") // => true
Objects.equals(null, "a") // => false
Objects.equals("a", null) // => false
Objects.equals(null, null) // => true
```

> Macht Kotlin das besser
Ja du kannst alles einfach mit `==` vergleichen und es ist nullsafe
https://kotlinlang.org/docs/reference/equality.html
