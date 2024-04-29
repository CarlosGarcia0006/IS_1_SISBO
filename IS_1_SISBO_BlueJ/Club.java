
/**
 * El club es el encargado de crear eventos deportivos y tiene a su disposicion diversa informacion sobre los mismos.
 * 
 * @author (Carlos) 
 * @version (29/04/2024)
 */
public class Club
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String correoElectronico;
    private String estadioPropio;

    /**
     * Constructor vacio.
     */
    public Club()
    {
        // initialise instance variables
        
    }
    
    /**
     * Constructor completo.
     */
    public Club(String nombre, String correoElectronico, String estadioPropio)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.estadioPropio = estadioPropio;
    }

    /*Por hacer aun */
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCorreo(){
        return correoElectronico;
    }
    
    public String getEstadio(){
        return estadioPropio;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCorreo(String correo){
        this.correoElectronico = correo;
    }
    
    public void setEstadio(String estadio){
        this.estadioPropio = estadio;
    }
}
