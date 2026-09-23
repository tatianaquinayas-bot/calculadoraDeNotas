package modelo;

/**
 *
 * @author Tatiana Quinayas
 */
public class Estudiante {

    private String nombre;
    private String codigoEstudiantil;
    private double promedioPonderado;

    public Estudiante(String nombre, String codigoEstudiantil, double promedioPonderado) {
        this.nombre = nombre;
        this.codigoEstudiantil = codigoEstudiantil;
        this.promedioPonderado = promedioPonderado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoEstudiantil() {
        return codigoEstudiantil;
    }

    public double getPromedioPonderado() {
        return promedioPonderado;
    }

    public boolean esAprobado() {
        return this.promedioPonderado >= 3.0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoEstudiantil(String codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }

    public void setPromedioPonderado(double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }
    
    
}
