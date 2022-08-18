# ProyectoSmokeHouse

Descripción
Este sistema tiene el propósito de automatizar las operaciones administrativas y de ventas de The Smoke House. Fue desarrollado en el lenguaje de programación Java y es requerido utilizar un ambiente de desarrollo para correr el programa.
Las funciones principales del programa son la creación de presupuestos para preparar Pulled Pork y BBQ Chicken, además de guardar datos para contaduría de acuerdo por el tipo de transacción y la semana de trabajo en la que fue hecho.

Problema identificado
Se identificó que la empresa no hacía uso de herramientas tecnológicas en sus operaciones administrativas más allá de una hoja de calculo para su contaduría en Excel. El dueño del negocio indicó que el no tener una manera de obtener precios fijos para órdenes grandes le causaba pérdidas al momento de hacer planes para cattering. Además, mencionó que era difícil llevar un registro de todos los gastos y entradas de dinero del negocio durante la semana, por lo que necesitaba un lugar para almacenar los datos de dichas transacciones.

Solución
Un programa que pudiera crear presupuestos exactos que tomen en cuenta los ingredientes involucrados en la preparación de las proteínas principales del restaurante, y que tenga la capacidad de almacenar los datos por tipo de transacción y semana laboral.
 
Arquitectura


a.	Servidores de aplicación, web, bases de datos, etc.
Computadora con potencia básica, ambiente de desarrollo actualizado, Java development kit instalado. 

b.	Paquetes adicionales.
No requeridos.

c.	Versión de Java, etc.
Versión de Java requerida: Java 8.

3.	Instalación:
a.	¿Cómo instalar el ambiente de desarrollo?
1-	Diríjase a este sitio web: https://netbeans.apache.org/ 
2-	Entre en la lista de descargas “Download”
3-	Seleccione la versión más nueva de NetBeans, esta siendo la 14
4-	Abra el instalador y siga las instrucciones del mismo

Java DK
1-	Diríjase a este sitio web: https://www.oracle.com/java/technologies/downloads/#jdk18-windows 
2-	 En la sección de descargas, seleccione su sistema operativo
3-	Descargue el instalador llamado “x64 installer”
4-	Abra el instalador y siga las instrucciones del mismo
b.	¿Cómo ejecutar pruebas manualmente?
1-	Abra el proyecto en su ambiente de desarrollo
2-	Ejecute el programa
3-	Seleccione la función del programa que desee probar en la consola del sistema
4-	Siga las instrucciones del programa en la consola del sistema
5-	Coloque los datos de prueba solicitados por el programa en la consola del sistema
6-	Compare los resultados del programa con los pronosticados
c.	¿Cómo implementar la solución en producción en un ambiente local o en la nube como Heroku?

Implementar la solución en un ambiente local:
1-	Descargue los documentos en el repositorio en línea y colóquelos en una carpeta 
2-	Nombre la carpeta bajo el nombre con el que desee identificar el programa
3-	Abra el navegador de archivos y diríjase a la sección de “Documentos”
4-	Busque el folder llamado “NetBeansProjects”
5-	Coloque la carpeta con los documentos del programa adentro de la carpeta “NetBeansProjects”
*Esta solución no está pensada ni desarrollada para ser implementada en la nube.
Configuración:

d.	Configuración del producto (archivos de configuración).
1-	Descargue los documentos en el repositorio en línea y colóquelos en una carpeta 
2-	Nombre la carpeta bajo el nombre con el que desee identificar el programa
3-	Abra el navegador de archivos y diríjase a la sección de “Documentos”
4-	Busque el folder llamado “NetBeansProjects”
5-	Coloque la carpeta con los documentos del programa adentro de la carpeta “NetBeansProjects”
e.	Configuración de los requerimientos.

Ambiente de desarrollo
1-	Diríjase a este sitio web: https://netbeans.apache.org/ 
2-	Entre en la lista de descargas “Download”
3-	Seleccione la versión más nueva de NetBeans, esta siendo la 14
4-	Abra el instalador y siga las instrucciones del mismo

Java DK
1.	Diríjase a este sitio web: https://www.oracle.com/java/technologies/downloads/#jdk18-windows 
2.	En la sección de descargas, seleccione su sistema operativo
3.	Descargue el instalador llamado “x64 installer”
4.	Abra el instalador y siga las instrucciones del mismo

