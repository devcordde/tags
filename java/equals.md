
---
tag: equals
alias []
---

!j {
String one = new String("xyz");
String two = new String("xyz");
System.out.println(one == two); // false
System.out.println(one.equals(two)); // true
System.out.println("Objekte vergleicht man mit `.equals()` statt mit `==`!");
}
