
/**
 * Write a description of class Localidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Localidad {
    private String nombre;
    private int cantidadPuestosTotal;
    private int cantidadPuestosVendidos;

    // Constructor
    public Localidad(String nombre, int cantidadPuestosTotal, int cantidadPuestosVendidos) {
        this.nombre = nombre;
        this.cantidadPuestosTotal = cantidadPuestosTotal;
        this.cantidadPuestosVendidos = cantidadPuestosVendidos;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getCantidadPuestosTotal() {
        return cantidadPuestosTotal;
    }

    public int getCantidadPuestosVendidos() {
        return cantidadPuestosVendidos;
    }
}

