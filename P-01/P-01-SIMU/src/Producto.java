public class Producto {
    private final int codigoProducto;
    private String nombre;
    private int cantidadStock;
    private double precioUnitario;
    private static int totalProductos = 0;

    public Producto(String nombre, int cantidadStock, double precioUnitario){
        this.codigoProducto = ++totalProductos;
        setNombre(nombre);
        setCantidadStock(cantidadStock);
        this.precioUnitario = precioUnitario;
    }

    public Producto (String nombre, int cantidadStock){
        this.codigoProducto = ++ totalProductos;
        setNombre(nombre);
        setCantidadStock(cantidadStock);
        this.precioUnitario = 50.0;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es invalido");
        }
        this.nombre = nombre;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock < 0) {
            throw new IllegalArgumentException("La cantidad es invalida");
        }
        this.cantidadStock=cantidadStock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) {
           this.precioUnitario = precioUnitario; 
        }else{
            throw new IllegalArgumentException("El precio es invalido");
        }
    }

    public void aplicarDescuento (double porcentajeDescuento){
        if (porcentajeDescuento>0) {
            double auxDescuento = 1- (porcentajeDescuento / 100);
            setPrecioUnitario(getPrecioUnitario() * auxDescuento);
            
        }else{
            System.out.println("El numero no puede ser negativo");
        }

    }

    public void aplicarDescuento (int precioDescuento) {
        if (precioDescuento > 0) {
            setPrecioUnitario(getPrecioUnitario() - (double)precioDescuento);
        } else {
            System.out.println("El numero no puede ser negativo");
        }
    }

    public static void obtenerInventarioTotal(){
        System.out.println("El total de productos es de: " + totalProductos + " unidades"); 
    }

    @Override
    public String toString() {
        return "Producto [codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", cantidadStock=" + cantidadStock
                + ", precioUnitario=" + precioUnitario + "]";
    }
    
    
}
