
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
    private ArrayList<ServicioAdicionalSeguidor> servicios;
    
    
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
     * @param numLoc    se refiere al número o índice correspondiente a la localidad de la que se desea hacer la compra.
     */
    
    public void comprarBoleta(EventoDeportivo evento, int numLoc){
    
        ArrayList<Localidad> localidades = evento.getLocalidades();
        
        Localidad localidad = localidades.get(numLoc);
        
        boolean pagoCorrecto = true;
        
        if (pagoCorrecto && localidad.puedeGenerar()){
            Boleta boleta = localidad.generarBoleta();
            boletasCompradas.add(boleta);
        } else if (!pagoCorrecto && localidad.puedeGenerar()){
            System.out.println("Pago rechazado.");
        } else if (!localidad.puedeGenerar() && pagoCorrecto){
            System.out.println("Las boletas para esta localidad se encuentran agotadas.");
        }
    
    }
    
    public void comprarServicioAdicional(EventoDeportivo evento, int numSer){
        ArrayList<ServicioAdicionalClub> serv = evento.getServicios();
        
        ServicioAdicionalClub servicio  = serv.get(numSer);
        
        String name = servicio.getNombre();
        String descripcion = servicio.getDescripcion();
        
        boolean pagoCorrecto = true;
        
        if(pagoCorrecto && servicio.puedeVender()){
            ServicioAdicionalSeguidor adicional = new ServicioAdicionalSeguidor(nombre,descripcion);
            servicios.add(adicional);
            System.out.println("Se ha completado la compra del servicio adicional "+name+" para el evento vs "+evento.getOponente());
        } else if (!pagoCorrecto && servicio.puedeVender()){
            System.out.println("Pago rechazado.");
        } else if (!servicio.puedeVender() && pagoCorrecto){
            System.out.println("Este servicio adicional para la localidad seleccionada se encuentra agotado.");
        }
        
    }
    
    public void venderBoleta(Boleta boleta){
        
    
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
