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
  private DepC c;
  public void start(String[] args) {
    b.doThat();
    // Info: Je nach umgebung, ist es manchmal nicht möglich bei Deklarationen zu übergeben,
    // sondern erst z.b. bei einer onEnable Methode.
    c = new DepC(b);
  }
}
```
```java
public class DepA {
  private final MeineApp app;
  // Hier kann man dann die Instanz der MeineApp Klasse verwenden, um in dem Fall um auf b zuzugreifen.
  public DepA(MeineApp app) { this.app = app; }
  // Man muss sich aber bemühen nur die Sachen zu übergeben, die auch verwendet werden.
  // Hier also eher eine DepB Instanz, aber da diese nach DepA initialisiert wird, kann man die nicht direkt übergeben.
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
Dependency Injection (DI) ist ein Prinzip, bei dem im Konstruktor einer Klasse die benötigten Abhängigkeiten übergeben werden. Wenn beispielsweise eine Instanz der Hauptklasse gebraucht wird, werden die erforderlichen Abhängigkeiten an den Konstruktor übergeben und in, wenn nötig, einer Variable gespeichert.
Für ein besseres Verständnis, kannst du dir [das Video von CodeAesthetic](<https://www.youtube.com/watch?v=J1f5b4vcxCQ>) anschauen.
Auf der nächsten Seite sind ein paar Informtionen zu cyclic dependencies.
<new_page>
Bei zyklischen Abhängigkeiten, bei denen beispielsweise `DepA` `DepB` benötigt und umgekehrt, kann die Lösung darin bestehen, die Abhängigkeiten später zu setzen oder einen übergeordneten Container wie `MeineApp` zu übergeben.
Eine alternative Methode wäre den von beiden Klassen verwendeten Code in eine dritte Klasse zu extrahieren. Durch das Extrahieren des gemeinsam genutzten Codes in eine separate Klasse, . Diese dritte Klasse kann dann ohne zyklische Abhängigkeiten instanziiert werden und an die Klassen DepA und DepB übergeben werden.
