
/**
 * Write a description of class Aficionado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seguidor {
    private String documentoDeIdentidad;
    private String nombre;
    private String correo;
    private String contraseña;

    // Constructor
    public Seguidor(String documentoDeIdentidad, String nombre, String correo, String contraseña) {
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    // Setters
    public void setDocumentoDeIdentidad(String documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Getters
    public String getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }
}
