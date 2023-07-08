---
tag: srp
alias: ["singleresponsibilityprinciple", "single-responsibility-principle", "zu-viel"]
---

**Das Single Responsibility Principle (SRP)**

***Warum brauche ich das überhaupt?***
Das Single Responsibility Principle kann dir dabei helfen, deinen Code besser zu strukturieren und dadurch Zeit beim (Weiter-)Entwickeln zu sparen. Außerdem kann es anderen Leuten dabei helfen, deinen Code besser zu verstehen und dir ggf. helfen zu können.

***Das klingt gut, wie benutze ich das SRP?***
Das Single Responsibility Principle lässt sich in einem einfachen Satz zusammenfassen:

> Es sollte nur einen Grund geben, um eine Klasse bzw. Methode zu verändern.

Aber was genau heißt das eigentlich?
Grundsätzlich solltest du darauf achten, dass deine Methoden und Klassen nicht zu viele verschiedene Dinge auf einmal machen. Code, der beispielsweise einen Command empfängt und verarbeitet, sollte nicht gleichzeitig ein Event-Listener sein und eine Verbindung zur Datenbank aufbauen.

***Und wie soll ich dann mein Projekt aufbauen?***
Dein Projekt sollte grundsätzlich, um dem SRP zu entsprechen, aus vielen, kurzen Klassen bestehen. Versuche also, große Klassen wie Manager oder Handler aufzuteilen und Code sinnvoll auszulagern.

***Aber hat das nicht auch Nachteile?***
Selbstverständlich können sehr viele kleine Klassen mit wenigen Zeilen Code das Projekt ebenfalls so sehr aufteilen, sodass am Ende der Aufbau bzw. Sinn nicht mehr ersichtlich ist. Deshalb ist es wichtig, Klassen und Methoden passende Namen zu geben und eine gute Balance zwischen Struktur und Umsetzung des Single Responsibility Principles zu finden.

***Gibt es mehr solche Tipps?***
Für weitere Hinweise zum Schreiben sauberen Codes gibt es in dem Buch "Clean Code" von Robert C. Martin. Wer sich das nicht kaufen will, kann sich auch die SOLID-Prinzipien anschauen; das SRP ist das erste von ihnen.
