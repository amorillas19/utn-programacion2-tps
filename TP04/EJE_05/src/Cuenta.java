public class Cuenta {
    private final int numero;
    private String titular;
    private double saldo;
    private static int ultimoNumero = 100;
    private static int totalCuentas = 0;

    Cuenta(String titular, double saldoInicial){
        this.numero = ++ultimoNumero;
        this.titular= titular;
        this.saldo = saldoInicial;
        totalCuentas++;
    }

    Cuenta(String titular){
        this(titular, 0);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo<0) {
            System.out.println("El saldo no puede ser menor a 0");
            return;
        }
        this.saldo = saldo;
    }

    public static int getUltimoNumero() {
        return ultimoNumero;
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }

    public double consultarSaldo (){
        return getSaldo();
    }

    public double consultarSaldo (double cotizacionDolar){
        return getSaldo()/cotizacionDolar;
    }

    public void depositar(double dineroDepositar){
        if (dineroDepositar<0) {
            System.out.println("No puede depositar negativos");
            return;
        }
        setSaldo(getSaldo()+dineroDepositar);
    }

    public void extraer(double dineroExtraer){
        if (dineroExtraer<0) {
            System.out.println("No puede extraer negativos");
            return;            
        }
        setSaldo(getSaldo()-dineroExtraer);
    }

    public static void mostrarTotalCuentas(){
        System.out.println(Cuenta.totalCuentas);
    }

    public String toString(){
        return "Cuenta ID: " + getNumero() + "\n" +
                "Titular: " + getTitular() + "\n" +
                "Saldo: $" + String.format("%.2f", getSaldo()) + " pesos. \n";
    }
}
