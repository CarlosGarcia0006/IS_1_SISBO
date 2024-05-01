
/**
 * La clase ServicioAdicionalSeguidor hereda de ServicioAdicional, a diferencia de ServicioAdicionalClub, esta no tiene métodos ni atributos propios.
 * 
 * @author (Carlos,Juan) 
 * @version (01/05/2024)
 */

public class ServicioAdicionalSeguidor extends ServicioAdicional
{

    /**
     * Constructor para la clase ServicioAdicionalSeguidor
     * 
     * @param nombre    El nombre del servicio adicional.
     * @param descripcion   Una descripción relacionada al servicio adicional.
     */
    public ServicioAdicionalSeguidor(String nombre, String descripcion)
    {
        super(nombre,descripcion);
    }
}
