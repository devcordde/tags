
---
tag: for
alias []
---

For-Schleife
Die For-Schleife nimmt man immer dann, wenn man die Anzahl der benötigten Schleifen-Durchläufe schon im Voraus kennt. Für die Vorschleife werden die folgenden drei Parameter benötigt:
Initialisierung
Zielwert
Schrittweite
Mit der Initialisierung legt man fest, ab welchen Wert man mit der Schleife startet. Die Schleife wird dann so lange durchgeführt, bis der Zielwert erreicht oder überschritten wird. Wie schnell das geht, das legt man mit der Schrittweite fest. Anbei die allgemeine Syntax der For-Schleife:


`for(Initialisierung; Zielwert; Schrittweite) {
    // Anweisungen
}`
Nachfolgend eine konkrete Schleife die "Hello World" genau 10 Mal ausgibt. Man nimmt als Startwert normalerweise die 0 oder die 1 (hier die 0). Soll "Hello World!" genau 10 Mal ausgegeben werden, dann muss die Schleife 10 mal ausgeführt werden. Startet man nun mit einem Startwert bei der Initialisierung von 0, dann ist der Zielwert < 10. Die Schrittweise ist natürlich immer +1 also ++. Hier nun die komplette For-Schleife


`for(int i=0; i<10; i++)
        {
          System.out.println("Hello World " + i);
        }`
Anmerkung: Gerade bei Zielbereich muss man bei der For-Schleife aufpassen. Hätte man hier z.B. die Bedingung i<=10 gemacht, dann wäre 11 mal "Hello World!" ausgegeben worden. Wäre i aber bei 1 gestartet, dann wiederum hätte man i<=10 für 10 Durchläufe schreiben müssen.

Quelle: https://www.java-programmieren.com/schleifen-java.php
