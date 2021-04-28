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
![diagrama de navegación](https://user-images.githubusercontent.com/78809622/110458051-9ddaa300-80cb-11eb-81b1-b08d0f324c83.png)

## Menú:
Es la ventana inicial,desde esta se puede navegar a todas las demás, en un futuro contendrá una interfaz.
Cabe destacar que todas las demás ventanas cuentan con esta barra de navegación.

![menu](https://user-images.githubusercontent.com/78809622/110457860-653ac980-80cb-11eb-8c73-ba30d95f0d93.png)

## Personajes:
Contiene una lista de personajes de distintos tipos junto con sus estadísticas.

![personajes](https://user-images.githubusercontent.com/78809622/110459695-94ead100-80cd-11eb-9490-bb4e7202df3a.png)
## Armas: 
Contiene una lista de varias armas de distinto tipo y rarezas, ademas, cada una de ellas incluye sus estadísticas primarias y secundarias, con los valores a nivel 1 y 90 (mínimo y máximo hasta la fecha). Ademas, de una definición de su pasiva, con disitintos valores (nivel de refinamiento que va del 1 al 5).En este apartado se encuentra un menu de navegación no funcional debido a un problema con los id. 

![armas](https://user-images.githubusercontent.com/78809622/110457777-489e9180-80cb-11eb-8434-35f420e73d50.png)
## Artefactos:
Contiene una lista de distintos artefactos junto con sus respectivas pasivas en función de las piezas equipadas de este mismo tipo, 2 o 4.
![artefactos](https://user-images.githubusercontent.com/78809622/110457803-5227f980-80cb-11eb-85ff-966c0f9d59df.png)
## Equipo:
Por último, en esta ventana se puede añadir un personaje, arma y set de artefacto para generar un personaje con equipación, estos se pueden añadir a un equipo.
Esta ventana va a sufrir cambios tanto para mejorar su usabilidad y una vez se avance en la calculadora.
![equipo](https://user-images.githubusercontent.com/78809622/110457823-58b67100-80cb-11eb-92e4-41bbce031699.png)

## Diagrama de clases y templates:
Diagrama de clases:
![diagrama de clases](https://user-images.githubusercontent.com/78809457/115617973-56fae280-a2f2-11eb-8d58-9d7808db2fe1.png)

Diagrama de templates:
![diagrama de templates](https://user-images.githubusercontent.com/78809457/115625974-20769500-a2fd-11eb-8151-9658b8530451.png)

## Instrucciones de ejecucion:
*Introducir texto serio aqui*
