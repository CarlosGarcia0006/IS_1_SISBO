
/**
 * La clase Localidad pertenece a algún evento deportivo, esta se encarga de almacenar su propio precio, cantidad de asientos totales
 * y cantidad de asientos vendidos, además, por medio de esta clase se generan las boletas. Cada Localidad tiene su propio mercado secundario.
 * 
 * @author (Carlos, Juan) 
 * @version (01/05/2024)
 */
public class Localidad {
    private String nombre;
    private int precio;
    private int cantidadPuestosTotal;
    private int cantidadPuestosVendidos;
    private MercadoSecundario mercadoSecundario;
    private EventoDeportivo evento;
    /**
     * Constructor de la clase Localidad.
     * 
     * @param nombre    el nombre de la localidad.
     * @param precio    el precio definido para esta localidad.
     * @param cantidadPuestosTotal      La cantidad de puestos totales que se podrán vender de esta localidad.
     * @param evento    el evento deportivo al que estará relacionado.
     */
    public Localidad(String nombre, int precio, int cantidadPuestosTotal, EventoDeportivo evento) throws IllegalArgumentException {
        if (precio > 0 && cantidadPuestosTotal > 0) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidadPuestosTotal = cantidadPuestosTotal;
            this.cantidadPuestosVendidos = 0;
            this.evento = evento;
            mercadoSecundario = new MercadoSecundario();
        } else {
            throw new IllegalArgumentException("Los datos para la creación de la localidad son incorrectos");
        }
    }
    
    /**
     * El método generarBoleta se encarga principalmente de crear un objeto boleta y devolverlo,
     * la única clase capaz de crear boleta es localidad.
     * 
     * @return La boleta generada.
     */
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
    
    /**
     * El método puedeGenerar se encarga de verificar que la cantidad de puestos vendidos no haya excedido la cantidad de puestos totales.
     * Si el número de puestos vendidos es menor al número total devuelve true, en cualquier otro caso devuelve false.
     * 
     * @return la variable bool con true o false dependiendo de si hay menor cantidad de boletas vendidas que totales o si hay mayor o igual número de boletas vendidas que totales respectivamente.
     */

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
    
    public EventoDeportivo getEventoDeportivo(){
        return evento;
    }
}

