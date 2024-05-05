import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("### Menú del Club ###");
            System.out.println("1. Añadir evento deportivo");
            System.out.println("2. Añadir localidad a un evento deportivo");
            System.out.println("3. Consultar boletas vendidas por localidad");
            System.out.println("4. Añadir servicio adicional a un evento");
            System.out.println("5. Vincular seguidor al club");
            System.out.println("6. Notificar a los seguidores");
            System.out.println("7. Mostrar información del club");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Añadir evento deportivo
                    System.out.println("Ingrese los detalles del evento deportivo:");
                    System.out.print("Oponente: ");
                    String oponente = scanner.next();
                    System.out.print("Estadio: ");
                    String estadio = scanner.next();
                    System.out.print("Fecha (dd/mm/yyyy): ");
                    String fecha = scanner.next();
                    System.out.print("Hora de ingreso (HH:mm): ");
                    String horaIngreso = scanner.next();
                    System.out.print("Hora de cierre (HH:mm): ");
                    String horaCierre = scanner.next();
                    club.crearEventoDeportivo(oponente, estadio, fecha, horaIngreso, horaCierre);
                    break;
                    
                case 2:
                    System.out.print("Ingrese el índice del evento deportivo: ");
                    scanner.nextLine();
                    int indiceEventoP2 = scanner.nextInt();
                    
                    if(club.getEvento(indiceEventoP2)!=null){
                        System.out.print("Nombre de la localidad: ");
                        String localidad = scanner.next();
                        System.out.print("Precio de las entradas: ");
                        scanner.nextLine();
                        int precio = scanner.nextInt();
                        System.out.print("Entradas disponibles: ");
                        scanner.nextLine();
                        int entradas = scanner.nextInt();
                    
                        club.getEvento(indiceEventoP2).añadirLocalidad(localidad, precio, entradas);
                    }
                    break;

                case 3:
                    // Consultar boletas vendidas por localidad
                    System.out.print("Ingrese el índice del evento deportivo: ");
                    scanner.nextLine();
                    int indiceEvento = scanner.nextInt();
                    System.out.println(club.consultarCantidadDeBoletasVendidas(indiceEvento));
                    break;

                case 4:
                    // Añadir servicio adicional a un evento
                    System.out.print("Ingrese el índice del evento deportivo: ");
                        int indiceEventoServicio = scanner.nextInt();
                        System.out.print("Nombre del servicio adicional: ");
                        scanner.nextLine(); // Limpiar el buffer antes de leer una cadena
                        String nombreServicio = scanner.nextLine();
                        System.out.print("Descripción del servicio adicional: ");
                        String descripcionServicio = scanner.nextLine();
                        System.out.print("Precio del servicio adicional: ");
                        int precioServicio = scanner.nextInt();
                        System.out.print("Máximo de unidades por cliente: ");
                        int maxUnidades = scanner.nextInt();
                        club.crearServicioAdicional(indiceEventoServicio, nombreServicio, descripcionServicio, precioServicio, maxUnidades);
                        break;

                case 5:
                    // Vincular seguidor al club
                    System.out.print("Ingrese el correo del seguidor que desea vincular: ");
                    String correoSeguidor = scanner.next();
                    club.vincularSeguidor(correoSeguidor);
                    break;

                case 6:
                    // Notificar a los seguidores
                    System.out.print("Ingrese el mensaje a notificar a los seguidores: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String mensajeNotificacion = scanner.nextLine();
                    club.notificarSeguidores(mensajeNotificacion);
                    break;

                case 7:
                    // Mostrar información del club
                    System.out.println("Nombre del Club: " + club.getNombre());
                    System.out.println("Correo Electrónico: " + club.getCorreo());
                    System.out.println("Estadio Propio: " + club.getEstadio());
                    System.out.println("Correos Vinculados:");
                    for (String correo : club.getCorreosVinculados()) {
                        System.out.println("- " + correo);
                    }
                    System.out.println("Eventos próximos:");
                    for (EventoDeportivo evento : club.getEventos()) {
                        System.out.println("- Vs." + evento.getOponente());
                    }
                    break;

                case 0:
                    // Salir del menú
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

            System.out.println(); // Salto de línea para separar las iteraciones del menú
        }
        scanner.close();
    }
    
    public static void DemoRapido() {
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
        System.out.println("\nNombre del Club: " + club.getNombre());
        System.out.println("Correo Electrónico: " + club.getCorreo());
        System.out.println("Estadio Propio: " + club.getEstadio() + "\n");
        System.out.println("Correos Vinculados:");
        for (String correo : club.getCorreosVinculados()) {
            System.out.println("- " + correo);
        }
        System.out.println("Eventos proximos:");
        for (EventoDeportivo evento : club.getEventos()) {
            System.out.println("- Vs." + evento.getOponente() + "\n");
        }
    }
}
