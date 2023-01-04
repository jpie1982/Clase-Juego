# Clase-Juego
Clase Juego - Sofka - cantera 2 UY

paso01
Atributos

• Tiene como atributo público un entero que indica el número de vidas que le quedan al jugador en la partida actual.

Métodos

Tiene como método el constructor que acepta un parámetro de tipo entero que indica el número de vidas iniciales
 con las que parte el jugador.

Tiene un método MuestraVidasRestantes que visualiza por pantalla el número de vidas que le quedan al jugador en la partida actual.

Además esta clase tiene también el método main que debe realizar lo siguiente:
   Crea una instancia de la clase Juego indicando que el número de vidas es 5.
   Llama al método MuestraVidasRestantes del objeto creado.
   Resta una vida al valor del atributo con las vidas y vuelve a llamar a MuestraVidasRestantes.
   Crea otra instancia de la clase Juego indicando que el número de vidas es también de 5.
   Llama al método MuestraVidasRestantes de la nueva instancia y luego al de la instancia anterior

paso02
   En el ejercicio anterior no se ha prestado atención a la forma en que se permite que alguien modique el atributo con las vidas de la clase Juego. En este ejercicio se utilizará un acceso controlado a ese atributo. Para ello se realizarán los siguientes cambios:
Atributos
Debe ocultarse a cualquier otra clase el atributo con las vidas. Para poder modicar este atributo, se crearán los dos nuevos métodos que se explican más adelante.
Crear un nuevo atributo también privado que guarde el número de vidas que inicialmente se le pasaron al constructor del objeto. Este atributo se utilizará para poder reiniciar el juego.
Crear otro atributo también privado y de tipo entero que guarde el récord. A diferencia de los anteriores (que son atributos de instancia) éste es un atributo de clase, por lo que será común a todos los juegos que se implementen. Inicialmente este atributo tendrá el valor 0.
Métodos
Añadir un método QuitaVida que disminuya en 1 el número de vidas del jugador y devuelva un boolean indicando si al jugador le quedan más vidas o no. En caso de que al jugador no le queden más vidas, este método debe mostrar un mensaje Juego Terminado por pantalla.
Añadir un método ReiniciaPartida que asigne al atributo vidas el número de vidas que se habían indicado al llamar al constructor del objeto. Para ello utilizará el nuevo atributo que se ha añadido.
Añadir un método ActualizaRecord que compare el valor actual de récord con el número de vidas restantes.
Si el número de vidas restantes es igual al récord, mostrará un mensaje indicando que se ha alcanzado el récord.
Si el número de vidas restante es mayor que el récord, actualizará el récord y mostrará un mensaje diciendo que éste se ha batido y cuál es su nuevo valor.
Si el número de vidas es menor, no hará nada.
Para probar la ocultación, la función main se va a poner ahora en una clase aparte llamada Aplicacion en un archivo Aplicacion.java dentro del mismo directorio:
Antes de modicar esta función, comprobar que ahora el compilador nos muestra un mensaje de error al intentar modicar directamente el atributo con las vidas. A continuación proceder con las modicaciones que siguen.
Llamar al método QuitaVida de una de las instancias de la clase Juego a continuación al método MuestraVidasRestantes. Posteriormente llamar al método ReiniciaPartida y de nuevo al método MuestraVidasRestantes.
Llamar al método ActualizaRecord de la primera instancia de Juego y a continuación llamar a este mismo método pero en la segunda instancia. Explica los mensajes mostrados.
