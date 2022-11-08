# Ergast F1

## DESCRIPCIÓN DE LA API
Servicio web experimental que proporciona un registro histórico de datos de carreras de motor con fines no comerciales, muestra todos los resultados de todas las temporadas de la F1 desde el inicio de los campeonatos del mundo en 1950.

## CAPTURAS POSTMAN

<img src="images\Captura.png" width="250">
-
<img src="images\Captura2.png" width="250">
-
<img src="images\Captura3.png" width="250">
-
## MANUAL TÉCNICO PARA DESARROLLADORES
Obtenemos la información de la API sobre las clasificaciones mediante GET.

Para obtener la clasificación de los pilotos específica en una temporada (año):
http://ergast.com/api/f1/{{year}}/driverStandings

Nuestro programa se basa en un TableView que muestra los datos de la clasificación en sus respectivas TableColumn según la temporada (año) que lo seleccionaremos en un ComboBox, a continuación presionaremos el Button 'Buscar' que hará reflejar los datos en el TableView.
Luego por debajo del TableView habrá un TextField donde podremos poner el nombre al archivo para posteriormente exportarlo con los respectivos Buttons ubicados ala derecha, con opciones para exportar a Json, Xml, texto o binario.

## MANUAL DE USUARIO CON JUEGO DE PRUEBAS

Nuestro programa se basa en una tabla que muestra los datos de la clasificación en sus respectivas columnas según la temporada (año) que lo seleccionaremos en un desplegable, a continuación presionaremos el botón 'Buscar' que hará reflejar los datos en la tabla.
Luego por debajo de la tabla habrá un hueco para escribir donde podremos poner el nombre al archivo para posteriormente exportarlo con los respectivos botones ubicados ala derecha, con opciones para exportar a Json, Xml, texto o binario.

## REPARTO DE TAREAS
Ismael: busqueda de información, creacción del diseño, README.md, escritura de código fuente comentado y retoques.
Gael: escritura del codigo fuente y creacción del diseño.

## PROPUESTAS DE MEJORA
-Buscar por rondas a parte de buscar por años.

-Diseño más atractivo

-Poco aprovechamiento de la API
## CONCLUSIONES Y OPINIÓN
Trabajo de consulta y exportación de los datos de una API simple, por el cual hemos aprendido a manejar ficheros y javafx, en nuestra opinión hemos realizado un trabajo simple pero que cumple requisitos, nos ha servido sobre todo para aprender y repasar para el examen, ya que le hemos dedicado tiempo, pero tampoco excesivo, la mayor parte del trabajo lo hemos realizado en clase invirtiendo poco tiempo en casa, teniendo en cuenta nuestro trabajo pensamos que nuestra nota debería rondar sobre un 6.