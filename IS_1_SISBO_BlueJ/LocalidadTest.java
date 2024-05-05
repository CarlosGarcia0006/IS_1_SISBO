
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LocalidadTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LocalidadTest
{
    /**
     * Default constructor for test class LocalidadTest
     */
    public LocalidadTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    EventoDeportivo evento;
    
    @BeforeEach
    public void setUp()
    {
        EventoDeportivo evento = new EventoDeportivo("Millonarios", "Estadio el campin", "01/01/2025", "18:00", "20:00");
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
    public void testCrearLocalidadDatosCorrectos() {
        
        // Crear una localidad con datos correctos
        Localidad localidad = new Localidad("Sur", 120000, 200, evento);
        
        // Verificar que los atributos de la localidad fueron seteados correctamente
        assertEquals("Sur", localidad.getNombre());
        assertEquals(120000, localidad.getPrecio());
        assertEquals(200, localidad.getCantidadPuestosTotal());
        assertEquals(0, localidad.getCantidadPuestosVendidos());
        assertEquals(evento, localidad.getEventoDeportivo());     
    }
    
    @Test
    public void testCrearLocalidadConDatosIncorrectos() {

        // Intentar crear una localidad con datos incorrectos (precio negativo)
        try {
            Localidad localidad = new Localidad("Norte", -500, 200, evento);
            fail("Debería lanzar una excepción IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Verificar que la excepción fue lanzada correctamente
            assertEquals("Los datos para la creación de la localidad son incorrectos", e.getMessage());
        }
    }
    
    @Test
    public void testGenerarBoleta() {
        Localidad localidad = new Localidad("Norte", 100000, 1, evento);
        
        // Verificar que se genera una boleta correctamente si la localidad puede generar una boleta
        Boleta boleta = localidad.generarBoleta();
        assertNotNull(boleta);
        assertEquals(evento, localidad.getEventoDeportivo());
        assertEquals(localidad, boleta.getLocalidad());
        assertEquals(1, localidad.getCantidadPuestosVendidos());
        
        // Intentar generar otra boleta cuando la localidad ya alcanzó su límite
        Boleta boleta2 = localidad.generarBoleta();
        assertNull(boleta2);
    }
    
    @Test
    public void testPuedeGenerar() {
        Localidad localidad = new Localidad("Norte", 100000, 150, evento);
        
        // Verificar que puede generar una boleta cuando no ha alcanzado su límite
        assertTrue(localidad.puedeGenerar());
        
        // Generar boletas hasta alcanzar el límite
        for (int i = 0; i < 150; i++) {
            localidad.generarBoleta();
        }
        
        // Verificar que no puede generar más boletas una vez alcanzado el límite
        assertFalse(localidad.puedeGenerar());
    }
}
