

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class SeguidorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SeguidorTest
{
    /**
     * Default constructor for test class SeguidorTest
     */
    public SeguidorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    private EventoDeportivo evento;
    private Seguidor seguidor;

    @BeforeEach
    public void setUp() {
        evento = new EventoDeportivo("Millonarios FC", "Estadio el Campín", "10/05/2024", "18:00", "21:00");
        seguidor = new Seguidor("12345678", "Juan Sepu", "Juan@gmail.com", "admin1234");
        evento.añadirLocalidad("Norte", 120000, 100);
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
    public void testComprarBoleta() {
        seguidor.comprarBoleta(evento, 0);
        ArrayList<Boleta> boletasCompradas = seguidor.getBoletasCompradas();
        assertEquals(1, boletasCompradas.size());
    }

    @Test
    public void testVenderBoleta() {
        seguidor.comprarBoleta(evento, 0);
        seguidor.venderBoleta(0);
        ArrayList<Boleta> boletasEnVenta = seguidor.getBoletasEnVenta();
        assertEquals(1, boletasEnVenta.size());
    }
    
    @Test
    public void testComprarServicioAdicional() {
        evento.añadirServicioAdicional("Camiseta del Club", "Camiseta oficial del club", 25000, 5);
        seguidor.comprarServicioAdicional(evento, 0);
        ArrayList<ServicioAdicionalSeguidor> servicios = seguidor.getServicios();
        assertEquals(1, servicios.size());
    }

    @Test
    public void testTransferirBoleta() {
        Seguidor otroSeguidor = new Seguidor("987654321", "Carlos Garcia", "carlos@gmail.com", "admin123");
        seguidor.comprarBoleta(evento, 0);
        seguidor.transferirBoleta(otroSeguidor, 0);
        assertEquals(1, otroSeguidor.getBoletasCompradas().size());
    }
}
