import java.util.ArrayList;
/**
 * Write a description of class MercadoPrincipal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MercadoPrincipal
{
    private ArrayList<Boleta> boletas;
    private int precio;

    /**
     * Constructor for objects of class MercadoPrincipal
     */
    public MercadoPrincipal(int precio)
    {
        this.precio = precio;
        boletas = new ArrayList();
    }

}
