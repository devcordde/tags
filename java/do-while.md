
---
tag: do-while
alias []
---


**Do-While-Schleife**

*Wenn man weiß, dass die Schleife auf jeden Fall mindestens einmal ausgeführt werden soll, dann kann man statt einer While-Schleife auch eine Do-While-Schleife einsetzen. Eine Do-While-Schleife ist im Grunde genommen nichts Anderes, als eine While-Schleife bei der die Schleifen-Bedingung am Ende der Schleife und nicht am Anfang steht.*


```java
do
{
  // Anweisungen
}
while(Bedingung);
```

*Damit wird unser nachfolgendes Code-Stück, obwohl die Variable var schon von Anfang an mit false initialisiert wurde, dennoch einmal die Meldung "Hello World" wie bei der While-Schleife ausgeben:*


```java
boolean var=false;
do
{
  System.out.println("Hello World");
}
while(var);
```

**Anmerkung: Würde man in diesem Beispiel statt die Variable mit false mit true initialisieren und sonst nichts ändern, dann hätte man eine Endlosschleife. Ebenfalls hätte man eine Endlosschleife, wenn man die Variable zwar mit false initialisieren würde, in der Schleife selbst aber dann der Variablen var=true zuweisen würden. Endlosschleifen sollten auf jeden Fall verhindert werden!**

*Video Tutorial zur do-while-Schleife*
*Anbei ein Video in dem die do-while-Schleife vorgestellt und anhand von Beispielen demonstriert wird. So wird gezeigt, wie aus einer while-Schleife eine do-while Schleife* *gemacht wird und was der Unterschied zwischen diesen beiden Schleifenarten in Java ist.*

||Quelle: https://www.java-programmieren.com/schleifen-java.php||
