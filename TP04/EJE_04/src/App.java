public class App {
    public static void main(String[] args) throws Exception {
        Producto p1 = new Producto("Jabon");
        Producto p2 = new Producto("Pasta de dientes", 200.00);

        p1.aplicarDescuento(10);
        System.out.println(p1);
        System.out.println("-------------");
        System.out.println("-------------");
        p2.aplicarDescuento(60, 100.00);
        p2.aplicarDescuento(60, 20.45);
        System.out.println("-------------");
        System.out.println("-------------");
        Producto p3 = new Producto("Shampoo", -599.99);
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println(p1);
        System.out.println("*********");
        System.out.println(p2);
        System.out.println("*********");
        Producto.cambiarIVA(10.5);
        System.out.println("*********");
        System.out.println(p1);
        System.out.println(p2);


    }
}
