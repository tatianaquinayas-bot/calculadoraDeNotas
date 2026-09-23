package vista;
import javax.swing.JOptionPane;
/**
 *
 * @author Tatiana Quinayas
 */
public class EstudianteVista {
    public String solicitarNombre() {
        return JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
    }
    
    public String solicitarCodigo() {
        return JOptionPane.showInputDialog("Ingrese el código estudiantil:");
    }
    
    public double solicitarPromedio() {
    double promedio;
    do {
        String entrada = JOptionPane.showInputDialog("Ingrese el promedio ponderado (0.0 - 5.0):");
        promedio = Double.parseDouble(entrada.replace(",", "."));
        if (promedio < 0.0 || promedio > 5.0) {
            JOptionPane.showMessageDialog(null, "El promedio debe estar entre 0.0 y 5.0", "Valor inválido", JOptionPane.ERROR_MESSAGE);
        }
    } while (promedio < 0.0 || promedio > 5.0);
    return promedio;
}
    
    public void mostrarResultadoFinal(String nombre, boolean aprobado) {
        String estado = aprobado ? "APROBADO" : "REPROBADO";
        JOptionPane.showMessageDialog(null,
                "Estudiante: " + nombre + "\nEstado: " + estado,
                "Resultado de Evaluación",
                JOptionPane.INFORMATION_MESSAGE);
    }
}