# Contexto

Dado que hemos elegido `java` como lenguaje de programación, tenemos que elegir que versión y especificación vamos a usar. `Java` necesita de un compilador, maquina virtual y librerías de ejecución ('Java Runtime Library') para funcionar, todo ello se especifica en `Java Platform Standard Edition` ('Java SE').

Hay que tener en cuenta que cuando hablamos de `JDK`, nos referimos tanto al compilador como al entorno de ejecución (`Java Runtime Environment`)

Nos encontramos con que disponemos de `OpenJDK` la cual es la implementación en código libre de todo ello. Luego existen muchas distintas distribuciones de cada distribuidor que tienen diferentes características entre ellos mismos (Licencias, Soporte y Actualizaciones).

# Criterios de decisión

1. Una versión que tenga soporte en los próximos años, por lo cual la aplicación tenga una durabilidad de varios años (3 o 4).
Java saca versiones cada 6 meses, en marzo y septiembre. Luego cada 2 años saca una versión "grande" LTS (Long Term Support) con un soporte que dura 3 años. Actualmente disponemos de las versiones con soporte: 17 y 21. Probablemente la 17 deje de tener soporte oficial dentro de poco.
2. Legalmente viable. Es importante que la licencia nos permita usarla para nuestra aplicación y luego sea viable respecto a nuestra licencia.


# Posibles Opciones

### OpenJDK builds by Oracle (jdk.java.net)

Original de la casa de Oracle, es una versión que funciona de igual manera para todos, sin ninguna optimización respecto a la plataforma. En este caso solo se reciben actualizaciones cada 6 meses y las versiones se suelen quedar igual salvo por los parches de seguridad.

### Oracle Java SE Development Kit (JDK)

Igual que el anterior proviene de Oracle, solo que es la versión comercial y por lo tanto se encuentra más actualizado que el anterior. Sin embargo, su licencia es mucho más cerrada y estricta, lo que requiere el pago de licencia en las versiones más nuevas para un uso comercial.

### BellSoft Liberica JDK

La compañia BellSoft que se dedica de manera profesional a Java, tiene disponible en código libre, con soporte habitual. Y esta mejor optimizado que Openjdk

### Amazon Corretto

Esta versión obra de Amazon está optimizada en rendimiento para funcionar mejor en los servidores de AWS, de forma que permite una mejor gestión de recursos si se despliega en esta plataforma.

### IBM Semeru Runtime

No entiendo de IBM, pero esta versión trae su propia maquina virtual `J9` sin duda optimizada para servidores de IBM, obviamente. Y tiene un perfil bajo de memoria, respecto al resto de maquinas. Solo sirve si se usa `OpenJ9 Virutal Machine`.


# Decisión Final: 

### BellSoft Liberica JDK
La elección de usar este runtime se basa principalmente en:
- Oracle es gracioso, pero no me gusta que se guarden lo mejor con licencias comerciales suyas, sobretodo cuando lo mejor, no es tan bueno.
- Amazon me cae mal.
- IBM me da miedo.
- BellSoft su traducción literal seria `Campana programa`, me gustan las campanas.
- Por otro lado es software libre que puedo usar sin problemas y esta mejor optimizado que el resto para el entorno que voy a usar.


