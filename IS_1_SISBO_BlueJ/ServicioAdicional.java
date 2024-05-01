
/**
 * La clase Servicio Adicional se encuentra diseñada para ser heredada por ServicioAdicionalClub y ServicioAdicionalSeguidor.
 * 
 * @author (Carlos,Juan) 
 * @version (01/05/2024)
 */

public class ServicioAdicional {
    private String nombre;
    private String descripcion;

    /**
     * Constructor de la clase ServicioAdicional.
     * 
     * @param nombre    El nombre del servicio adicional.
     * @param descripción   Una descripción relacionada a este servicio adicional.
     */
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
