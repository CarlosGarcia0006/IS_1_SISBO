

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BoletaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BoletaTest
{
    /**
     * Default constructor for test class BoletaTest
     */
    public BoletaTest()
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
    public void testCrearBoleta() {
        EventoDeportivo evento = new EventoDeportivo("Millonarios FC", "Estadio el Campín", "10/05/2024", "18:00", "21:00");
        Localidad localidad = new Localidad("Sur", 120000, 200, evento);
        Boleta boleta = new Boleta(120000, evento, localidad);

        // Verificar los parametros
        assertEquals(120000, boleta.getPrecio());
        assertEquals(evento, boleta.getEvento());
        assertEquals(localidad, boleta.getLocalidad());
    }
}
