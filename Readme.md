# RESUMEN LAB-05:

## Parte 1:
Utilizamos mediante el comando telnet el uso del HOST, PORT y protocolos HTTP, haciendo conexiones.

## Parte 2:
Empezamos creando un proyecto con archetype webApp, despues creamos la clase SampleServlet, se cambiaron dependencias y build para poder modificar la URL de nuestro proyecto.
Despues de la modificación se compila y se ejecuta TomCat, creando despues una clase Todo en donde se encuentra los metodos GET y SET.
Posteriormente se crea la clase Service para llamar a la clase Todo y agregar los datos de GET, creando despues la clase httpServlet y se sobrescribe el metodo doGet.
Se modifica la URL para ser ingesada un Id y se realizan unas excepciones, para los parametros invalidos.

## Parte 3:
Se utilizo un archivo HTML para generar un pagina donde se ingresa unos datos enteros y posteriormente efectuar mediante un archivo JavaScript un resultado a dicho valor, en donde se determinaba si este era una valos avalido o no.
Posteriormente informandole al usuario su resultado.

## Parte 4:
Se utiliza algunos conceptos aprendidos en las partes anteriores y posteriormente crea un proyecto basado en PrimeFaces con diversos metodos para poder calcular moda, promedio, variación estandar y la reiniciacion de los datos.


# PREGUNTAS PARTE 3:
## Punto 20:
### Historial
GET = Los parametros permanecen en el historial.
### Marcadores
POST = No acepta marcadores.
### Parametros
GET =  No puede enviar parametros de tamaño limitado.
### Hackeos
POST = Es más dificil de hackear a comparación de GET.
### Uso
GET = No debe ser usado cuando se envían contraseñas de información sensible.
### Visibilidad
POST = Las variables no pueden visualizar en el URL.

## Punto 21:

