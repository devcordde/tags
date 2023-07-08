
---
tag: lombok
alias []
---

Project Lombok ist ein Java Annotation-Processor, der einem die Nutzung der Sprache vereinfachen soll. Es wird jedoch empfohlen, es nicht zu benutzen.

> Warum ist es schlecht?
- Lombok nutzt **interne** und **unsichere** javac APIs, also nicht die offiziellen, die für Annotation-Processors bereitgestellt sind. Das ganze Projekt ist damit sehr **fragil** und kann mit einem einzigen Java-Update komplett zusammenbrechen.
- Lombok **modifiziert den eigenen Source Code**. Statt wie andere Prozessoren neue Klassen zu erstellen, ändert Lombok direkt den Code. Das hat zur Folge, dass **Kontrolle **über den Code beim kompillieren **verloren **geht. Fehler treten in Zeilen auf, die vorher gar nicht existiert haben, und um überhaupt Einsicht in Lomboks Änderungen zu bekommen, muss man alles "de-lomboken". Das ist sehr **umständlich**.
- Lombok versucht auf künstliche Weise Features in Java einzubauen, die **keinen Support von der Sprache** haben und zerstört somit zu einem gewissen Grad die Integrität der Sprache Java.
- Java bekommt immer regelmäßiger Updates, die auch die Sprache betreffen. Viele Lombok-Features **gibt es also inzwischen schon** in besser oder wird es in Zukunft geben. (records, local variable type inference (var))

> Ich möchte trotzdem jetzt die Features in vollem Umfang genießen!
Es gibt reichlich **Alternativen **zu Lombok. Zunächst wären da alternative JVM-Sprachen, etwa **Scala** (<https://docs.scala-lang.org/learn.html>) oder **Kotlin** (<https://kotlinlang.org/docs/reference/>). Diese sind voll kompatibel mit Java und auf die Reduzierung von typischem Java-Boilerplate ausgelegt. Außerdem haben sie noch viele weitere Vorzüge und machen ihren Job wegen First-Party-Support besser als Lombok.

> Ich will keine neue Sprache lernen.
Auch da gibt es Abhilfe: es gibt Annotation-Processors, die das können, was Lombok auch kann, ohne sich in den Compiler zu hacken; etwa **Immutables** (<https://immutables.github.io/>)
