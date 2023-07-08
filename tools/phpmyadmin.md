---
tag: phpmyadmin
alias: ["myadmin", "phpadmin"]
---

Hey c:
Wie es scheint benutzt du phpmyadmin.
Diese Anwendung exposed deine Datenbank auf einer öffentlich erreichbaren Website. Wenn das noch nicht falsch genug für dich klingt ist hier eine Liste von Exploits:
<https://www.cvedetails.com/vulnerability-list/vendor_id-784/Phpmyadmin.html>
Und eine Liste bekannter und nicht gefixter Exploits
<https://snyk.io/vuln/composer:phpmyadmin%2Fphpmyadmin>

Zum Glück gibt es einige Alternativen die sogar erheblich besser sind als phpmyadmin.
Windows:
<https://www.heidisql.com/>
Windows/Unix
<https://dbeaver.io/download/>
Wenn du Github Education hast kannst du auch Jetbrains DataGrip nehmen
<https://www.jetbrains.com/datagrip/>

Das sind alles Desktop Tools. Du solltest deine Datenbank jedoch nicht nach außen erreichbar machen sondern einen ssh Tunnel benutzen.
