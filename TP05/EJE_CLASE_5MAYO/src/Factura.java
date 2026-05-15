public class Factura {
    private String numero;
    private double total;
    
    public Factura(String numero, double total) {
        this.numero = numero;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura [numero=" + numero + ", total=" + total + "]";
    }

    
}
