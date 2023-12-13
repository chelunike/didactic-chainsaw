# Criterios de decisión

1. Que sea rápido a la hora de de descargas las dependencias.
2. Cumpla con el estandard de paquetes de Java.


# Posibles Opciones

### Maven
Gestiona las dependencias a partir de repositorios, teniendo el propio central, pero pudiendo usar otros que deberían mantener la especificación. 

#### Ivy
Proviene del proyecto de `Apache Ant` y promete ser un gestor aguil y simple de usar, se basa en el repositorio de Maven a la hora de descargar paquetes.

### Gradle
Es toolkit completo que también gestiona las tareas. Usa maven para las dependencias.

### Nuts
Gestiona las dependencias en tiempo de ejecución y trabaja con los repositorios de Maven.

### Nota:
Había más opciones disponibles, pero han caído con el paso del tiempo :(
- JPM4J (Just another package manager) Que era otro gestor de dependencias ya no existe
- Java Painless



# Decisión Final: 

### Gradle
Puesto que es una de las herramientas más rápida y puesto que mi aplicación será mejor gestionar las dependencias a la hora de compilar y no en ejecución para evitar posibles fallos. Sino hubiera escogido Nuts.
