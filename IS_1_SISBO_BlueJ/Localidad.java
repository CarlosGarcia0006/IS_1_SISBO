
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
    private MercadoPrincipal mercadoPrincipal;
    private MercadoSecundario mercadoSecundario;
    // Constructor
    public Localidad(String nombre, int precio, int cantidadPuestosTotal, int cantidadPuestosVendidos) {
        this.nombre = nombre;
        this.cantidadPuestosTotal = cantidadPuestosTotal;
        this.precio = precio;
        this.cantidadPuestosVendidos = cantidadPuestosVendidos;
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
}

