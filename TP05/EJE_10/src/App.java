import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria c1 = new CuentaBancaria(1234, 120.99, 00, new Date());
        Titular t1 = new Titular("Gerardo Simeone", 40000111);
        c1.setTitular(t1);
        System.out.println(c1);
    }
}
