import java.time.LocalDateTime;

public class DetallePedido extends Base{
    private int cantidad;
    private double subtotal;
    private Producto producto;
    
    public DetallePedido() {
    }

    

    public DetallePedido(int id, boolean eliminado, int cantidad, double subtotal) {
        super(id, eliminado, LocalDateTime.now());
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return super.toString() + "DetallePedido [cantidad=" + cantidad + ", subtotal=" + subtotal + ", producto=" + producto + "]";
    }

    
}
