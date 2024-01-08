# Criterios de elección

Para comprobar que la aplicación funciona correctamente necesitaríamos una serie de tests que 
comprobasen cada componente de esta y que estuvieran bien conectados con la aplicación para que no
supongan más tiempo de desarrollo que la propia aplicación.

# Opciones planteadas

### [JUnit](https://junit.org/junit5/)
Es una librería que nos permite desarrollar tests unitarios para toda la aplicación
lo que implica que vamos a probar componente a componente (a nivel de clase). Todo esto sería
simplemente a nivel de unos resultados de ejemplo de entrada y la espera de una salida especifica.

### [Cucumber](https://cucumber.io/)
En este caso también se pueden implementar los propios test unitarios de JUnit, pero en este caso
también se realizan pruebas con la aplicación al completo probando entradas y salidas. Se suele utilizar con
la herramienta [Selenium](https://www.selenium.dev/) para probar aplicaciones web como si fuera un usuario normal conectando.

### [Spring Tests](https://spring.io/)
Son los test que nos trae el propio framework spring que estamos usando, el cual incluye tanto JUnit, como [Mockito](https://site.mockito.org/) el cual es un framework para realizar tests unitarios. También admite la posibilidad que realizar pruebas de API.

# Decisión final
### Spring Tests
He elegido esta opción puesto que es una opción bastante completa al incluir Mockito/JUnit para los tests unitarios
y además al ser parte del framework que estamos usando facilita mucho la implantación de estos.
