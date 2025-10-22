# Apéndice

Descripción de los elementos del problema:
- **Flag**: Consiste en una pequeña cadena de texto con cierto formato establecido, por ejemplo: ```flag{...}```.
- **Retos CTF**: Consisten en buscar una flag y pueden ser de distintos tipos o ámbitos como criptografía, ingeniería inversa, web y pwn, estos últimos son para los que necesitamos la aplicación pues son en los que hay que acceder a algún sistema aprovechando alguna vulnerabilidad en el código. Y por lo general te suelen  dejar alguna pista de cual es el sistema con una dirección ip y un puerto al cual tienes que acceder.
- **CVE**(Common Vulnerabilities and Exposures): Es la forma en la que hoy en día se exponen los fallos de seguridad que van descubriéndose a lo largo del tiempo con la intención de conocerlos para poder solucionarlos. Se trata de un estándar a nivel mundial para la difusión pública de los fallos de seguridad comunes que afectan a un gran número de personas.
Suelen disponer de un código de referencia como por ejemplo ```CVE-2021-4034``` donde el dígito de en medio te indica el año de salida. Además de incluir información acerca del autor, una breve descripción y algunos enlaces de referencia, normalmente a github.com con código para demostraciones y como solucionarlo. El código se establece de forma única a cada vulnerabilidad y existen una serie de organizaciones certificadas que se encargan de ello.

Unos CVE, **son complementarios o compatibles**, cuando se pueden aplicar al mismo reto; es decir, cuando se pueden aplicar al mismo sistema o versión de software en especifico.

Datos relevantes del CVE:
- Código de referencia: para identificarlo de forma global
- Descripción de la vulnerabilidad
- Enlaces: Puede tener una serie de enlaces de documentación que nos servirán para llegar hasta una implementación del software que explota o demuestra dicha vulnerabilidad.

