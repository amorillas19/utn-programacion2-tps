import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in); 
        
        Mascota m1 = new Mascota();

        m1.setEdad(-90);
        System.out.println("---------------");
        m1.setNombre("Perrito");
        m1.setEspecie("Callejero");
        m1.setEdad(5);
        m1.mostrarInfo();
        System.out.println("---------------");
        m1.cumplirAños();
        m1.cumplirAños();
        m1.cumplirAños();
        System.out.println("(---------------");
        m1.mostrarInfo();

    }
}
