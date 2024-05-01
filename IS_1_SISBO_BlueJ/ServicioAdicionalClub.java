
/**
 * La clase ServicioAdicionalClub hereda a ServicioAdicional, añadiendo además dos atributos 
 * relacionados al precio, a las unidades maximas y a las unidades vendidas.
 * 
 * @author (Carlos, Juan) 
 * @version (01/05/2024)
 */
public class ServicioAdicionalClub extends ServicioAdicional
{
    // instance variables - replace the example below with your own
    private int precio;
    private int unidadesMaximas;
    private int unidadesVendidas;
    /**
     * Constructor para la clase ServicioAdicionalClub
     * 
     * @param nombre    El nombre del servicio adicional.
     * @param descripcion   Una descripcion relacionada al servicio adicional.
     * @param precio    El precio del servicio adicional.
     * @param unidadesMaximas   El número de unidades máximas que se podrán vender.
     */
    public ServicioAdicionalClub(String nombre, String descripcion, int precio, int unidadesMaximas)
    {
        super(nombre,descripcion);
        this.precio = precio;
        this.unidadesMaximas = unidadesMaximas;
    }
    
    /**
     * El método puedeVender compara las unidades vendidas con las máximas, devolviendo true o false dependiendo del caso.
     * 
     * @return un boolean, que puede ser igual a true, si la cantidad de unidades vendidas son menores a las máximas, o false, si la cantidad de unidades vendidas son iguales o superiores a las máximas.
     */
    public boolean puedeVender(){
        boolean bool = false;
        if (unidadesVendidas < unidadesMaximas){
            bool = true;
        }
        return bool;
    }
    /**
     * El método aumentarVendidas añade uno a la cantidad de unidades vendidas del objeto.
     */
    public void aumentarVendidas(){
        unidadesVendidas++;
    }
    
    //setters
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setUnidadesMaximas(int unidadesMaximas) {
        this.unidadesMaximas = unidadesMaximas;
    }
    
    //getters
    
    public int getPrecio(){
        return precio;
    }
    
    public int getUnidadesMaximas(){
        return unidadesMaximas;
    }
}
