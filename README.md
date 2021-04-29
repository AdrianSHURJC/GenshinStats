# GenshinStats
Nombre de la aplicación web: GenshinStats

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
*imagen aqui*

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
*Introducir texto serio aqui*
