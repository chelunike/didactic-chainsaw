# Contexto

Dado que hemos elegido `java` como lenguaje de programación, tenemos que elegir que versión y especificación vamos a usar. `Java` necesita de un compilador, maquina virtual y librerías de ejecución ('Java Runtime Library') para funcionar, todo ello se especifica en `Java Platform Standard Edition` ('Java SE').

Hay que tener en cuenta que cuando hablamos de `JDK`, nos referimos tanto al compilador como al entorno de ejecución (`Java Runtime Environment`)

Nos encontramos con que disponemos de `OpenJDK` la cual es la implementación en código libre de todo ello. Luego existen muchas distintas distribuciones de cada distribuidor que tienen diferentes características entre ellos mismos (Licencias, Soporte y Actualizaciones).

# Criterios de decisión

1. Una versión que tenga soporte en los próximos años, por lo cual la aplicación tenga una durabilidad de varios años (3 o 4).
Java saca versiones cada 6 meses, en marzo y septiembre. Luego cada 2 años saca una versión "grande" LTS (Long Term Support) con un soporte que dura 3 años. Actualmente disponemos de las versiones con soporte: 17 y 21. Probablemente la 17 deje de tener soporte oficial dentro de poco.
2. Legalmente viable. Es importante que la licencia nos permita usarla para nuestra aplicación y luego sea viable respecto a nuestra licencia.
3. Que sea un runtime optimizado a la hora de ejecutar el código.


# Posibles Opciones

### OpenJDK builds by Oracle [jdk.java.net](https://jdk.java.net/21/)

Original de la casa de Oracle, es una versión que funciona de igual manera para todos, sin ninguna optimización respecto a la plataforma. En este caso solo se reciben actualizaciones cada 6 meses y las versiones se suelen quedar igual salvo por los parches de seguridad. La licencia es GPL-2.0 lo cual no supone ningún impedimento legal.

### Oracle [Java SE Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/)

Igual que el anterior proviene de Oracle, solo que es la versión comercial y por lo tanto se encuentra más actualizado que el anterior. Sin embargo, su licencia es mucho más cerrada y estricta, lo que requiere el pago de licencia en las versiones más nuevas para un uso comercial.

### [BellSoft Liberica JDK](https://bell-sw.com/pages/downloads/#jdk-21-lts)

La compañia BellSoft que se dedica de manera profesional a Java, tiene disponible en código libre (de forma que no hay problema con la Licencia puesto que es una GPL-2.0), con soporte habitual. Y esta mejor optimizado que Openjdk.

### [Amazon Corretto](https://aws.amazon.com/corretto)

Esta versión obra de Amazon está optimizada en rendimiento para funcionar mejor en los servidores de AWS, de forma que permite una mejor gestión de recursos si se despliega en esta plataforma. Y dispone de versiones actualizadas, aunque solo se centra en el soporte de la más nueva. Dispone de una licencia GPL-2.0.

### [IBM Semeru Runtime](https://www.ibm.com/support/pages/semeru-runtimes-getting-started/)

No entiendo de IBM, pero esta versión trae su propia maquina virtual `J9` sin duda optimizada para servidores de IBM, obviamente. Y tiene un perfil bajo de memoria, respecto al resto de maquinas. Solo sirve si se usa `OpenJ9 Virutal Machine`. Dispone de una versión certificada bajo la propia licencia de IBM y otra versión libre.


# Decisión Final: 

### BellSoft Liberica JDK
La elección de usar este runtime se basa principalmente en:
- Oracle es gracioso, pero no me gusta que se guarden lo mejor con licencias comerciales suyas, sobretodo cuando lo mejor, no es tan bueno.
- Amazon me cae mal. Y no se ve de cara al futuro de que la aplicación se despliegue en un servidor de amazon.
- IBM me da miedo. Y requiere de todo un entorno en especifico que complica las cosas.
- BellSoft su traducción literal seria `Campana programa`, me gustan las campanas. Además de que es el runtime en el que se compiló `Spring` el cual es una de las librerías más probables que vayamos a usar.
- Por otro lado es software libre que puedo usar sin problemas y esta mejor optimizado que el resto para el entorno que voy a usar.


