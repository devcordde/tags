---
tag: nullpointerexception
alias: ["npe"]
---

Du scheinst eine `NullPointerException` zu haben. Das heißt, du greifst irgendwo in deinem Programm auf etwas zu, das keinen Wert zugewiesen hat, also `null` ist.
Deine Fehlermeldung sieht wahrscheinlich so oder so ähnlich aus:
```
Exception in thread "main" java.lang.NullPointerException
        at HelloWorld.start(HelloWorld.java:6)
        at Main.main(Main.java:4)
```
Eine Anleitung, wie man so einen stack trace liest, findest du unter anderem hier: https://stackoverflow.com/questions/3988788/what-is-a-stack-trace-and-how-can-i-use-it-to-debug-my-application-errors
Am wichtigsten ist die **erste Zeile unter "java.lang.NullPointerException**" (diese kann bei dir auch woanders stehen): denn dort steht, wo der Fehler konkret auftritt. In diesem Fall:
`at HelloWorld.start(HelloWorld.java:6)`
Das heißt nichts anderes als: Klasse `HelloWorld`, Methode `start()`, Zeile 6 der Datei.
```
6            person.greet();
```
In Zeile 6 wird nur auf person zugegriffen, das heißt, person ist null, wie hier auch zu sehen ist:
```java
1   public class HelloWorld {
2
3       private Person person;
4
5        public void start() {
6            person.greet();
7        }
8   }
```
Dies würde sich nun beheben lassen, indem person ein Wert zugewiesen wird.

Sollte es keine Möglichkeit geben einen Wert zuzuweisen, da es sich um eine externe Methode handelt, ist es ratsahm den Rückgabewert auf null zu überprüfen

Beispiel:

```java
1            Person person = getPersonByName("_"); 
2            if (person != null) {
3                person.greet();
4            }
```
Und so lassen sich die meisten `NullPointerExceptions` beheben!

Tipp: Wann eine Methode `null` zurückgibt steht meistens in den Javadocs
