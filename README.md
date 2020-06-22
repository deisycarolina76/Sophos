#**DETALLES GENERALES DE LA IMPLEMENTACI�N**

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de p�ginas (userinterface).

La estructura completa del proyecto es la siguiente:

+ *exceptions*
    
	Clases que controlan las posibles excepciones t�cnicas y de negocios que se presentan durante la ejecuci�n de pruebas
+ *model*
    
	Clases relacionadas con el modelo de dominio y sus respectivos builder cuando es necesario
+ *tasks*
    
	Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ *interacion*
    
	Clases que representan las interacciones directas con la interfaz de usuario
+ *userinterface*
    
	Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ *questions*
    
	Objetos usados para consultar acerca del estado de la aplicaci�n
+ *integration*

    Clases que se comunican con el "backend", aplica el patr�n facade
+ *util*

    Clases de utilidad
+ *runners*

    Clases que permiten correr los tests
+ *step definitions*

    Clases que mapean las l�neas Gherkin a c�digo java
+ *features*

    La representaci�n de las historias en archivos cucumber
	
#**REQUERIMIENTOS**

Para correr el proyecto se necesita lo siguiente:

*	Java JDK 7_21 de 32 bits.
*	Java JDK 8_161 de 32 bits.
*	Maven
*	Chrome