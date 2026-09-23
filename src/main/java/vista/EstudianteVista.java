package vista;
import javax.swing.JOptionPane;
/**
 *
 * @author Tatiana Quinayas
 */
public class EstudianteVista {

    // PUNTO 1: Solicitar cantidad de estudiantes
    public int solicitarCantidadEstudiantes() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de estudiantes a registrar:"));
    }

    public String solicitarNombre() {
        return JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
    }

    public String solicitarCodigo() {
        return JOptionPane.showInputDialog("Ingrese el código estudiantil:");
    }

    public double solicitarNota(String asignatura) {
        double nota;
        do {
            String entrada = JOptionPane.showInputDialog("Ingrese la nota de " + asignatura + " (0.0 - 5.0):");
            nota = Double.parseDouble(entrada.replace(",", "."));
            if (nota < 0.0 || nota > 5.0) {
                JOptionPane.showMessageDialog(null, "La nota debe estar entre 0.0 y 5.0", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (nota < 0.0 || nota > 5.0);
        return nota;
    }

    // PUNTO 2: Solicitar nota limite (0.0 a 4.9)
    public double solicitarNotaLimite() {
        double limite;
        do {
            String entrada = JOptionPane.showInputDialog("Ingrese la nota límite para filtrar (entre 0.0 y 4.9):");
            limite = Double.parseDouble(entrada.replace(",", "."));
            if (limite < 0.0 || limite > 4.9) {
                JOptionPane.showMessageDialog(null, "La nota límite debe estar entre 0.0 y 4.9", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (limite < 0.0 || limite > 4.9);
        return limite;
    }

    // PUNTO 3: Solicitar incremento (0.0 a 0.5)
    public double solicitarIncremento() {
        double incremento;
        do {
            String entrada = JOptionPane.showInputDialog("Ingrese la cifra a incrementar en Desarrollo (entre 0.0 y 0.5):");
            incremento = Double.parseDouble(entrada.replace(",", "."));
            if (incremento < 0.0 || incremento > 0.5) {
                JOptionPane.showMessageDialog(null, "El incremento debe estar entre 0.0 y 0.5", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (incremento < 0.0 || incremento > 0.5);
        return incremento;
    }

    public void mostrarMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}