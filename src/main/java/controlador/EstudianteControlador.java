package controlador;

import modelo.Estudiante;
import vista.EstudianteVista;

/**
 *
 * @author Tatiana Quinayas
 */
public class EstudianteControlador {

    private EstudianteVista vista;
    private Estudiante modelo;

    public EstudianteControlador(EstudianteVista vista) {
        this.vista = vista;
    }

    public void iniciarEvaluacion() {
        String nombre = vista.solicitarNombre();
        String codigo = vista.solicitarCodigo();
        double promedio = vista.solicitarPromedio();

        // El controlador instancia el estudiante según el requisito
        modelo = new Estudiante(nombre, codigo, promedio);

        boolean estadoAprobacion = modelo.esAprobado();
        vista.mostrarResultadoFinal(modelo.getNombre(), estadoAprobacion);
    }
}
