package principal;
import controlador.EstudianteControlador;
import vista.EstudianteVista;

/**
 *
 * @author Tatiana Quinayas
 */
public class Main {

    public static void main(String[] args) {
        EstudianteVista vista = new EstudianteVista();
        EstudianteControlador controlador = new EstudianteControlador(vista);

        controlador.iniciarEvaluacion();
    }
}