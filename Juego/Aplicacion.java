package Juego;

public class Aplicacion {
    /*
* Atributos

• Tiene como atributo público un entero que indica el número de vidas que le quedan al jugador en la partida actual.#

Métodos

Tiene como método el constructor que acepta un parámetro de tipo entero que indica el número de vidas iniciales
* con las que parte el jugador.#
*
Tiene un método MuestraVidasRestantes que visualiza por pantalla el número de vidas que le quedan al jugador en la partida actual.#

* Además esta clase tiene también el método main que debe realizar lo siguiente:
    Crea una instancia de la clase Juego.Juego indicando que el número de vidas es 5.#
    Llama al método MuestraVidasRestantes del objeto creado.#
    Resta una vida al valor del atributo con las vidas y vuelve a llamar a MuestraVidasRestantes.#

    * Crea otra instancia de la clase Juego.Juego indicando que el número de vidas es también de 5.#
    Llama al método MuestraVidasRestantes de la nueva instancia y luego al de la instancia anterior#
* */
    public static void main(String[] args) {
       System.out.println("Juego.Juego 1");
       Juego juego1 = new Juego(5);
       juego1.muestraVidasRestantes();
       juego1.actualizaRecord();
       boolean  numeroVidas = juego1.quitaVidas();
       if (numeroVidas){
           juego1.muestraVidasRestantes();
           juego1.actualizaRecord();
       }else {
        juego1.reiniciaPartida();
        juego1.muestraVidasRestantes();
        juego1.actualizaRecord();
       }

        //Instancia 2
       System.out.println("Juego.Juego 2");
       Juego juego2 =new Juego(5);
       juego2.muestraVidasRestantes();
       juego2.actualizaRecord();
       juego1.muestraVidasRestantes();
       juego1.actualizaRecord();

    }
}