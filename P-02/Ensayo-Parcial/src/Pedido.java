import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends Base{
    private LocalDate fecha;
    private Estado estado;
    private double total;
    private FormaPago formaPago;
    private List<DetallePedido> listaDetallesPedidos;


    public Pedido() {
    }

    public Pedido(int id, boolean eliminado, Estado estado, double total,
            FormaPago formaPago) {
        super(id, eliminado, LocalDateTime.now());
        this.fecha = LocalDate.now();
        this.estado = estado;
        this.total = total;
        this.formaPago = formaPago;
        this.listaDetallesPedidos = new ArrayList<>();
    }

    public void addDetallePedido(int cantidadPedido, double subtotalPedido, Producto productoPedido) {
        DetallePedido detallePedido = new DetallePedido(01, false, cantidadPedido, subtotalPedido);
        detallePedido.setProducto(productoPedido);
        
    }

    

}
