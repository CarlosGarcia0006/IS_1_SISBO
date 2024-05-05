

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class MercadoSecundarioTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MercadoSecundarioTest
{
    /**
     * Default constructor for test class MercadoSecundarioTest
     */
    public MercadoSecundarioTest()
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
    public void testAñadirBoleta() {
        // Crear una boleta para utilizar en las pruebas
        EventoDeportivo evento = new EventoDeportivo("Millonarios FC", "Estadio el Campín", "10/05/2024", "18:00", "21:00");
        Localidad localidad = new Localidad("Norte", 100000, 250, evento);
        Boleta boleta = new Boleta(100000, evento, localidad);

        // Crear mercado secundario y añadir una boleta
        MercadoSecundario mercado = new MercadoSecundario();
        mercado.añadirBoleta(boleta);

        // Verificar que la boleta se haya añadido correctamente
        ArrayList<Boleta> boletas = mercado.getBoletas();
        assertEquals(1, boletas.size());
        assertEquals(boleta, boletas.get(0));
    }
}
