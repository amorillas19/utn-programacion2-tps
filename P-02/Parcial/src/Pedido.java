import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends Base implements Calculable {
    private LocalDate fecha;
    private Estado estado;
    private double total;
    private FormaPago formaPago;
    private List<DetallePedido> listaDetallesPedidos;

    public Pedido() {
    }

    public Pedido(FormaPago formaPago) {
        this.fecha = LocalDate.now();
        this.estado = Estado.INVALIDO;
        this.total = 0;
        this.formaPago = formaPago;
        this.listaDetallesPedidos = new ArrayList<>();
    }

    public void addDetallePedido(int cantidadPedido, Producto productoPedido) throws Exception{
        DetallePedido DPedido = new DetallePedido(cantidadPedido, productoPedido);
        listaDetallesPedidos.add(DPedido);
        this.estado = Estado.PENDIENTE;
        this.total += DPedido.getSubtotal();
    }


    public void calcularTotal(){
        
        for (DetallePedido detallePedido : listaDetallesPedidos) {
            this.total+=detallePedido.getSubtotal();
        }
    }

    @Override
    public String toString() {
        return "Pedido [fecha=" + fecha + ", estado=" + estado + ", total=" + total + ", formaPago=" + formaPago
                + ", listaDetallesPedidos=" + listaDetallesPedidos + "]";
    }

    
}
