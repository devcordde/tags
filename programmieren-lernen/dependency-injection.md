---
tag: dependency-injection
alias: ["di"]
---

Dependency Injection by Example:
```java
public class MeineApp {
  // Hier übergibt man die Instanz der MeineApp Klasse
  private final DepA a = new DepA(this);
  // Die DepB Klasse greift auf die DepA Klasse zu
  private final DepB b = new DepB(a);
  // Info: man muss nicht die Variablen hier ↑ initialisieren, geht auch in der onEnable.
  public void start(String[] args) {
    b.doThat();
  }
}
```
```java
public class DepA {
  private final MeineApp app;
  // Hier kann man dann die Instanz der MeineApp Klasse verwenden.
  public DepA(MeineApp app) { this.app = app; }
  public void doThis() {}
}
```
```java
public class DepB {
  private final DepA a;
  // da die DepB Klasse nur die Funktionalität der DepA Klasse braucht,
  // übergibt man nur sie im Konstruktor
  public DepB(DepA a) { this.a = a; }
  public void doThat() { a.doThis(); }
}
```
Das Prinzip von Dependency Injection ist, dass im Konstruktor übergeben wird, was man braucht. Wenn man die Instanz der Hauptklasse braucht, übergibt man sie.  
Was ist mit cyclic dependencies? Da kann man zb. ne `init()` Methode machen.  
Für ein besseres Verständnis, kannst du dir [das Video von CodeAesthetic](https://www.youtube.com/watch?v=J1f5b4vcxCQ) anschauen.  

