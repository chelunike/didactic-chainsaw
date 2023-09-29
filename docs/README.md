# Documentación


### Historias de Usuario

1. [HU001] Necesito ayuda en el CTF

Label: user-stories
Milestone: 0

Cliente: yo :)
Problema: procesar la info de los cves

En medio de un CTF, cuando se intenta de forma ágil resolver un problema planteado, solo que de este problema solo hay ciertas pistas y tienes que buscar una flag. En el momento en el que se requiere de saber que posibles vulnerabilidades se puedan usar a nuestro favor. Es necesario un sistema que nos indique a partir de la información conocida del sistema que vulnerabilidad puede existir y como explotarla. Es un gran problema el tener que procesar de forma manual tanta información a la vez.

### Milestone

2. [MI001] Modelo del Problema

A partir de los datos de entrada que nos aportan del sistema. Llegar a obtener información en claro de los CVEs pertinentes, lo cual requiere extraer la información, procesarla y mostrarla de forma clara al usuario.
La respuesta deberá contener tanto el codigo que identifica el CVE, nombre/titulo que casi siempre resume por completo el modo en que se aprovecha la vulnerabilidad y un enlace a la descripción y al propio exploit. 

:cat2: 

2. [MI002] Logica de Negocio

La idea principal abstrayendose del funcionamiento del programa es que recibe la entrada de datos que referencia a un SO y genera una respuesta una serie de información respecto a los CVEs pertienentes.
El programa en si mismo buscara los CVES de forma externa, procesara la información y luego presentara los resultados al usuario.

:cat2: :cat2: 


