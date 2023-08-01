---
tag: dependency-injection
alias: ["di"]
---

Dependency Injection by Example:
```java
public class MeineApp {
  private final DepA a = new DepA(this);
  private final Depb b = new DepB(a);
  public void start(String[] args) {
    // Do Stuff
  }
  // Getters here
}
```
```java
public class DepA {
  private final MeineApp app;
  public DepA(MeineApp app) { this.app = app; }
  public void doThis() {}
}
```
```java
public class DepB {
  private final DepA a;
  public DepB(DepA a) { this.a = a; }
  public void doThat() { a.doThis(); }
}
```
Info: es muss nicht unbedingt direkt beim deklarieren passieren. Prinzip ist es dass was man braucht im Konstruktor übergibt, wenn man die main braucht, übergibt man sie. Was ist mit cyclic dependencies? Da kann man zb. ne `init()` Methode machen.
