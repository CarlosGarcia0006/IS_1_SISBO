import java.util.ArrayList;
/**
 * La clase Seguidor se encarga de manejar todas las funcionalidades correspondientes a los seguidores, como comprar boleta, comprar servicio adicional, vender boleta en mercado secundario,
 * transferir boleta y además, tiene algunas clases auxiliares como añadir boleta.
 * 
 * @author (Carlos,Juan) 
 * @version (01/05/2024)
 */

public class Seguidor {
    private String documentoDeIdentidad;
    private String nombre;
    private String correo;
    private String contraseña;
    private ArrayList<Boleta> boletasCompradas;
    private ArrayList<ServicioAdicionalSeguidor> servicios;
    private ArrayList<Boleta> boletasEnVenta;    
    
    /**
     * El constructor de la clase Seguidor.
     * 
     * @param documentoDeIdentidad      El numero de documento del seguidor.
     * @param nombre                    El nombre del usuario.
     * @param correo                    El correo del usuario.
     * @param contraseña                La contraseña de la cuenta.
     */
    public Seguidor(String documentoDeIdentidad, String nombre, String correo, String contraseña) {
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.boletasCompradas = new ArrayList();
        this.boletasEnVenta = new ArrayList();
    }
    
    /**
     * El método comprarBoleta permite que el usuario realice la compra de una boleta, además, en esta misma opción se le permiten cosas
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
    /**
     * El método comprarServicioAdicional añade un servicio adicional comprado al inventario del seguidor.
     * 
     * @param evento    el evento del cual se desea comprar un servicio adicional.
     * @param numSer    el número del servicio adicional que se desea comprar.
     */
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
            servicio.aumentarVendidas();
        } else if (!pagoCorrecto && servicio.puedeVender()){
            System.out.println("Pago rechazado.");
        } else if (!servicio.puedeVender() && pagoCorrecto){
            System.out.println("Este servicio adicional para la localidad seleccionada se encuentra agotado.");
        }
        
    }
    
    /**
     * El método venderBoleta permite añadir al mercado secundario una boleta determinada.
     * 
     * @param indiceBoleta  el índice de la boleta perteneciente al inventario que se quiere vender.
     */
    public void venderBoleta(int indiceBoleta){
        Boleta boleta = boletasCompradas.get(indiceBoleta);
        Localidad localidad = boleta.getLocalidad();
        MercadoSecundario mercado = localidad.getMercadoSecundario();
        mercado.añadirBoleta(boleta);
        boletasCompradas.remove(indiceBoleta);
        boletasEnVenta.add(boleta);
    }
    
    /**
     * El método transferirBoleta permite pasar una determinada boleta del inventario a otro usuario, cuando esto se realiza,
     * se elimina la boleta del inventario del remitente.
     * 
     * @param seguidor  corresponde al usuario al que se le pasará la boleta.
     * @param indiceBoleta  corresponde al indice de la boleta que se desea transferir.
     */
    public void transferirBoleta(Seguidor seguidor, int indiceBoleta){
        Boleta boleta = boletasCompradas.get(indiceBoleta);
        seguidor.añadirBoleta(boleta);
        boletasCompradas.remove(indiceBoleta);
    }
    
    /**
     * El método añadirBoleta permite añadir una boleta al inventario del usuario, este método solo se está usando por medio de transferirBoleta.
     * 
     * @param boleta    la boleta que se desea añadir al inventario.
     */
    public void añadirBoleta(Boleta boleta){
        boletasCompradas.add(boleta);
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
