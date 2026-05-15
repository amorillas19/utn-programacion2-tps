public class Pedido {
    private Factura factura;
    private Cliente cliente;
    private Producto producto;

    //Factura por composicion
    //Pedido por asociacion
    public Pedido(Producto producto, String numeroFactura, Double totalFactura) {
        this.producto = producto;
        this.factura = new Factura(numeroFactura, totalFactura);
    }

    public Factura getFactura() {
        return factura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getPedido() != this) {
            cliente.setPedido(this);
        }
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Pedido [factura=" + factura + ", cliente=" + cliente.getNombre() + ", producto=" + producto + "]";
    }

    
}
