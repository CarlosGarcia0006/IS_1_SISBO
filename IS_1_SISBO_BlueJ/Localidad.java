
/**
 * Write a description of class Localidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Localidad {
    private String nombre;
    private int precio;
    private int cantidadPuestosTotal;
    private int cantidadPuestosVendidos;
    private MercadoSecundario mercadoSecundario;
    private EventoDeportivo evento;
    // Constructor
    public Localidad(String nombre, int precio, int cantidadPuestosTotal, EventoDeportivo evento) {
        this.nombre = nombre;
        this.cantidadPuestosTotal = cantidadPuestosTotal;
        this.precio = precio;
        this.cantidadPuestosVendidos = 0;
        this.evento = evento;
        mercadoSecundario = new MercadoSecundario();
    }
    public Boleta generarBoleta(){
        Boleta boleta = null;
        
        if(puedeGenerar()){
            boleta = new Boleta(precio,evento,this);
            cantidadPuestosVendidos++;
        }
        else{
            System.out.println("El número de boletas vendidas para esta localidad ha sido alcanzado.");
        }
            
        return boleta;
    }
    
    public boolean puedeGenerar(){
        boolean bool = false;
        
        if(cantidadPuestosVendidos < cantidadPuestosTotal){
            bool = true;
        }
        return bool;
    }
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidadPuestosTotal(int cantidadPuestosTotal) {
        this.cantidadPuestosTotal = cantidadPuestosTotal;
    }

    public void setCantidadPuestosVendidos(int cantidadPuestosVendidos) {
        this.cantidadPuestosVendidos = cantidadPuestosVendidos;
    }
    
    public void setMercadoSecundario(MercadoSecundario mercado){
        this.mercadoSecundario = mercado;
    }
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public int getCantidadPuestosTotal() {
        return cantidadPuestosTotal;
    }

    public int getCantidadPuestosVendidos() {
        return cantidadPuestosVendidos;
    }
    
    public MercadoSecundario getMercadoSecundario(){
        return mercadoSecundario;
    }
}

