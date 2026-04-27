/**
 * Clase que maneja eljuego principal
 */
public class Juego {

    /**
     * Constructor de la clase
     */
    public Juego(){
        inicializar_naves();
    }

    /**
     * Crea e inicializa todas las naves del juego.
     * Coloca las naves en el tablero en
     * posiciones predefinidas
     */
    public void inicializar_naves(){
        // System.out.println("Inicializando naves");
        // crear objeto Tablero
        Tablero miTablero = new Tablero();
        System.out.println(miTablero.casillero[1][1]);

        Tablero otroTablero = new Tablero();

    }
}
