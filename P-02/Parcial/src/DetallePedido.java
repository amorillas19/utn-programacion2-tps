public class DetallePedido extends Base{
    private int cantidad;
    private double subtotal;
    private Producto producto;

    
    public DetallePedido() {
    }


    public DetallePedido(int cantidad, Producto producto) throws Exception{
        this.producto = producto;
        if (producto.validarVenta(cantidad)) {
            this.cantidad = cantidad;
            this.subtotal = producto.getPrecio()*cantidad;
        }else{
            throw new Exception("Se pide mas cantidad del stock existente");
        }
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

    public Producto getProducto() {
        return producto;
    }


    public void calcularSubtotal(){
        System.out.println("El subtotal es: " + getSubtotal());
    }

    public boolean validar (Producto producto){
        return true;
    }


    @Override
    public String toString() {
        if (producto != null) {
            return "DetallePedido [cantidad=" + cantidad + ", subtotal=" + subtotal + ", producto="
                    + producto.getNombre() + "]";
        }else{
            return "producto vacio";
        }

    }

    

    
}
