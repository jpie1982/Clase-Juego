package Juego;

public class Juego {
    /*
    * Atributos

• Tiene como atributo público un entero que indica el número de vidas que le quedan al jugador en la partida actual.

Métodos

Tiene como método el constructor que acepta un parámetro de tipo entero que indica el número de vidas iniciales
* con las que parte el jugador.
*
Tiene un método MuestraVidasRestantes que visualiza por pantalla el número de vidas que le quedan al jugador en la partida actual.

* Además esta clase tiene también el método main que debe realizar lo siguiente:
    Crea una instancia de la clase Juego.Juego indicando que el número de vidas es 5.
    Llama al método MuestraVidasRestantes del objeto creado.
    Resta una vida al valor del atributo con las vidas y vuelve a llamar a MuestraVidasRestantes.
    Crea otra instancia de la clase Juego.Juego indicando que el número de vidas es también de 5.
    Llama al método MuestraVidasRestantes de la nueva instancia y luego al de la instancia anterior
    * */
    private int vidas;
    private  int vidasInicial;
    private static int record = 0;
    //private int  numeroDeVidas;

    public Juego(int vidasInicial) {
        this.vidas = vidasInicial;
        this.vidasInicial = vidasInicial;
    }

///////// metodos
    public void  muestraVidasRestantes(){
        System.out.println("Las vidas que quedas son: "+vidas);
    }
    public boolean quitaVidas(){
        vidas--;
        if (vidas > 0){
            return true;

        }else {
            System.out.println("Te quedastes sin vidas\n GAME OVER");
            return false;
        }
    }
    public void reiniciaPartida(){
        vidas = vidasInicial;
    }
    public void actualizaRecord(){
        if (vidas == record){
            System.out.println("Se Alcanzo al record:" +record);
        }else if (vidas>record){
            record = vidas;
            System.out.println("Se a batido nuevo Record y su valor es "+ record);
        }
    }

///////////////////////////////////////////set & get
    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public static int getRecord() {
        return record;
    }

    public static void setRecord(int record) {
        Juego.record = record;
    }
}
