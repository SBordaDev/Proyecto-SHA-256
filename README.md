## Buscador de Contraseñas SHA-256
Proyecto en Java que realiza búsqueda de contraseñas mediante fuerza bruta
comparando hashes SHA-256 contra una lista objetivo.

## Como correr el codigo
Primero descomprima el archivo .zip en donde usted prefiera, asegurese de que contiene un archivo .jar 

Para correr el codigo es importante que abra la terminal y se ubique en el path de la carpeta *DESCOMPRIMIDA*, deberia de ver algo como
_C:\User\...\JAVAPOO_

es muy importante que ya tenga instalado java en su computador (la version LTS 25.0.2) para verificarlo escriba en la terminal _java --version_.
Una vez tenga instalado java en su equipo ingrese el comando
_java -jar JavaPOO.jar_
de esta manera podra ver los metodos disponibles.

Para el cumplimiento del primer objetivo del taller podra elegir entre:
- `java -jar JavaPOO.jar buscar`: usa las primeras 3000 contraseñas del rockyou para encontrar los hashes, no deberia de tardar mas de un segundo en ejecutarse pero no encuentra todas las contraseñas.
- `java -jar JavaPOO.jar busquedaProfunda` Se asegura de recorrer todas las contraseñas del archivo rockyou, deberia de tardar mucho mas pero encontrara las contraseñas restantes

Para el cumplimiento del segundo objetivo del taller debera correr:
- `java -jar JavaPOO.jar analizar` Observe como se ejecuta el codigo, primero el programa elejira 50 numeros al azar entre el cero y los cien millones para despues ir recorriendo un ciclo for desde el uno hasta los cien millones hasheando y comparando cada numero con los previos encontrados, una vez encuentra los 50 hashes rompe inmediatamente.


## Estructura de la carpeta

Dentro de la carpeta podra ver:

- `Data`: Directorio donde se escuentra el _rockyou.txt_ y los hashes objetivo
- `JavaPOO.jar`: El archivo para ejecutar el programa


## Codigo Fuente

Para ver el codigo completo porfavor entre al link del repositorio en github, tenga encuenta que los datos ya los puede visualizar en el archivo comprimido pero no seran subidos a github por el tamaño
