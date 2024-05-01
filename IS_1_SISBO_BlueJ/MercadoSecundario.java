import java.util.ArrayList;
/**
 * La clase MercadoSecundario se encarga de almacenar las boletas de determinada localidad que hayan sido vendidas por un seguidor.
 * 
 * @author (Carlos, Juan) 
 * @version (01/05/2024)
 */
public class MercadoSecundario
{
    private ArrayList<Boleta> boletas;
    /**
     * El constructor de la clase MercadoSecundario.
     */
    public MercadoSecundario() {
        boletas = new ArrayList();
    }    
    
    /**
     * El método añadirBoleta permite añadir una boleta al mercado secundario,
     * este método debe únicamente ser llamado por el método venderBoleta de la clase Seguidor.
     * 
     * @param boleta    la boleta que se añadirá al mercado secundario.
     */
    public void añadirBoleta(Boleta boleta){
    
        boletas.add(boleta);
    
    }
    
    
    public void setBoletas(ArrayList<Boleta> boletas){
    
        this.boletas = boletas;
    
    }
    
    public ArrayList<Boleta> getBoletas(ArrayList<Boleta> boletas){
    
        return boletas;
        
    }
    
    
}

