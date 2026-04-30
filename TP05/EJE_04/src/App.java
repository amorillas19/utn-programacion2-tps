public class App {
    public static void main(String[] args) throws Exception {
        Banco b1 = new Banco("BBVA", 301234578);
        ClienteTarjeta c1 = new ClienteTarjeta("Cristian", 99123456);
        TarjetaDeCredito tc1 = new TarjetaDeCredito(1234, 0127, b1);

        tc1.setBanco(b1);
        System.out.println(b1);
        System.out.println("*************");
        System.out.println("*************");
        tc1.setClienteTarjeta(c1);
        System.out.println(c1);
        System.out.println("*************");
        System.out.println("*************");
        System.out.println(tc1);
    }
}
