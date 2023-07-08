
---
tag: OOP
alias []
---

```java
public class Mensch {
    String name;
    String wohnort;
    int alter;

    public void setName(String name) {
        this.name = name;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}

// Irgendwo anders

Mensch menschA = new Mensch();
menschA.setName("Harald");
menschA.setWohnort("Stuttgart");
menschA.setAge(52);

Mensch menschB = new Mensch();
menschB.setName("Günther");
menschB.setWohnort("Frankfurt");
menschB.setAge(77);```So hast du jetzt 2 Menschen mit dem gleichen Bauplan erstellt, die jedoch nicht gleich sind.
Normalerweise würde man die Werte auf Englisch benennen und die Werte in einem Konstruktor übergeben, aber ich habs jetzt einfach Mal einfachheitshalber so gemacht. Hoffe das hilft :D
