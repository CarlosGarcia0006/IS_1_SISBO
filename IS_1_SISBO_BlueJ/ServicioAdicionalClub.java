
/**
 * Write a description of class ServicioAdicionalClub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ServicioAdicionalClub extends ServicioAdicional
{
    // instance variables - replace the example below with your own
    private int precio;
    private int unidadesMaximas;
    private int unidadesVendidas;
    /**
     * Constructor for objects of class ServicioAdicionalClub
     */
    public ServicioAdicionalClub(String nombre, String descripción, int precio, int unidadesMaximas)
    {
        super(nombre,descripción);
        this.precio = precio;
        this.unidadesMaximas = unidadesMaximas;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setUnidadesMaximas(int unidadesMaximas) {
        this.unidadesMaximas = unidadesMaximas;
    }
    
    public boolean puedeVender(){
        boolean bool = false;
        if (unidadesVendidas < unidadesMaximas){
            bool = true;
        }
        return bool;
    }
    
    public void aumentarVendidas(){
        unidadesVendidas++;
    }
}
