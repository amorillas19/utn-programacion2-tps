public class Cliente {
    private String nombre;
    private int DNI;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", DNI=" + DNI + ", tarjetaDeCredito=" + tarjetaDeCredito.getNumero() + "]";
    }

    
}
