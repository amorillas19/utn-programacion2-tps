public class App {
    public static void main(String[] args) throws Exception {
        Banco b1 = new Banco("BBVA", 301234578);
        Cliente c1 = new Cliente("Cristian", 99123456);
        TarjetaDeCredito tc1 = new TarjetaDeCredito(1234, 0127);

        tc1.setBanco(b1);
        System.out.println(b1);
        System.out.println("*************");
        System.out.println("*************");
        tc1.setCliente(c1);
        System.out.println(c1);
        System.out.println("*************");
        System.out.println("*************");
        System.out.println(tc1);
    }
}
