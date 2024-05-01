
/**
 * Write a description of class Boleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boleta {
    private int precio;
    private EventoDeportivo evento;
    private Localidad localidad;

    // Constructor
    public Boleta(int precio, EventoDeportivo evento, Localidad localidad) {
        this.precio = precio;
        this.evento = evento;
        this.localidad = localidad;
    }

    // Setter para precio
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Getter para precio
    public int getPrecio() {
        return precio;
    }

    // Setter para evento
    public void setEvento(EventoDeportivo evento) {
        this.evento = evento;
    }

    // Getter para evento
    public EventoDeportivo getEvento() {
        return evento;
    }
    
    public void setLocalidad (Localidad localidad){
        this.localidad = localidad;
    }
    
    public Localidad getLocalidad(){
        return localidad;
    }
}

