

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ServicioAdicionalClubTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ServicioAdicionalClubTest
{
    /**
     * Default constructor for test class ServicioAdicionalClubTest
     */
    public ServicioAdicionalClubTest()
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
    public void testCrearServicio() {
        ServicioAdicionalClub servicio = new ServicioAdicionalClub("Camiseta", "Camiseta oficial", 25000, 5);

        // Verificar los valores iniciales después de la creación
        assertEquals("Camiseta", servicio.getNombre());
        assertEquals("Camiseta oficial", servicio.getDescripcion());
        assertEquals(25000, servicio.getPrecio());
        assertEquals(5, servicio.getUnidadesMaximas());
    }

    @Test
    public void testPuedeVender() {
        ServicioAdicionalClub servicio = new ServicioAdicionalClub("Bufanda", "Bufanda oficial", 15000, 10);
        
        servicio.aumentarVendidas(); 
        assertTrue(servicio.puedeVender());

        // Llenar las unidades vendidas hasta el máximo
        for (int i = 0; i < 8; i++) {
            servicio.aumentarVendidas();
        }
        assertTrue(servicio.puedeVender()); // Todavía puede vender una más

        // Intentar vender más allá de las unidades máximas
        servicio.aumentarVendidas(); // Llega a 10
        assertFalse(servicio.puedeVender()); // Ya no puede vender más
    }

}
