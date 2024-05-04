
/**
 * Write a description of class Main here.
 * 
 * @author (Carlos, Juan) 
 * @version (04/05/2024)
 */
public class DemoClub
{
    /**
     * Este metodo permite ver las funcionalidades respectivas del club, como crear eventos con distintas localidades, vincular aficionados, publicar servicios adicionales y mostrar informacion detallada del club y sus eventos.
     */
    public static void main(String[] args) {
        // Se crea un club
        Club club = new Club("Atletico Bucaramanga", "AtleticoBga@gmail.com", "Estadio Alfonso Lopez");

        // Se añade un evento deportivo contra millonarios FC
        club.crearEventoDeportivo("Millonarios FC", "Estadio el Campín", "10/05/2024", "18:00", "21:00");

        // Se crean localidades para el evento
        club.getEvento(0).añadirLocalidad("Sur", 120000, 200);
        club.getEvento(0).añadirLocalidad("Norte", 100000, 250);
        
        // Se consulta la cantidad de boletas vendidas por localidad
        club.consultarCantidadDeBoletasVendidas(0);

        // Se añaden servicios adicionales
        club.crearServicioAdicional(0, "Camiseta del Club", "Camiseta oficial del club", 25000, 5);
        club.crearServicioAdicional(0, "Gorra del Club", "Gorra oficial del club", 15000, 10);

        // Se vincula un seguidor al club
        club.vincularSeguidor("carlos@gmail.com");
        club.vincularSeguidor("juan@gmail.com");

        // Notificar a todos los seguidores del club
        club.notificarSeguidores("¡Participa en nuestro próximo evento!");

        // Mostrar información del club
        System.out.println("Nombre del Club: " + club.getNombre());
        System.out.println("Correo Electrónico: " + club.getCorreo());
        System.out.println("Estadio Propio: " + club.getEstadio());
        System.out.println("Correos Vinculados:");
        for (String correo : club.getCorreosVinculados()) {
            System.out.println("- " + correo);
        }
        System.out.println("Eventos proximos:");
        for (EventoDeportivo evento : club.getEventos()) {
            System.out.println("- Vs." + evento.getOponente());
        }
    }
}
