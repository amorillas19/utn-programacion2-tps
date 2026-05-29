public class Pago {
    private double monto;
    private String TipoPago;

    public Pago(){}
    
    public Pago(double monto, String tipoPago) {
        this.monto = monto;
        TipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "Pago [monto=" + monto + ", TipoPago=" + TipoPago + "]";
    }

    
}
