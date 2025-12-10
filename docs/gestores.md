# Elección de Gestores


## Gestor de Dependencias

Tras revisar todos las posibles opciones de gestión de dependencias con Perl, en este lenguaje hay muchas formas de hacer las cosas. Y eso crea un montón de formas de gestionar las dependencias, en este caso tenemos que diferenciar entre empaquetadores, la propia herramienta que instala las dependencias y el formato con el que se empaquetan dichas dependencias.

Nuestras prioridades de cara a la gestión de dependencias son las siguientes:
- Que funcione para nuestro lenguaje Perl
- Facilidad y practica respecto al uso e instalación para su despliegue.
- Nos asegure una estabilidad en los paquetes y soporte
- Aislamiento de los paquetes para evitar futuros errores 

### Opciones encontradas
A continuación, revisamos varias opciones viables. Todas ellas son proyectos estables y con soporte actualmente.

#### CPAN
- Facilidad de instalación y uso puesto que viene con Perl
- Instala las dependencias de manera global, sin aislarlas respecto al proyecto 
- No gestiona lista de dependencias ni versiones, es una herramienta para instalar las dependencias

#### CPANMINUS
Como CPAN, sirve solo para instalar dependencias
- Fácil de usar
- Requiere de instalación manual
- Realiza lo mismo que cpan, pero intentando que no requiera de configuración por parte del usuario.

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

Usamos -> Carton + cpanfile + Cpan
Por facilidad de uso y comprensión. Y con ello podremos aislar las dependencias y facilitar el trabajo al programador.

## Gestor de tareas

Respecto al gestor de tareas, tenemos unas prioridades parecidas.
- Facilidad de uso e instalación
- Nos permitan el desarrollo de tests para futuros objetivos
- Herramienta estable y que no genere demasiada deuda técnica

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
- Es viable para gestionar las tareas de este proyecto
- Y es un proyecto activo y estable.

### Conclusión

Usamos -> Make
Por estabilidad y dada que es una herramienta comúnmente usada en nuestro entorno, nos será más fácil de usar.


