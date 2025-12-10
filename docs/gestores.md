# Elección de Gestores


## Gestor de Dependencias

Tras revisar todos las posibles opciones de gestión de dependencias con Perl, en este lenguaje hay muchas formas de hacer las cosas. Y eso crea un montón de formas de gestionar las dependencias, en este caso tenemos que diferenciar entre empaquetadores, la propia herramienta que instala las dependencias y el formato con el que se empaquetan dichas dependencias.

Nuestras prioridades de cara a la gestión de dependencias son las siguientes:
- Resulte fácil de instalar y usar para el programador; es decir, que en pocos pasos pueda disponer de las dependencias.
- Aislamiento de los paquetes para evitar futuros errores 

### Opciones encontradas
A continuación, revisamos varias opciones viables. Todas ellas son proyectos estables y con soporte actualmente, que pese a no ser una prioridad, ha llevado a descartar otras posibles opciones.

Hay que tener en cuenta dos conceptos en Perl de cara a la gestión de las dependencias, en primer lugar vamos a ver dos herramientas cuyo objetivo es instalar las librerías necesarias:

#### CPAN
- Facilidad de instalación y uso puesto que viene con Perl. No requiere de pasos extra para su instalación.
- Instala las dependencias de manera global, sin aislarlas respecto al proyecto.

#### CPANMINUS
Como CPAN, sirve solo para instalar dependencias
- Fácil de usar, puesto que requiere de menos opciones el comando, que CPAN.
- Requiere de instalación manual, pero se puede hacer fácilmente a través de CPAN 

Y en segundo lugar, vamos a ver que herramienta podemos usar para poder aislar la instalación de los paquetes a nuestro proyecto. Estás se sirven de las anteriores, por lo que la elección es entre las siguientes:

#### Carton
Se trata de un empaquetador (Bundler) y empaqueta todo a través de un fichero con formato `cpanfile` (No se refiere a una caja de cartón :)
- Práctico y fácil de usar
- Aísla los paquetes para el proyecto
- Se organiza todas las versiones y paquetes desde un mismo fichero:
- Instalación fácil a través de CPAN y por debajo está usando cpan.

#### Makefile.pl
Es un script que sirve para gestionar los paquetes y sus versiones. Su funcionamiento se basa en generar un fichero Makefile y con el gestionar las dependencias, usando por debajo `ExtUtils::MakeMaker`, y luego usa cpan para instalar las dependencias.
- Gestiona y aísla los paquetes para el proyecto.
- Es fácil de usar desde el punto de vista de comandos. Aunque su funcionamiento y flujo de trabajo puede resultar un poco más complicado.

### Conclusión

Usamos -> **Carton** = cpanfile y Cpan
Por facilidad de uso y comprensión. Y con ello podremos aislar las dependencias y facilitar el trabajo al programador.

## Gestor de tareas

Respecto al gestor de tareas, tenemos unas prioridades parecidas.
- Resulte fácil de instalar y usar para el programador; es decir, que en pocos pasos pueda lanzar las tareas.
- Herramienta que se encuentre en desarrollo activo y no este obsoleta.

### Opciones Encontradas
A continuación, revisamos posibles opciones viables.

#### Make
- Sencillo y fácil de instalar
- Disponemos de Makefile.pl para perl y nos facilitaría el desarrollo
- Herramienta muy estable

#### Just
- Fácil de usar y de instalar
- Nos permite gestionar las tareas para el desarrollo de cualquier tipo de proyecto.
- La herramienta es estable y actualmente se encuentra en desarrollo activo.

#### Task
- Tendríamos que instalar JS, para usarla, lo cual nos dificulta inicialmente en la instalación.
- Y es un proyecto activo y estable.

### Conclusión

Usamos -> Make
Por estabilidad y dada que es una herramienta fácil de usar y requiere de muy pocos pasos para instalar y lanzar las tareas.


