

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * The test class ClubTest.
 *
 * @author  (Carlos, Juan)
 * @version (04/05/2024)
 */
public class ClubTest
{
    /**
     * Default constructor for test class ClubTest
     */
    public ClubTest()
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
    public void testName()
    {
        Club club1 = new Club("AB", "AB@gmail.com", "Alfonso Lopez");
        assertEquals("AB", club1.getNombre());
    }

    @Test
    public void testAgregarEvento()
    {
        Club club1 = new Club("AB", "AB@gmail.com", "Alfonso Lopez");
        club1.crearEventoDeportivo("Millonarios FC", "Estadio el Campin", "10/05/2024", "18:00", "21:00");
        
        ArrayList<EventoDeportivo> eventos = club1.getEventos();
        assertEquals(1, eventos.size());
        assertEquals("Millonarios FC", eventos.get(0).getOponente());
        assertEquals("Estadio el Campin", eventos.get(0).getEstadio());
    }
    
    @Test
    public void testVincularSeguidor() 
    {
        Club club1 = new Club("AB", "AB@gmail.com", "Alfonso Lopez");

        club1.vincularSeguidor("carlos@gmail.com");
        club1.vincularSeguidor("juan@gmail.com");

        ArrayList<String> correosVinculados = club1.getCorreosVinculados();
        assertEquals(2, correosVinculados.size());
        assertTrue(correosVinculados.contains("carlos@gmail.com"));
        assertTrue(correosVinculados.contains("juan@gmail.com"));
        
        
    }
    
    @Test
    public void testConsultarCantidadDeBoletas() {
        Club club1 = new Club("AB", "AB@gmail.com", "Alfonso Lopez");
        
        assertEquals("El evento buscado no existe", club1.consultarCantidadDeBoletasVendidas(0));
        
        club1.crearEventoDeportivo("Millonarios FC", "Estadio el Campin", "10/05/2024", "18:00", "21:00");

        assertEquals("El evento no tiene localidades asignadas.", club1.consultarCantidadDeBoletasVendidas(0));
        
        club1.getEvento(0).añadirLocalidad("Sur", 120000, 100);
        club1.getEvento(0).añadirLocalidad("Norte", 100000, 50);
        
        String resultado = club1.consultarCantidadDeBoletasVendidas(0);

        // Verificar que el resultado contiene información de las localidades
        assertTrue(resultado.contains("Sur"));
    }
    
    @Test
    public void testAgregarServicioAdicional() {
        Club club1 = new Club("AB", "AB@gmail.com", "Alfonso Lopez");
        club1.crearEventoDeportivo("Millonarios FC", "Estadio el Campin", "10/05/2024", "18:00", "21:00");

        club1.crearServicioAdicional(0, "Camisetas", "camisetas oficiales", 85000, 5);

        ServicioAdicionalClub servicioAd = club1.getEvento(0).getServicios().get(0);
        // Verificar que el resultado contiene información de las localidades
        assertEquals("Camisetas", servicioAd.getNombre());
    }
}


