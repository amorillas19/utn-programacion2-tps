public class App {
    public static void main(String[] args) throws Exception {
        Producto pro1 = new Producto("Jabon", 499.99);
        System.out.println(pro1);
        Cliente cli1 = new Cliente("Juan Carlos");
        System.out.println(cli1);
        Pedido p1 = new Pedido(pro1, "123456-78", 499.99);
        cli1.setPedido(p1);
        ServicioPago sp = new ServicioPago();
        sp.procesar(p1);
    }   
}
