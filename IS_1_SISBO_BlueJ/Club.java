import java.util.ArrayList;

/**
 * El club es el encargado de crear eventos deportivos y tiene a su disposicion diversa informacion sobre los mismos, además puede crear servicios adicionales que ofrecerá
 * en determinado evento deportivo y puede vincular usuarios para enviarles notificaciones.
 * 
 * @author (Carlos, Juan) 
 * @version (01/05/2024)
 */


public class Club
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String correoElectronico;
    private String estadioPropio;
    private ArrayList<EventoDeportivo> eventos;
    private ArrayList<String> correosVinculados;
    /**
     * Constructor vacio.
     */
    public Club()
    {
        // initialise instance variables

    }

    /**
     * Constructor completo.
     * 
     * @param nombre    El nombre del club
     * @param correoElectrónico     Algún correo electrónico vinculado al club
     * @param estadioPropio         El nombre del estadio en el que juega de local.
     */
    public Club(String nombre, String correoElectronico, String estadioPropio)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.estadioPropio = estadioPropio;
        this.eventos = new ArrayList();
        this.correosVinculados = new ArrayList();
    }

    /**
     * El método crearEventoDeportivo se encarga de, con los atributos recibidos, de añadir un evento deportivo al arraylist "eventos", en esta clase.
     * @param oponente      el nombre del equipo al que se enfrentará.
     * @param estadio       el nombre del estadio donde será el partido.
     * @param fecha         la fecha en la que se realizará el partido
     * @param horaIngreso   la hora a la que se abrirán las puertas
     * @param horaCierre    la hora a la que se terminará el evento
     */
    public void crearEventoDeportivo(String oponente, String estadio, String fecha, String horaIngreso, String horaCierre){

        EventoDeportivo evento = new EventoDeportivo(oponente,estadio,fecha,horaIngreso,horaCierre);
        eventos.add(evento);
        System.out.println("Se ha añadido el evento deportivo de "+nombre+" vs "+oponente+" en "+estadio);

    }

    /**
     * Este método se encarga de mostrar en la terminal la cantidad de boletas vendidas para cada una de las localidades,
     * si el evento no tiene localidades, muestra un mensaje indicando esto en la terminal.
     * 
     * @param eventoDeportivo   El índice del evento deportivo que se desea consultar
     * 
     */
    public void consultarCantidadDeBoletasVendidas(int eventoDeportivo){

        EventoDeportivo evento = eventos.get(eventoDeportivo);
        ArrayList<Localidad> localidades = evento.getLocalidades();
        if (!localidades.isEmpty()){
            for (Localidad loc : localidades){
                int total = loc.getCantidadPuestosTotal();
                int vendidos = loc.getCantidadPuestosVendidos();
                int disponibles = total-vendidos;
                System.out.println("La localidad "+loc.getNombre()+":\n Total:"+total+"\n Vendidos:"+vendidos+"\n Disponibles:"+disponibles+"\n\n");
            }
        }else{
            System.out.println("El evento no tiene localidades asignadas.");
        }
    }
    
    /**
     * El método crearServicioAdicional, crea y vincula un servicio adicional al evento deportivo que se desee.
     * @param eventoDeportivo   El índice del evento deportivo al que desea 
     * @param name              El nombre del servicio adicional              
     * @param desc              La descripción del servicio adicional
     * @param price             El precio del servicio adicional
     * @param max               Las unidades máximas por cliente que se pondrán en el servicio adicional.
     */
    public void crearServicioAdicional(int eventoDeportivo, String name, String desc, int price, int max){
        EventoDeportivo evento = eventos.get(eventoDeportivo);
        evento.añadirServicioAdicional(name,desc,price,max);
    }
    
    /**
     * El método vincularSeguidor está hecha para llamarse desde la pestaña de pago, donde si el usuario
     * desea vincularse al club, su correo se añadirá a los correos guardados por el club.
     * 
     * @param correo    El correo del seguidor que desea vincularse.
     */
    
    public void vincularSeguidor(String correo){
    
        correosVinculados.add(correo);
    
    }
    
    
    /**
     * El método notificarSeguidores recorre todo el arreglo de correos vinculados al club y les notifica.
     * versión 1.0. Por el momento no se hace nada con el mensaje.
     * 
     * @param mensaje   El mensaje que se desea enviar.
     */
    public void notificarSeguidores(String mensaje){
        for (String correo: correosVinculados){
            System.out.println("El correo "+correo+" ha sido notificado correctamente.");
    
        }
        System.out.println("Todas las notificaciones fueron enviadas con éxito.");    
    }
    
    
    public String getNombre(){
        return nombre;
    }

    public String getCorreo(){
        return correoElectronico;
    }

    public String getEstadio(){
        return estadioPropio;
    }
    
    public ArrayList<String> getCorreosVinculados(){
    
        return correosVinculados;
    
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCorreo(String correo){
        this.correoElectronico = correo;
    }

    public void setEstadio(String estadio){
        this.estadioPropio = estadio;
    }
    
    public void setCorreosVinculados(ArrayList<String> correos){
        this.correosVinculados = correos;
    }
}
