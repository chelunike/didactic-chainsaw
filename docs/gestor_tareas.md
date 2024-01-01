
# Criterios de decisión

1. Una optima y fácil automatización a la hora del compilado y uso de dependencias
2. Buen rendimiento a la hora de ejecutar tests.


# Posibles Opciones

### Maven
Además de gestionar las dependencias este toolkit también puede gestionar tareas de compilado y pruebas.

### Gradle
Es toolkit completo que es rápido a la hora de realizar las tareas. Además de que facilita la depuración bastante al tener unos logs bastante detallados.

### Ant
Podría decirse que gestiona bien la compilación y es muy fácil de usar. Pero no muy apto para grandes aplicaciones.


# Decisión Final: 
### Gradle
Razones por la cual he tomado esta decisión:
- Maven me da dolores de cabeza y me trae ciertos malos recuerdos
- Ant no viene bien para este tipo de proyecto.
- Así podemos tener un toolkit completo que nos permite gestionar todo y siempre accesible (El gradelw no te lo quita nadie).