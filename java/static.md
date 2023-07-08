---
tag: static
alias: ["static-abuse"]
---

```java
Was bedeutet der Modifikator static?
Der Modifikator static kennzeichnet Programmstrukturen, die nicht an ein Objekt gebunden sind.
Bei unreflektiertem Gebrauch kann sein Gebrauch jedoch auch problematisch sein, wenn die Objektorientierung unterwandert wird. Die Verwendung des Schlüsselwortes sollte somit wohl überlegt sein und nur dort wahrgenommen werden, wo die Programmstruktur dies nahelegt.

static bei Variablen
Das Schlüsselwort kann Felder kennzeichnen, die dann als Klassenvariablen bezeichnet werden. Sie sind nicht den von der Klasse abgeleiteten Objekten zugeordnet, sondern gehören zur Klasse selbst und stehen in allen Instanzen gleichermaßen zur Verfügung. Außerhalb der deklarierenden Klasse werden sie mit dem vorangestellten und durch Punktoperator getrennten Klassennamen aufgerufen (z.B. Math.PI, Font.ITALIC). In Java werden Klassenvariablen häufig in Kombination mit dem Modifikator final für unveränderliche Werte an Stelle von Konstanten eingesetzt. Ihre Bezeichner werden dann durchgängig groß geschrieben.

public final class Math {
    //...
    public static final double PI = 3.14159265358979323846;
    //...
}

public class Font implements java.io.Serializable {
    //...
    public static final int ITALIC = 2;
    //...
}
Im Gegensatz zu nicht-statischen Feldern kann auf sie auch aus anderen statischen Umgebungen heraus (z.B. main()) direkt zugegriffen werden.

public class StaticBsp {
    static String testStr = "static Test";
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(testStr);
    }
}
```
https://javabeginners.de/Grundlagen/Modifikatoren/static.php
