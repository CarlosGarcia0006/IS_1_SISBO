import java.util.ArrayList;

/**
 * La clase EventoDeportivo puede ser creada por un Club y corresponde a algún evento que se realizará.
 * 
 * @author (Carlos, Juan) 
 * @version (01/05/2024)
 */


public class EventoDeportivo {
    private String oponente;
    private String estadio;
    private String fecha;
    private String horaIngreso;
    private String horaCierre;
    private ArrayList<Localidad> localidades;
    private ArrayList<ServicioAdicionalClub> servicios;

    /**
     * El constructor de la clase EventoDeportivo.
     * 
     * @param oponente      El oponente contra el que será el evento deportivo.
     * @param estadio       El estadio donde se realizará el evento deportivo.
     * @param fecha         La fecha en la que se realizará, se deja en string ya que no se realizará ninguna operación con ella.
     * @param horaIngreso   Hora en la que se abrirán las puertas del estadio, se deja en string ya que no se realizará ninguna operación con ella.
     * @param horaCierre    Hora en la que finaliza el evento, se deja en string ya que no se realizará ninguna operación con ella.
     */
    public EventoDeportivo(String oponente, String estadio, String fecha, String horaIngreso, String horaCierre) {
        this.oponente = oponente;
        this.estadio = estadio;
        this.fecha = fecha;
        this.horaIngreso = horaIngreso;
        this.horaCierre = horaCierre;
        this.localidades = new ArrayList();
        this.servicios = new ArrayList();
    }
    /**
     * El método añadirServicioAdicional, añade un servicio adicional a este evento.
     * @param name              El nombre del servicio adicional              
     * @param desc              La descripción del servicio adicional
     * @param price             El precio del servicio adicional
     * @param max               Las unidades máximas por cliente que se pondrán en el servicio adicional.
     */
    public void añadirServicioAdicional(String name, String desc, int price, int max){
    
        ServicioAdicionalClub serv = new ServicioAdicionalClub(name,desc,price,max);
        servicios.add(serv);
        System.out.println("Se ha añadido el servicio "+name+" al evento vs "+oponente);
    }
    
    /**
     * El método añadirLocalidad, le añade una localidad a este evento.
     * 
     * @param name      El nombre de la localidad.
     * @param price     El precio que tendrá una boleta de esta localidad.
     * @param cant      La capacidad de asientos que tendrá la localidad.
     */
    public void añadirLocalidad(String name, int price, int cant){
        Localidad loc = new Localidad(name,price,cant,this);
        localidades.add(loc);
        System.out.println("Se ha añadido la localidad "+name+" satisfactoriamente al evento vs "+oponente);
        
    }
    
    // Setters
    public void setOponente(String oponente) {
        this.oponente = oponente;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public void setLocalidades(ArrayList<Localidad> localidades){
        this.localidades = localidades;
    }
    
    public void setServicios(ArrayList<ServicioAdicionalClub> servicios){
        this.servicios = servicios;
    }
    // Getters
    public String getOponente() {
        return oponente;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public String getHoraCierre() {
        return horaCierre;
    }
    
    public ArrayList<Localidad> getLocalidades(){
        return localidades;
    }
    
    public ArrayList<ServicioAdicionalClub> getServicios(){
        return servicios;
    }
    
}

