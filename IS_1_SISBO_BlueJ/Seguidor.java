
/**
 * Write a description of class Aficionado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Seguidor {
    private String documentoDeIdentidad;
    private String nombre;
    private String correo;
    private String contraseña;
    private ArrayList<Boleta> boletasCompradas;
    
    // Constructor
    public Seguidor(String documentoDeIdentidad, String nombre, String correo, String contraseña) {
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.boletasCompradas = new ArrayList();
    }
    
    /**
     * La clase comprarBoleta permite que el usuario realice la compra de una boleta, además, en esta misma opción se le permiten cosas
     * como añadir boletas del mercado secundario si las hay.
     * 
     * @param evento    indice del evento deportivo al que quiere asistir.
     */
    
    public void comprarBoleta(int evento){
    
        
    
    }
    
    public void comprarServicioAdicional(){
    
    
    }
    
    public void venderBoleta(){
    
    
    }
    
    public void transferirBoleta(){
    
    
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
    public void setBoletasCompradas(ArrayList<Boleta> boletas){
    
        this.boletasCompradas = boletas;
    
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
    
    public ArrayList<Boleta> getBoletasCompradas(){
        
        return boletasCompradas;
        
    }
}
