---
tag: phpmyadmin
alias: ["myadmin", "phpadmin"]
---

Hey c:  
Wie es scheint benutzt du phpmyadmin.  
Diese Anwendung exposed deine Datenbank auf einer öffentlich erreichbaren Website. Wenn das noch nicht falsch genug für dich klingt ist hier [eine Liste von Exploits](<https://www.cvedetails.com/vulnerability-list/vendor_id-784/Phpmyadmin.html>) und [eine Liste bekannter und nicht gefixter Exploits](<https://snyk.io/vuln/composer:phpmyadmin%2Fphpmyadmin>)

Zum Glück gibt es einige Alternativen die sogar erheblich besser sind als phpmyadmin.
- **Windows**: [**HeidiSQL**](<https://www.heidisql.com/>)
- **Windows/Unix**: [**DBeaver**](<https://dbeaver.io/download/>) oder [**DataGrip**](<https://www.jetbrains.com/datagrip/>) (Kostenlos mit [**Github Education**](<https://education.github.com/>))

Das sind alles Desktop Tools. Du solltest deine Datenbank jedoch nicht nach außen erreichbar machen sondern einen ssh Tunnel benutzen. _(Siehe Tag `ssh-tunnel`)_
