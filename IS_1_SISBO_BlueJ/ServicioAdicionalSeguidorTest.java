

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ServicioAdicionalSeguidorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ServicioAdicionalSeguidorTest
{
    /**
     * Default constructor for test class ServicioAdicionalSeguidorTest
     */
    public ServicioAdicionalSeguidorTest()
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
    public void testCrearObjetoServicio(){
        ServicioAdicionalSeguidor servicio = new ServicioAdicionalSeguidor("Gorra", "Gorra oficial");

        // Verificar que los valores se asignen correctamente a través del constructor y los getters
        assertEquals("Gorra", servicio.getNombre());
        assertEquals("Gorra oficial", servicio.getDescripcion());
    }
}
