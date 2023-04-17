# Requis

* Docker
* Java 17

# Installation

* Exécuter le docker-compose.yml
* Vérifier que le container de SqlPad et du sql server est bien parti
* Se rendre a l'adresse suivante http://localhost:3000/signin
  * Username: admin@sqlpad.com
  * Password: admin


* Clicker sur ...choose connection en haut a gauche et ensuite new connection
* Connexion au Sql server:
  * Connection name: celui que vous voulez
  * Driver: SQL Server
  * Host/Server/IP Address: localsqlserver
  * Username: sa
  * Password: SuperP4ssw0rd!
* Vous devriez voir une bd nommé dbo

* Mettez-vous a la racine du projet et exécuter la commande ./gradlew clean build qui devrait télécharger les dépendances 
et rouler les tests unitaires
* Exécuter la commande ./gradlew bootRun pour demarrer l'application Spring boot
* Le serveur devrait avoir démarré et les migrations ont du se faire, de plus le csv de pokemon doit être dans la bd
* Vous pouvez tester en fesant une requête SQL du style SELECT * from pokemon
* Le serveur devrait être fonctionnel

# Utilisation

* Pour utiliser l'api, je vous fournis une collection postman
* Swagger est aussi installé, rendez-vous a l'url suivant http://localhost:8080/swagger-ui/index.html

# Test unitaire

* Pour rouler les tests, vous pouvez faire la commande ./gradlew test et il y aura un rapport de disponible
dans build/reports/tests/test/index.html
