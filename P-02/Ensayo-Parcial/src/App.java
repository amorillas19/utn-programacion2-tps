public class App {
    public static void main(String[] args) throws Exception {
        Producto p1 = new Producto(1, false, "Pepino", 99.99, "para comer", 90, "foto pepino", true);
        DetallePedido dp1 = new DetallePedido(2, false, 20, 599.99);
        dp1.setProducto(p1);
        System.out.println(dp1);
    }
}
