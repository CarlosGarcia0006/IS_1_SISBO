

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class EventoDeportivoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EventoDeportivoTest
{
    /**
     * Default constructor for test class EventoDeportivoTest
     */
    public EventoDeportivoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testCreacionDeEvento() {
        EventoDeportivo evento = new EventoDeportivo("Millonarios FC", "Estadio el Campín", "10/05/2024", "18:00", "21:00");

        // Verificar los valores actualizados
        assertEquals("Millonarios FC", evento.getOponente());
        assertEquals("Estadio el Campín", evento.getEstadio());
        assertEquals("10/05/2024", evento.getFecha());
        assertEquals("18:00", evento.getHoraIngreso());
        assertEquals("21:00", evento.getHoraCierre());
    }
    
    @Test
    public void testAñadirLocalidad() {
        EventoDeportivo evento = new EventoDeportivo("Millonarios FC", "Estadio el Campín", "10/05/2024", "18:00", "21:00");

        evento.añadirLocalidad("Sur", 120000, 200);

        // Verificar que se haya añadido la localidad correctamente
        ArrayList<Localidad> localidades = evento.getLocalidades();
        assertEquals(1, localidades.size());
        assertEquals("Sur", localidades.get(0).getNombre());
    }

    @Test
    public void testAñadirServicioAdicional() {
        EventoDeportivo evento = new EventoDeportivo("Millonarios FC", "Estadio el Campín", "10/05/2024", "18:00", "21:00");

        evento.añadirServicioAdicional("Camiseta del Club", "Camiseta oficial del club", 25000, 5);

        // Verificar que se haya añadido el servicio adicional correctamente
        ArrayList<ServicioAdicionalClub> servicios = evento.getServicios();
        assertEquals(1, servicios.size());
        assertEquals("Camiseta del Club", servicios.get(0).getNombre());
        assertEquals("Camiseta oficial del club", servicios.get(0).getDescripcion());
        assertEquals(25000, servicios.get(0).getPrecio());
    }
}
