# Documentación


## Historias de Usuario

### [HU001] Necesito ayuda en el CTF

Label: user-stories
Milestone: 0

A la hora de particpiar en una competición de Captura la Bandera (CTF), se va a encontar con un reto donde se encuentre con la necesidad de explotar la vulnerabilidad concreta en un sistema informático, concretamente de software. Ahora bien, partiendo de cierta información del software, tras procesar la información, se necesita procesar la información de los CVEs, para encontrar la vulnerabilidad adecuada a la situáción.


### [HU002] Estoy preparando un CTF

Label: user-stories
Milestone: 0

Me gustan tanto los CTFs, que a veces creo los mios propios, asi que me gustaría poder plantear unos retos, en los que se puedan explotar varios fallos de seguridad sobre un mismo software. El problema está en conocer los posibles CVEs que pueda concatenar, para crear una serie de vulnearibilidades que le den paso al jugador.


## User-Journey

Cliente: yo :)

Soy un estudiante de Ingeniería Informática al cual le gusta participar en competiciones de Captura la Bandera (CTF), este tipo de competiciones trata de cxonseguir encontrar una bandera (un pequeño texto con cierto formato, no relevante para) que se encuentra oculto, cifrado o simplemente en un sistema al cual no tenemos permisos. Lo que se requiere en una competición es rapidez a la hora de hallar la solución, por lo cual es necesario que se procese la información en un tiempo muy reducido.

Pese a que existen muchas base de datos, es necesario procesar toda la información para resolver el reto de forma rápida y precisa.

### TL;DR

En medio de un CTF, cuando se intenta de forma ágil resolver un problema planteado, solo que de este problema solo hay ciertas pistas y tienes que buscar una "flag". En el momento en el que se requiere de saber que posibles vulnerabilidades se puedan usar a nuestro favor. Es necesario un sistema que nos indique a partir de la información conocida del sistema que vulnerabilidad puede existir y como explotarla. Es un gran problema el tener que procesar de forma manual tanta información a la vez.

Descripción de los elementos del problema:
- **Flag**: Consiste en una pequeña cadena de texto con cierto formato establecido, por ejemplo: ```flag{...}```.
- **Retos CTF**: Consisten en buscar una flag y pueden ser de distintos tipos o ámbitos como criptografía, ingeniería inversa, web y pwn, estos últimos son para los que necesitamos la aplicación pues son en los que hay que acceder a algún sistema aprovechando alguna vulnerabilidad en el código. Y por lo general te suelen  dejar alguna pista de cual es el sistema con una dirección ip y un puerto al cual tienes que acceder.
- **CVE**(Common Vulnerabilities and Exposures): Es la forma en la que hoy en día se exponen los fallos de seguridad que van descubriéndose a lo lequipoargo del tiempo con la intención de conocerlos para poder solucionarlos. Se trata de un estandar a nivel mundial para la difusión pública de los fallos de seguridad comunes que afectan a un gran número de personas.
Suelen disponer de un código de referencia como por ejemplo ```CVE-2021-4034``` donde el dígito de en medio te indica el año de salida. Además de incluir información acerca del autor, una breve descripción y algunos enlaces de referencia, normalmente a github.com con código para demostraciones y como solucionarlo. El código se establece de forma única a cada vulnerabilidad y existen una serie de organizaciónes certificadas que se encargan de ello.

Datos relevantes del CVE:
- Código de referencia: para identificarlo de forma global
- Descripción de la vulnerabilidad
- Enlaces: Puede tener una serie de enlaces de documentación que nos servirán para llegar hasta una implementación del software que explota o demuestra dicha vulnerabilidad.

## Milestones

### [MI0] Modelo del Problema
:cat2: 

A partir del problema planteado en la historia de usuario #2 con este hito se intentará pasar el modelo del problema a código. Identificando cada elemento necesario y definir la estructura de los datos que vamos a necesitar para solucionar el problema planteado.
Viable si la estructura de datos representa todos los datos necesarios. Y se han seguido las buenas prácticas.


### [MI1] Extracción de la información de los CVEs
:cat2: :cat2:

Sistema con la capacidad de recopilar toda la información que se nos pide en la historia de usuario #2 y que sea información viable para procesarla y guadarla. Sería viable cuando podamos demostrarlo a traves de tests.


### [MI2] Búsqueda de los CVEs
:cat2: :cat2: :cat2:

Una interfaz para interacturar con el usuario y poder mostrar el resultado que se pide en la historia de usuario #2.


