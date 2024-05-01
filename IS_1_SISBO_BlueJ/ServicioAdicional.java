
/**
 * Write a description of class Servicio_adicional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ServicioAdicional {
    private String nombre;
    private String descripcion;
    private int precio;
    private int unidadesMaximas;

    // Constructor
    public ServicioAdicional(String nombre, String descripcion, int precio, int unidadesMaximas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidadesMaximas = unidadesMaximas;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setUnidadesMaximas(int unidadesMaximas) {
        this.unidadesMaximas = unidadesMaximas;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getUnidadesMaximas() {
        return unidadesMaximas;
    }
}
