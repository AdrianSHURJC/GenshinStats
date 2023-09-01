
# DAD_GenshinStats

# GenshinStats
Se busca realizar una aplicación web con gran transfondo de Backend; añadiendo permisos, conexión a una API y dockerización. 
La parte Frontend NO es evaluable, por lo que se ignorara en gran medida el aspecto estilístico.

Nombre de la aplicación web: GenshinStats


# GenshinStats API REST (Servicio interno)
Link a la API REST: https://github.com/AdrianSHURJC/GenshinStats_REST
# Video explicativo de la web
https://www.youtube.com/watch?v=e06dqcPADDw&ab_channel=Adri%C3%A1nSanz

[![IMAGE ALT TEXT](https://i.ytimg.com/vi/wofB1wzyYYI/hqdefault.jpg)](https://www.youtube.com/watch?v=e06dqcPADDw "Video explicativo")

## Descripción de la temática de la web, indicando qué funcionalidad es pública y cual es privada y diferente para cada usuario: 
Sitio web de consulta sobre el juego "Genshin Impact", dentro de este juego, se tienen distintos personajes, estos se pueden equipar con 5 tipos diferentes de artefactos y un arma. Se podrán consultar las estadísticas base de cada personaje, arma y artefacto y como van creciendo a lo lago de los niveles. Además se proporcionará una calculadora donde podrá visualizar como quedaría un personaje con las características que el usuario prefiera. Todo esto, sería publico, para la parte privada se podría implementar una funcionalidad para guardar un personaje ya construido y poder visualizarlo y actualizarlo cuando se prefiera.

## Nombre y descripción de cada una de las 4 o 5 entidades principales:  
1.Personajes: En esta entidad se muestran todos los personajes del juego con el elemento al que pertenecen, sus diferentes talentos y el escalado de sus estadísticas.

2.Armas: En este apartado se muestran todas las armas que hay dentro del juego y sus respectivas estadísticas que van a ir escalando en base a su nivel.

3.Artefactos: Se pueden buscar los diferentes sets de artefactos dentro del juego, ordenados según su rareza y se van a mostrar los beneficios a las estadísticas que aporta cada uno de ellos.

4.Equipo: La entidad equipo le permiten guardar al usuario los diferentes equipos y las estadisticas del personaje actualizadas con la suma del arma y el set de artefactos.

## Descripción de las funcionalidades del servicio interno: 
Generar PDF del Objeto Equipo: genera un PDF de un Equipo que se puede encontrar en la lista de Equipos

## Integrantes del equipo de desarrollo:
Adrián Sanz Hervás- a.sanzh.2017@alumnos.urjc.es -AdrianSHURJC
Raúl de la Fuente Carrasco- r.delafuente.2017@alumnos.urjc.es -maki01-cyber
Santiago Ramos Gómez- s.ramosg.2018@alumnos.urjc.es  - sRamosg2018

## Modelo UML:
![UML_DAD](https://user-images.githubusercontent.com/78809457/110383519-afd12d00-805c-11eb-95a8-86fe85dd33a3.png)

## Modelo Entidad/Relación:
![E_R_DAD](https://user-images.githubusercontent.com/78809457/110383425-86180600-805c-11eb-9e41-7f5b7d4d82f0.jpg)

## Diagrama navegación:
![diagrama de navegación](https://user-images.githubusercontent.com/78809457/116481592-c5f0b200-a883-11eb-869d-75bb13a5b448.png)

## Menú:
Es la ventana inicial,desde esta se puede navegar a todas las demás, en un futuro contendrá una interfaz.
Cabe destacar que todas las demás ventanas cuentan con esta barra de navegación.

![menu](https://user-images.githubusercontent.com/78809457/116477931-9ccd2300-a87d-11eb-8f23-7424ba9009db.png)

## Personajes:
Contiene una lista de personajes de distintos tipos junto con sus estadísticas.

![personajes](https://user-images.githubusercontent.com/78809457/116478102-db62dd80-a87d-11eb-9ee9-e79d5d185428.png)
## Armas: 
Contiene una lista de varias armas de distinto tipo y rarezas, ademas, cada una de ellas incluye sus estadísticas primarias y secundarias, con los valores a nivel 1 y 90 (mínimo y máximo hasta la fecha). Ademas, de una definición de su pasiva, con disitintos valores (nivel de refinamiento que va del 1 al 5).En este apartado se encuentra un menu de navegación no funcional debido a un problema con los id. 

![armas](https://user-images.githubusercontent.com/78809457/116478055-cc7c2b00-a87d-11eb-9b94-ae7ac2c563e1.png)
## Artefactos:
Contiene una lista de distintos artefactos junto con sus respectivas pasivas en función de las piezas equipadas de este mismo tipo, 2 o 4.
![artefactos](https://user-images.githubusercontent.com/78809457/116524622-e0547b00-a8d7-11eb-813c-1cfcce82ae96.png)

##Crear Equipo:
En esta ventana se puede añadir un personaje, arma y set de artefacto para generar un personaje con equipación, estos se pueden añadir a un equipo.
Esta ventana va a sufrir cambios tanto para mejorar su usabilidad y una vez se avance en la calculadora.
![equipo](https://user-images.githubusercontent.com/78809457/116478148-ed448080-a87d-11eb-9631-dcdd499bfcac.png)

## listaEquipos:
Aqui se van a poder ver los equipos que se vayan creando con sus estadisticas sumadas despues de realizar el calculo.
![listaEquipos](https://user-images.githubusercontent.com/78809457/116478662-b458db80-a87e-11eb-85e9-6040301b7d1c.png)

## verEquipo:
Desplegable del equipo seleccionado dentro de la lista de equipos
![verEquipo](https://user-images.githubusercontent.com/78809457/116478735-dce0d580-a87e-11eb-89d7-5da5509143a8.png)

## generarPDF:
Genera un texto en una URL con los datos que le envia la API REST sobre el personaje seleccionado en verEquipo
![generarPDF](https://user-images.githubusercontent.com/78809457/116524831-201b6280-a8d8-11eb-9217-986c459daa0b.png)

## Signup:
Registrar usuarios
![signup](https://user-images.githubusercontent.com/78809457/116478474-67750500-a87e-11eb-9f5c-68a1bb42a268.png)

## Signin:
Pagina empleada por los usuarios para acceder con su cuenta
![login](https://user-images.githubusercontent.com/78809457/116523363-74254780-a8d6-11eb-94f0-b4dbca726d55.png)

## private:
pagina de bienvenida a la que solo se puede acceder si estas logeado con un usuario
![private](https://user-images.githubusercontent.com/78809457/116523454-8acb9e80-a8d6-11eb-8722-63c339d7b892.png)

## borrarEquipo:
pagina privada, de uso exclusivo para administradores, de momento solo muestra una imagen pero la intencion es que se puedan borrar los equipos desde aqui
![borrarEquipo](https://user-images.githubusercontent.com/78809457/116523505-96b76080-a8d6-11eb-865b-4856385a5e1f.png)

## Diagrama de clases y templates:
Diagrama de clases:
![diagrama de clases](https://user-images.githubusercontent.com/78809457/115617973-56fae280-a2f2-11eb-8d58-9d7808db2fe1.png)

Diagrama de templates:
![diagrama de templates](https://user-images.githubusercontent.com/78809457/115625974-20769500-a2fd-11eb-8151-9658b8530451.png)

## Instrucciones de ejecucion:
Una vez creada la maquina virtual:

$ sudo apt install openjdk-8-jdk-headless

$ sudo apt install mysql-server

$ sudo mysql_secure_installation (Configuración de mysql)

$ mysqld --initialize (En caso de que no cree el directorio)

$ sudo mysql

$ mysql> create database gonzalogenshin;

$ mysql> CREATE USER 'admin'@'localhost' IDENTIFIED BY 'administrador';

$ mysql> GRANT ALL ON gonzalogenshin.* to 'admin'@'localhost';

$ java -jar Genshin_Stats-0.0.1-SNAPSHOT.jar (Hacer cd al directorio donde se encuentra)

$ java -jar Genshin_Stats_Rest-0.0.1-SNAPSHOT.jar (Hacer cd al directorio donde se encuentra)
>>>>>>> branch 'main' of https://github.com/AdrianSHURJC/GenshinStats.git

## Documentacion del servicio interno:
Para este apartado se ha utilizado docker-compose junto con las conexiones directa que esto nos proporciona

![docker compose](https://user-images.githubusercontent.com/78809457/118528622-d4274500-b742-11eb-81b0-5cee797fedfe.png)

Dispone, como se puede ver en la imagen superior, de un balanceador de carga, una base de datos, la cache realizada en redis, dos servicios de rest y otros dos de servicio web.
