import java.util.Date;

public class Reserva {
    private Date fecha;
    private int hora;
    private ClienteMesa clienteMesa;
    private Mesa mesa;

    //Agregacion implica que exista en su constructor
    public Reserva(Date fecha, int hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public ClienteMesa getCliente() {
        return clienteMesa;
    }

    public void setCliente(ClienteMesa cliente) {
        this.clienteMesa = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva [fecha=" + fecha + ", hora=" + hora + ", cliente=" + clienteMesa + ", mesa=" + mesa + "]";
    }

    

}
