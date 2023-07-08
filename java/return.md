---
tag: return
alias: []
---

Code:

```java
package com.example.return;

public class Example {

    public static void main(String[] args) {
        System.out.println(getName("DevCord- "));
    }

    private static String getName(String prefix) {
        System.out.println("Die getName Methode wurde ausgeführt.");
        return prefix + "Veganfighter";
    }

}

```

Output:
```css
  Die getName Methode wurde ausgeführt.
  DevCord- Veganfighter
```
Dieser **String** *(hier rot markiert)* kann mit jedem beliebigen Objekt ausgetauscht werden, aber der vor dem Methodennamen gegebene Datentyp muss immer mit dem nach dem return übereinstimmen *(hier grün markiert)*.

`Prefix` ist in diesem Fall ein **Parameter** der in Zeile 6 bestimmt wird, hier durch `Devcord- `
Diese Funktion sollte schon von normalen Methoden bekannt sein, das ist natürlich wie bei void-Methoden **nur optional**.

**return**-Methoden sind Methoden die einen Wert zurückgeben und zusätzlich Code ausführen **können**.
**void**-Methoden sind Methoden die einen Code ausführen und keinen anderen Zweck erfüllen.

*Anhang:* https://media.discordapp.net/attachments/486910521329844227/792162684303835166/unknown.png
