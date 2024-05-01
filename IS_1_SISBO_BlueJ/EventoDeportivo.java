
/**
 * Write a description of class Evento_deportivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class EventoDeportivo {
    private String oponente;
    private String estadio;
    private String fecha;
    private String horaIngreso;
    private String horaCierre;
    private ArrayList<Localidad> localidades;
    private ArrayList<ServicioAdicional> servicios;

    // Constructor
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
    
        ServicioAdicional serv = new ServicioAdicional(name,desc,price,max);
        servicios.add(serv);
        System.out.println("Se ha añadido el servicio "+name+" al evento vs "+oponente);
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
    
    public void setServicios(ArrayList<ServicioAdicional> servicios){
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
    
    public ArrayList<ServicioAdicional> getServicios(){
        return servicios;
    }
    
}

