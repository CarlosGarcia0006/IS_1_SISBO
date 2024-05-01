
/**
 * Write a description of class Servicio_adicional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ServicioAdicional {
    private String nombre;
    private String descripcion;

    // Constructor
    public ServicioAdicional(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
