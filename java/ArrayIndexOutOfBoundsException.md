---
tag: ArrayIndexOutOfBoundsException
alias: ["IndexOutOfBoundsException", "aioobe"]
---

> Was ist eine ArrayIndexOutOfBoundsException
Eine ArrayIndexOutOfBoundsException zeigt, dass du versuchst auf ein Element eines Arrays zuzugreifen, was außerhalb seiner Größe liegt.
Am häufigsten tritt diese auf weil man nicht beachtet, dass der Array Index bei 0 anfängt
```java
int[] array = new int[] {1, 2, 3, 4}; //=> 4 elemente => letzter index 3
int lastIndex = array.length; //=> 4
int lastElement = array[lastIndex]; //=> Exception weil es kein element mit index 4 gibt.
```
Beheben lässt sich das obere Beispiel einfach, indem man 1 von der Größe abzieht und dadurch den letzten Index (nämlich 3) bekommt.

Dies funktioniert aber nur, wenn man das letzte Element haben will, sollte man ein anderes Element abgerufen haben ist es hilfreich die Größe des Arrays zu prüfen und dann den gewollten Index zu ändern
