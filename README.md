# Spring Framework - Exemples sur IoC

Le répertoire `libs` contient l'ensemble de fichiers `jar` nécessaire pour instancier le conteneur IoC correspondant.
## Exemple 01
- Instanciation d'un objet simple (`bean`).   
- `metadata` disponibles dans le fichier XML `application_context_01.xml`.

## Exemple 02
- Instanciation de deux objets (`bean`) avec _"composition"_ (`ref`).
- `metadata` disponibles dans le fichier XML `application_context_02.xml`.

## Exemple 03
- Instanciation d'un objet (`bean`) par le constructeur.
- `metadata` disponibles dans le fichier XML `application_context_03.xml`.

## Exemple 04
- Instanciation d'un objet (`bean`) par le constructeur :
    - `scope=prototype` : les instances créées sont complètement indépendantes
    - `scope=singleton` : bien qu'appelé plusieurs fois une seule instance est finalement créée par le conteneur.
- `metadata` disponibles dans le fichier XML `application_context_04.xml`.

## Exemple 05
- Instanciation des objets annotés (`@Component`) avec composition (`@Autowired`)
- `metadata` disponibles dans le fichier XML `application_context_05.xml`.
- Cette solution utilise, en plus des librairies des exemples précédents, la librairie `spring-aop-x.y.z.jar`.