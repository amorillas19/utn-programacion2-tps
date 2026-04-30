public class TarjetaDeCredito {
    private int numero;
    private int fechaVencimiento;
    private Banco banco;
    private ClienteTarjeta clienteTarjeta;

    public TarjetaDeCredito(int numero, int fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public ClienteTarjeta getCliente() {
        return clienteTarjeta;
    }
    public void setClienteTarjeta(ClienteTarjeta clienteTarjeta) {
        this.clienteTarjeta = clienteTarjeta;
        if (clienteTarjeta != null && clienteTarjeta.getTarjetaDeCredito() != this) {
            clienteTarjeta.setTarjetaDeCredito(this);
        }
    }
    @Override
    public String toString() {
        return "TarjetaDeCredito [numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", banco=" + banco
                + ", cliente=" + clienteTarjeta.getNombre() + "]";
    }

    
}
