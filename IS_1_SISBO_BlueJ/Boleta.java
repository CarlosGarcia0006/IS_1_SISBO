
/**
 * La clase Boleta principalmente se encarga de mantener el precio al que se encuentra (para cuestiones del mercado secundario), al igual que el evento y la localidad, estos se almacenan
 * en el objeto para mayor facilidad a la hora de desplegar la información para el seguidor en un futuro.
 * 
 * @author (Carlos,Juan) 
 * @version (01/05/2024)
 */
public class Boleta {
    private int precio;
    private EventoDeportivo evento;
    private Localidad localidad;

    /**
     * Constructor de la clase Boleta.
     * 
     * @param precio    El precio que tiene esta boleta.
     * @param evento    El evento deportivo al que pertenece.
     * @param localidad La localidad a la que pertenece.
     */
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

