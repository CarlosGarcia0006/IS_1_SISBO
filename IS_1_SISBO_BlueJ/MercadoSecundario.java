import java.util.ArrayList;
/**
 * Write a description of class Mercado_secundario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MercadoSecundario
{
    private ArrayList<Boleta> boletas;
    // Constructor
    public MercadoSecundario() {
        boletas = new ArrayList();
    }    
    
    
    public void setBoletas(ArrayList<Boleta> boletas){
    
        this.boletas = boletas;
    
    }
    
    public ArrayList<Boleta> getBoletas(ArrayList<Boleta> boletas){
    
        return boletas;
        
    }
    
    public void añadirBoleta(Boleta boleta){
    
        boletas.add(boleta);
    
    }
    
}

