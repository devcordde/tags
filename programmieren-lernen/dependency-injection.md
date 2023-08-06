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
  public final DepB b = new DepB(a);
  // Info: Es muss nicht unbedingt bei der Deklaration passieren,
  // im spigot Kontext, ist es auch in der onEnable möglich,
  // es geht darum beim Konstruktor aufruf zu übergeben.
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
  // Um in dem Fall um auf b Zugreifen, man muss sich aber bemühen nur die Sachen zu übergeben,
  // die auch verwendet werden, hier also eher eine DepB Instanz,
  // aber da diese nach DepA initialisiert wird, kann man die nicht direkt übergeben.
  public void doThis() { app.b.doSomething(); }
}
```
```java
public class DepB {
  private final DepA a;
  // Die DepB Klasse benötigt Zugriff auf die DepA Instanz.
  // Daher übrgibt man diese im Konstruktor
  public DepB(DepA a) { this.a = a; }
  public void doThat() { a.doThis(); }
  public void doSomething() { }
}
```
Das Prinzip von Dependency Injection ist, dass im Konstruktor übergeben wird, was man braucht. Wenn man die Instanz der Hauptklasse braucht, übergibt man sie.  
Was ist mit cyclic dependencies? Da kann man zb. ne `init()` Methode machen.  
Für ein besseres Verständnis, kannst du dir [das Video von CodeAesthetic](<https://www.youtube.com/watch?v=J1f5b4vcxCQ>) anschauen.
