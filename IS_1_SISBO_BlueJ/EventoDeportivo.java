
/**
 * Write a description of class Evento_deportivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class EventoDeportivo {
    private String oponente;
    private String estadio;
    private LocalDate fecha;
    private LocalTime horaIngreso;
    private LocalTime horaCierre;
    private int precio;

    // Constructor
    public EventoDeportivo(String oponente, String estadio, LocalDate fecha, LocalTime horaIngreso, LocalTime horaCierre, int precio) {
        this.oponente = oponente;
        this.estadio = estadio;
        this.fecha = fecha;
        this.horaIngreso = horaIngreso;
        this.horaCierre = horaCierre;
        this.precio = precio;
    }

    // Setters
    public void setOponente(String oponente) {
        this.oponente = oponente;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Getters
    public String getOponente() {
        return oponente;
    }

    public String getEstadio() {
        return estadio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public int getPrecio() {
        return precio;
    }
}

