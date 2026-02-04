## Buscador de Contraseñas SHA-256
Proyecto en Java que realiza búsqueda de contraseñas mediante fuerza bruta
comparando hashes SHA-256 contra una lista objetivo.

Para ver las evidencias de ejecucion ingrese a la [WIKI](https://github.com/SBordaDev/Proyecto-SHA-256/wiki) de este repositorio

## Requisitos
* Java (LTS 25.0.2) **_MUY IMPORTANTE O EL CODIGO NO VA A CORRER (actualizar su version actual de java si es necesario)_**
* Terminal

## Como correr el codigo
Asegurese de tener en su equipo la version LTS de java con el siguiente comando
```
java --version
```
Deberia de ver algo como:
```
java 25.0.2 2026-01-20 LTS
```
Si ve una version menor por favor actualice el JDK.


Después de haber hecho la verificación descomprima el archivo JavaPOO.zip en donde usted prefiera, asegurese de que contiene un archivo .jar 

Para correr el codigo es importante que abra la terminal y se ubique en el path de la carpeta **DESCOMPRIMIDA**, deberia de ver algo como
_C:\User\...\JAVAPOO_

Ahora ingresa el comando:
```
java -jar JavaPOO.jar
```
De esta manera podras ver los tres metodos disponibles.

## Metodos Disponibles
Para el cumplimiento del primer objetivo del taller podra elegir entre los metodos:
- `java -jar JavaPOO.jar buscar`: este metodo usa las primeras 3000 contraseñas del rockyou para encontrar los hashes, no deberia de tardar mas de un segundo en ejecutarse pero no encuentra todas las contraseñas.
- `java -jar JavaPOO.jar busquedaProfunda` Se asegura de recorrer todas las contraseñas del archivo rockyou hasta encontrar todos los hashes; deberia de tardar mucho mas pero encontrara las contraseñas restantes.

Para el cumplimiento del segundo objetivo del taller debera correr:
- `java -jar JavaPOO.jar analizar` Observara como se ejecuta el codigo y su duración, en consola se imprimiran los 50 numeros escogidos al azar entre uno y cien millones y después vera como el metodo va a encontrar una por una las cincuenta contraseñas hasta acabar.


## Estructura de la carpeta comprimida

Dentro de la carpeta podra ver:

- `Data`: Directorio donde se escuentra el _rockyou.txt_ y los hashes objetivo
- `JavaPOO.jar`: El archivo para ejecutar el programa


## Codigo Fuente

Para ver el codigo completo porfavor entre al link del [Repositorio en GitHub](https://github.com/SBordaDev/Proyecto-SHA-256), tenga encuenta que los datos ya los puede visualizar en el archivo comprimido y no seran subidos a github por el tamaño.

En el codigo fuente podra ver las clases que se usan para solucionar este taller, para el objetivo uno centrese en el archivo _src/ciberseguridad/BuscadorContraseñas.java_ y para el segundo objetivo centrese en el archivo _src/ciberseguridad/Analisis_
