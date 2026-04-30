public class App {
    public static void main(String[] args) throws Exception {
        /*Curso c1 = new Curso("Quimica", 30);
        Curso c2 = new Curso("Fisica", 50, 200);
        Curso c3 = new Curso("Matematica", 5);
        Curso invalido1 = new Curso(null, 0);
        Curso invalido2 = new Curso("Lengua", 0);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.actualizarPrecio(300);
        System.out.println(c1);
        c2.actualizarPrecio(-50.0);
        System.out.println(c2);
        c2.actualizarPrecio(50.0);


        System.out.println("***********");
        System.out.println("***********");
        Curso.mostrarTotalCursos();*/

        Producto p1 = new Producto("Jabon", 10);
        Producto p2 = new Producto("Cepillo", 90, 10.99);
        Producto p3 = new Producto(null, 90);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("**************");
        System.out.println("**************");
        p1.aplicarDescuento(50.0);
        p2.aplicarDescuento(5);

        System.out.println(p1);
        System.out.println(p2);

        Producto.obtenerInventarioTotal();

    }
}
