import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in); 
        
        Libro l1 = new Libro ();
        
        l1.setTitulo("El hobbit");
        l1.setAutor("Tolkien");
        l1.setAñoPublicacion(1937);
        l1.mostrarInfo();
        System.out.println("-----------");
        System.out.println("-----------");
        l1.setAñoPublicacion(2028);
        System.out.println("-----------");
        System.out.println("-----------");
        l1.setAñoPublicacion(1938);
        l1.mostrarInfo();

    }
}