4.	Uso:
a.	Sección de referencia para usuario final. Manual que se hará referencia para usuarios finales.
¿Cómo obtener un presupuesto?
1-	Abra y ejecute el programa
2-	Seleccione la carne de la cual desea un presupuesto (opción 1 para Pulled Pork, opción 2 para BBQ Chicken)
3-	Coloque el número de platillos a preparar en números enteros. Si coloca decimales, el programa le entregará un error.
4-	El programa le devolverá el presupuesto para preparar los platillos y la cantidad de carne necesaria.
 
¿Cómo guardar transacciones?
1-	Abra y ejecute el programa
2-	Seleccione el tipo de transacción que desee guardar (3 para un gasto, 4 para una entrada de dinero)
3-	Digite el monto de la transacción
4-	Digite la semana laboral en la que se hizo la transacción empezando con CW (ej. CW01)
5-	El programa volverá al menú si fue hecho de manera exitosa
 
¿Cómo mostrar las transacciones que fueron hechas?
1-	Abra y ejecute el programa
2-	Seleccione el tipo de transacción de la cual desea ver los últimos movimientos (5 para gastos, 6 para entradas)
3-	El sistema listará los movimientos guardados en el archivo de texto y volverá al menú
 
b.	Sección de referencia para usuario administrador.

¿Cómo obtener los datos de transacciones para la hoja de datos en Excel?
1-	Abra el navegador de archivos y entre en la sección de “Documentos”
2-	Busque y abra la carpeta llamada “NetBeansProjects”
3-	Busque y abra la carpeta con el nombre del programa
4-	Dependiendo de las transacciones que esté buscando, seleccione el archivo .txt llamado “gastos” o “entradas”. (si no encuentra los archivos es debido a que no se han guardado datos hasta el momento)
5-	Una vez tenga abierto el archivo deseado, manipule la información de la manera deseada.

Mejores prácticas
1-	Al guardar los datos semanalmente en la hoja de cálculo de contaduría, elimine los datos en el archivo de texto 
2-	Cuando hayan cambios en los precios de los productos involucrados en la preparación de alimentos, informe al desarrollador para así actualizar el programa.
5.	Contribución:
a.	Guía de contribución para usuarios. 
Agradezco su interés en contribuir a este programa. Siéntase con la libertad de desarrollar sus propias propuestas de mejora, las cuales serán analizadas con el cliente previo a la implementación en el programa main.

¿Cómo contribuir?
1-	Cree un nuevo Branch y nómbrelo de tal manera que sea fácil identificar los cambios que está haciendo
2-	Haga sus ediciones y adiciones al programa 
3-	Coloque un archivo .txt describiendo las ediciones/adiciones hechas y el porqué de las mismas
4-	De Push a sus cambios y estos serán analizados. Será notificado si estos son implementados o no
b.	Debe contar con pasos específicos para clonar repositorio, crear un nuevo branch, enviar el pull request, esperar a hacer el merge.

¿Cómo clonar el repositorio?
1-	Entre a este link para encontrar el repositorio en línea: https://github.com/Jakes57/ProyectoSmokeHouse 
2-	Descargue los archivos del repositorio y guárdelos en una carpeta
3-	Cree un nuevo repositorio con los archivos guardados

¿Cómo crear un nuevo Branch?
1-	Entre a este link para encontrar el repositorio en línea: https://github.com/Jakes57/ProyectoSmokeHouse 
2-	Diríjase a la sección de branches
3-	Seleccione la opción “New Branch”
4-	Nombre el nuevo Branch de tal manera que se pueda saber los cambios desarrollados en el mismo

¿Cómo enviar un pull request?
1.	Entre a este link para encontrar el repositorio en línea: https://github.com/Jakes57/ProyectoSmokeHouse 
2.	Diríjase a la sección de pull requests
3.	Seleccione la opción “New pull request”
4.	Seleccione los branches que desea que sean comparados
5.	Seleccione la opción “Create new pull request”

Merge
1.	Una vez que su pull request empiece a ser analizado, recibirá un mensaje de ello
2.	En caso de haber la necesidad de resolver ciertas dudas con el pull request, será contactado por ello
3.	Una vez se determine si se hará merge con su Branch o no, será informado de ello

RoadMap


