# didactic-chainsaw

`Alias: IV` :+1:

### Problema a resolver

Soy un jugador de CTFs (Capture The Flag ó Captura la bandera para los amigos hispano hablantes :) desde hace tiempo, suelo pasar mucho tiempo buscando CVEs (Common Vulnerabilities and Exposures) y probandolos. Entonces necesito algo para poder obtener el cve correcto en el momento adecuado en funcion de mi necesidad en ese momento a partir de las pistas que tenga del SO. En vez de estar horas y horas buscando.

### Solución

La idea principal para solucionar el problema es crear una aplicación web que ofrezca los cves pertinentes de forma que tenga disponible la información actualizada sin preocupaciones. Para ello es necesario rescatar la información de los cves, procesarla para extraer la información importante y luego servirla al usuario. A partir de la entrada de los pocos datos de los que se dispone.



## Instrucciones de ejecución

1. Instalamos la versión correcta de Java y Gradle, para ello es conveniente usar `sdkman!` o se puede realizar la instalación de forma manual.

- Instalación de [sdkman!](https://sdkman.io/): `curl -s "https://get.sdkman.io" | bash`
- Instalar el JDK de Liberica: `sdk install java 21.0.1.fx-librca`
- Nos aseguramos de usar la versión instalada: `sdk use java 21.0.1.fx-librca`

O se instala de forma manual desde la propia pagina de [BellSoft](https://bell-sw.com/pages/downloads/#jdk-21-lts)
- `$ wget https://download.bell-sw.com/java/21.0.1+12/bellsoft-jdk21.0.1+12-linux-amd64.deb`
- `# apt install bellsoft-jdk21.0.1+12-linux-amd64.deb`

- Instalamos `Gradle` en su versión `8.5`: `sdk install gradle 8.5`
- Nos aseguramos de usar la versión instalada: `sdk use gradle 8.5`

2. Una vez instaladas las librerías procedemos a comprobar el código.
`gradlew check`

3. Compilar
`gradlew build`

4. Ejecutar
- Desde fichero compilado: `java -jar build/libs/chainsaw-0.0.1-SNAPSHOT.jar`
- Con gradle: `gradle bootRun`

