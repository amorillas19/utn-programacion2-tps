public class App {
    public static void main(String[] args) throws Exception {
        Libro l1 = new Libro("Revolucion Inglesa", "Carlos Juan");
        Libro l2 = new Libro("Recetas de cocina", "Maru Botana");
        System.out.println(l1);
        System.out.println("--------------");
        System.out.println(l2);
        System.out.println("--------------");
        System.out.println("--------------");
        l1.actualizarTitulo(null);
        l1.actualizarTitulo("El " + "bigote");
        System.out.println("--------------");
        System.out.println(l1);
        System.out.println("--------------");
        Libro.cambiarEditorial("Penguin Random House");
        System.out.println(l1);
        System.out.println("--------------");
        System.out.println(l2);
    }
}
