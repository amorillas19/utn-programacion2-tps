import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private Date fecha = new Date();
    private Pago pago;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public Venta() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void addCliente (Cliente cliente){
        listaClientes.add(cliente);
    }

    @Override
    public String toString() {
        return "Venta [fecha=" + fecha + ", pago=" + pago + ", listaClientes=" + listaClientes + "]";
    }

    
}
