
---
tag: while
alias ["do"]
---

While-Schleife
Die While-Schleife wird so lange durchlaufen, bis die Bedingung ein False ergibt. Dabei steht die Bedingung am Anfang, ist sie also schon davor „falsch“, dann wird die Schleife kein einziges Mal ausgeführt, sondern übersprungen.

Anbei die Syntax der While-Schleife


`while(Bedingung)
{
  // Anweisungen
}`
Die nachfolgende While-Schleife wird beispielsweise nur einmalig ausgeführt, da sich beim ersten Durchlauf die Bedingung erfüllt, in dem die Variable "var" auf "false" gesetzt wird:

`boolean var=true;
while(var)
{
  var=false;
   System.out.println("Hello World");
}`

Quelle: https://www.java-programmieren.com/schleifen-java.php
