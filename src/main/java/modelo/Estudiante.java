package modelo;

/**
 *
 * @author Tatiana Quinayas
 */
public class Estudiante {

    private String nombre;
    private String codigoEstudiantil;
    private double notaDesarrollo;
    private double notaMatematicas;
    private double definitiva;

    public Estudiante(String nombre, String codigoEstudiantil, double notaDesarrollo, double notaMatematicas) {
        this.nombre = nombre;
        this.codigoEstudiantil = codigoEstudiantil;
        this.notaDesarrollo = notaDesarrollo;
        this.notaMatematicas = notaMatematicas;
        calcularDefinitiva();
    }

    public String getNombre() { return nombre; }
    public String getCodigoEstudiantil() { return codigoEstudiantil; }
    public double getNotaDesarrollo() { return notaDesarrollo; }
    public double getNotaMatematicas() { return notaMatematicas; }
    public double getDefinitiva() { return definitiva; }

    public void calcularDefinitiva() {
        this.definitiva = (this.notaMatematicas * 0.4) + (this.notaDesarrollo * 0.6);
    }

    // PUNTO 3: Método void para incrementar la nota (máximo 5.0)
    public void incrementarNotaDesarrollo(double incremento) {
        this.notaDesarrollo += incremento;
        if (this.notaDesarrollo > 5.0) {
            this.notaDesarrollo = 5.0;
        }
        calcularDefinitiva();
    }
}