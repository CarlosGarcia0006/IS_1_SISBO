import java.util.ArrayList;
/**
 * Write a description of class Mercado_secundario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MercadoSecundario
{
    private int numeroBoletas;
    private ArrayList<Boleta> boletas;
    // Constructor
    public MercadoSecundario(int numeroBoletas) {
        this.numeroBoletas = numeroBoletas;
    }

    // Setter
    public void setNumeroBoletas(int numeroBoletas) {
        this.numeroBoletas = numeroBoletas;
    }

    // Getter
    public int getNumeroBoletas() {
        return numeroBoletas;
    }
}

