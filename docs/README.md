# Documentación


### Historias de Usuario

1. [HU001] Necesito ayuda en el CTF

Label: user-stories
Milestone: 0

Cliente: yo :)
Soy un estudiante de Ingenieria Informatica al cual le gusta participar en competiciones de Captura la Bandera (CTF), este tipo de competiciones trata de conserguir encontrar una bandera (un pequeño texto con cierto formato) que se encuentra oculto, encriptado o simplemente en un sistema al cual no tenemos permisos.

Problema: procesar la info de los cves

En medio de un CTF, cuando se intenta de forma ágil resolver un problema planteado, solo que de este problema solo hay ciertas pistas y tienes que buscar una flag. En el momento en el que se requiere de saber que posibles vulnerabilidades se puedan usar a nuestro favor. Es necesario un sistema que nos indique a partir de la información conocida del sistema que vulnerabilidad puede existir y como explotarla. Es un gran problema el tener que procesar de forma manual tanta información a la vez.

Descripción de los elementos del problema:
- **Retos CTF**: Consisten en buscar un texto con un formato, como por ejemplo ```flag{...}``` y pueden ser de distintos tipos o ámbitos como criptografia, ingenieria inversa, web y pwn, estos ultimos son para los que necesitamos la aplicación pues son en los que hay que acceder a algun sitema aprovechando alguna vulnerabilidad en el codigo. Y por lo general te suelen  dejar alguna pista de cual es el sistema con una dirección ip y un puerto al cual tienes que acceder.

- **CVE**(Common Vulnerabilities and Exposures): Es la forma en la que hoy en dia se exponen los fallos de seguridad que van descubriendose a lo largo del tiempo con la intención de conocerlos para poder solucionarlos.
Suelen disponer de un codigo de referencia como por ejemplo ```CVE-2021-4034``` donde el digito de en medio te indica el año de salida. Además de incluir información acerca del autor, una breve descrpción y algunos enlaces de referencia, normalmente a github.com con código para demostraciones y como solcionarlo.
 

### Milestone

2. [MI0] Modelo del Problema

A partir del problema planteado en las historias de usuario con este hito se intentará pasar el modelo del problema a código. Identificando cada elemento necesario para solventar el problema.
PMV: Estructura de datos para almacenar los CVES de forma que sea accesible de forma rápida y luego se puedan realizar búsquedas de manera eficiente.
Viable si el product manager acepta la estructura al cumplir los requisitos.

:cat2: 

2. [MI1] Recepción de CVEs

El principal objetivo en esta etapa es poder conseguir todos los CVEs posibles, de multiples ubicaciones, de manera actualizada para procesar la información y mantenerla almacenada de forma estandar
PMV: API o Web Scrapper que sea capaz de recabar todos los datos de los CVEs actuales y antiguos.
Viable si aprueba todos los tests.

:cat2: :cat2: 

2. [MI2] Búsqueda de los CVEs

El objetivo es conseguir un sistema de búsqueda de forma que se presente al usuario unos resultados ordenados en función de la probabilidad que tiene el cve de funcionar a partir de las características aportadas.
PMV: Sistema de busqueda con interfaz que sea capaz de obtener la información requerida.
Viable si aprueba todos los tests.

:cat2: :cat2: :cat2: