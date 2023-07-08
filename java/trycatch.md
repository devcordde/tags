
---
tag: trycatch
alias: []
---

`Try-catch-Anweisungen` dienen in Zusammenarbeit mit **Exceptions **hauptsächlich dem **Abfangen **von Programmfehlern.

Wie in anderen Programmen auch, so können in Java-Programmen natürlich Fehler auftreten. Nach ihrem Schweregrad werden sie in zwei Hauptkategorien eingeteilt:

Errors sind Fehler, die meist durch Fehlfunktionen der JVM ausgelöst werden, zum sofortigen Abbruch der Programmausführung führen und nicht abgefangen werden.
Exceptions (Ausnahmen) sind Fehler, die meist durch das Programm selbst (Konvertierungsprobleme, Typisierungsfehler etc.) oder unvorhergesehene Änderungen der Ausführungsbedingungen (Netzwerkabriss, Dateisystemfehler, etc.) ausgelöst werden können und gesichert abgefangen werden müssen. Hierzu dienen try-catch-Blöcke.
Der folgende Codeausschnitt zeigt den Einsatz des try-catch-Blockes am Beispiel des Aufrufs des Default-Browsers, mit dem hier die Webseite von Javabeginners dargestellt wird.

```java
try {
    Desktop.getDesktop().browse(new URI("https://javabeginners.de/%22));
} catch (IOException ioe) {
    System.out.println("IO-Problem");
    ioe.printStackTrace();
} catch  (URISyntaxException use) {
    System.out.println("URI-Problem");
    use.printStackTrace();
}
System.out.println("weiter geht's...");```

Quelle: https://javabeginners.de/Exceptions/Die_try-catch-Anweisung.php
