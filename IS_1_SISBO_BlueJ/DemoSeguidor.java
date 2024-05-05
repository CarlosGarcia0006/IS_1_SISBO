import java.util.Scanner;

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
    
    public static void main(String[] args) {
        // Para efectos de poder generar las funcionalidades, se hará la creacion de un club, un evento, varias localidades y servicios adicionales.
        Club club = new Club("Atletico Bucaramanga", "AtleticoBga@gmail.com", "Estadio Alfonso Lopez");

        club.crearEventoDeportivo("Millonarios FC", "Estadio el Campín", "10/05/2024", "18:00", "21:00");
        
        club.getEvento(0).añadirLocalidad("Sur", 120000, 200);
        club.getEvento(0).añadirLocalidad("Norte", 100000, 250);
        
        club.crearServicioAdicional(0, "Camiseta del Club", "Camiseta oficial del club", 25000, 5);
        club.crearServicioAdicional(0, "Gorra del Club", "Gorra oficial del club", 15000, 10);
        System.out.println();
        // Se crea un Seguidor
        Seguidor seguidor = new Seguidor("2210074", "Carlos Garcia", "carlos@gmail.com", "admin1234");
        Seguidor seguidor2 = new Seguidor("12315", "Juan Sepulveda", "Juan@gmail.com", "12345678");
        
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("### Menú del Seguidor ###");
            System.out.println("1. Comprar boleta");
            System.out.println("2. Comprar servicio adicional");
            System.out.println("3. Vender boleta en mercado secundario");
            System.out.println("4. Transferir boleta a otro seguidor");
            System.out.println("5. Mostrar boletas compradas por seguidor");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                
                case 1:
                    // Comprar boleta
                    if (club.getEventos().isEmpty()) {
                        System.out.println("No hay eventos creados. Cree un evento primero.");
                        break;
                    }
                    System.out.println("Eventos disponibles:");
                    for (int i = 0; i < club.getEventos().size(); i++) {
                        System.out.println(i + ". Vs. " + club.getEventos().get(i).getOponente());
                    }
                    System.out.print("Seleccione el índice del evento: ");
                    int indiceEvento = scanner.nextInt();
                    
                    System.out.println("Localidades disponibles para partido Vs. " + club.getEventos().get(indiceEvento).getOponente());
                    for (int i = 0; i < club.getEventos().size(); i++) {
                        System.out.println(i + ". Localidad. " + club.getEvento(indiceEvento).getLocalidades().get(i).getNombre());
                    }
                    System.out.print("Seleccione el índice de la localidad: ");
                    int indiceLocalidad = scanner.nextInt();
                    
                    seguidor.comprarBoleta(club.getEvento(indiceEvento), indiceLocalidad);
                    break;

                case 2:
                    // Comprar servicio adicional
                    if (seguidor.getBoletasCompradas().isEmpty()) {
                        System.out.println("No hay eventos disponibles para comprar servicios adicionales.");
                        break;
                    }
                    System.out.println("Eventos disponibles:");
                    for (int i = 0; i < seguidor.getBoletasCompradas().size(); i++) {
                        System.out.println(i + ". Vs. " + seguidor.getBoletasCompradas().get(i).getEvento().getOponente());
                    }
                    System.out.print("Seleccione el índice del evento: ");
                    int indiceEventoServicio = scanner.nextInt();
                    
                    System.out.println("Servicios disponibles:");
                    for (int i = 0; i < club.getEvento(indiceEventoServicio).getServicios().size(); i++) {
                        System.out.println(i + ". " + club.getEvento(indiceEventoServicio).getServicios().get(i).getDescripcion());
                    }
                    System.out.print("Seleccione el índice del servicio que desea: ");
                    int indiceServicio = scanner.nextInt();
                    
                    seguidor.comprarServicioAdicional(club.getEvento(indiceEventoServicio), indiceServicio);
                    
                    break;

                case 3:
                    // Vender boleta en mercado secundario
                    if (seguidor == null || seguidor.getBoletasCompradas().isEmpty()) {
                        System.out.println("No tiene boletas compradas para vender.");
                        break;
                    }
                    
                    System.out.println("Boletas en su poder:");
                    for (int i = 0; i < seguidor.getBoletasCompradas().size(); i++) {
                        System.out.println(i + ". Vs. " + seguidor.getBoletasCompradas().get(i).getEvento().getOponente());
                    }
                    System.out.print("Seleccione la boleta que desea vender: ");
                    int indiceBoletaVender = scanner.nextInt();
                    
                    seguidor.venderBoleta(indiceBoletaVender); // Vender la primera boleta en el inventario
                    break;

                case 4:
                    // Transferir boleta a otro seguidor
                    if (seguidor == null || seguidor.getBoletasCompradas().isEmpty()) {
                        System.out.println("No tiene boletas compradas para transferir.");
                        break;
                    }
                    
                    System.out.println("Boletas en su poder:");
                    for (int i = 0; i < seguidor.getBoletasCompradas().size(); i++) {
                        System.out.println(i + ". Vs. " + seguidor.getBoletasCompradas().get(i).getEvento().getOponente());
                    }
                    System.out.print("Seleccione la boleta que desea transferir: ");
                    int indiceBoletaTransferir = scanner.nextInt();
                    
                    if (seguidor.getBoletasCompradas().get(indiceBoletaTransferir) == null) {
                        System.out.println("La boleta seleccionada no existe.");
                        break;
                    }
                    
                    System.out.print("Ingrese el correo del destinatario: ");
                    String correoDestinatario = scanner.next();
                    
                    if (seguidor2.getCorreo() == null) {
                        System.out.println("El destinatario no existe.");
                        break;
                    }
                    
                    seguidor.transferirBoleta(seguidor2, indiceBoletaTransferir); // Transferir la primera boleta al otro seguidor
                    break;

                case 5:
                    // Mostrar boletas compradas por seguidor
                    if (seguidor == null || seguidor.getBoletasCompradas().isEmpty()) {
                        System.out.println("No tiene boletas compradas.");
                        break;
                    }
                    System.out.println("Boletas compradas por " + seguidor.getNombre() + ":");
                    for (Boleta boleta : seguidor.getBoletasCompradas()) {
                        System.out.println("- Partido Vs. " + boleta.getEvento().getOponente() + ", Localidad: " + boleta.getLocalidad().getNombre());
                    }
                    break;

                case 0:
                    // Salir del programa
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println(); // Separador entre iteraciones del menú
        }

        scanner.close();
    }
    
    public static void DemoRapido()
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
