public class App {
    public static void main(String[] args) throws Exception {
        try {
            Categoria c1 = new Categoria("Lacteos", "leches");
            Categoria c2 = new Categoria ("Panaderia", "Panes");
            Producto p1 = new Producto("Leche", 100, "descremada", 1000, "foto");
            Producto p2 = new Producto("Manteca", 11, "serenisima", 0, "zana");
            Producto p3 = new Producto("Facturas", 599, "Pastelera", 99, "foto");
            Producto p4 = new Producto("Pan Rallado", 50, "Pan duro", 2, "pan");

            c1.agregarProducto(p1);
            c1.agregarProducto(p2);
            c2.agregarProducto(p3);
            c2.agregarProducto(p4);

            Pedido peya1 = new Pedido(FormaPago.EFECTIVO);
            System.out.println(peya1);
            peya1.addDetallePedido(2, p4);
            peya1.addDetallePedido(5, p1);
            System.out.println(peya1);
            

            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
