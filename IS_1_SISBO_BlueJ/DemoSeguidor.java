
/**
 * Write a description of class Main here.
 * 
 * @author (Carlos, Juan) 
 * @version (04/05/2024)
 */
public class DemoSeguidor
{
    /**
     * Este metodo permite ver la funcionalidad de la clase seguidor en el proceso de varios casos de uso como comprar boletas o vender sus boletas en el mercado secundario.
     */
    public static void main(String[] args)
    {
        // Para efectos de poder generar las funcionalidades, se hará la creacion de un club, un evento, varias localidades y servicios adicionales.
        Club club = new Club("Atletico Bucaramanga", "AtleticoBga@gmail.com", "Estadio Alfonso Lopez");

        club.crearEventoDeportivo("Millonarios FC", "Estadio el Campín", "10/05/2024", "18:00", "21:00");
        
        club.getEvento(0).añadirLocalidad("Sur", 120000, 200);
        club.getEvento(0).añadirLocalidad("Norte", 100000, 250);
        
        club.crearServicioAdicional(0, "Camiseta del Club", "Camiseta oficial del club", 25000, 5);
        club.crearServicioAdicional(0, "Gorra del Club", "Gorra oficial del club", 15000, 10);

        
        // Se crea un Seguidor
        Seguidor seguidor = new Seguidor("2210074", "Carlos Garcia", "carlos@gmail.com", "admin1234");
        
        // Se compran dos boletas para el evento Vs millonarios FC en la localidad Sur.
        seguidor.comprarBoleta(club.getEvento(0), 0);
        seguidor.comprarBoleta(club.getEvento(0), 0);
        
        // Se compra un servicio adicional para el evento, en este caso, ua camisa.
        seguidor.comprarServicioAdicional(club.getEvento(0), 0);
        
        
        // Mostrar boletas compradas por el seguidor
        System.out.println("Boletas Compradas por " + seguidor.getNombre() + ":");
        for (Boleta boleta : seguidor.getBoletasCompradas()) {
            System.out.println("- Partido Vs. " + boleta.getEvento().getOponente() + ", Localidad: " + boleta.getLocalidad().getNombre());
        }

        // Se vende una boleta del seguidor en el mercado secundario
        if (!seguidor.getBoletasCompradas().isEmpty()) {
            System.out.println("Boleta puesta en venta: Partido Vs. " + seguidor.getBoletasCompradas().get(0).getEvento().getOponente() + ", Localidad: " + seguidor.getBoletasCompradas().get(0).getLocalidad().getNombre());
            seguidor.venderBoleta(0); // Vender la primera boleta en el inventario
            System.out.println("Boletas restantes:");
            for (Boleta boleta : seguidor.getBoletasCompradas()) {
                System.out.println("- Partido Vs. " + boleta.getEvento().getOponente() + ", Localidad: " + boleta.getLocalidad().getNombre());
            }
        }

        // Transferir una boleta a otro seguidor
        Seguidor otroSeguidor = new Seguidor("123456", "María", "maria@gmail.com", "1234");
        if (!seguidor.getBoletasCompradas().isEmpty()) {
            
            seguidor.transferirBoleta(otroSeguidor, 0); // Transferir la primera boleta al otro seguidor
            System.out.println("Boleta transferida a: " + otroSeguidor.getNombre());
        }
    }
}
