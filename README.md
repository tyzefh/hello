Ceci est un petit exemple de programme à commenter pour présenter le développement à un stagiaire de 3ème. 

Pour plus d'interactions, on pourra faire les quelques exercice suivants.

# Exercice 1
Explorer le code avec un développeur, décrire un peu l'application, on parlera principalement d'API et de service :) 
Lancer l'application et tester dans un navigateur

        SET JAVA_HOME=%USERPROFILE%/hello-master/jdk1.8.0_191
        mvnw.cmd spring-boot:run
        
Dans un navigateur web ouvrir la page http://localhost/hello 

# Exercice 2
Compléter le test hello_name avec les bonnes assertions

# Exercice 3
Modfier la méthode hello de la classe HelloService pour prendre en compte le paramètre name et renvoyer "Salut " + le contenu du paramètre name

Exemple :

        if(name == null || name.isEmpty()) {
            return "Hello from Spring";
        } 
        return "Hello " + name; 

# Exercice 4 
Vérifier le résultat dans un navigateur
