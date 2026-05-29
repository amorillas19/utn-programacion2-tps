public class Cliente {
    private String nombre;
    private Pedido pedido;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
        if (pedido != null && pedido.getCliente() != this) {
            pedido.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", pedido=" + pedido + "]";
    }

    
}
