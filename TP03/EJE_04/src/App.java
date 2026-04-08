import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in); 
        
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        g1.setIdGallina(0);
        g1.setEdad(-20);
        g1.setEdad(5);
        g1.setHuevosPuestos(-2);
        g1.setHuevosPuestos(2);
        g1.mostrarEstado();
        System.out.println("------------");
        System.out.println("------------");
        g2.setIdGallina(1);
        g2.setEdad(6);
        g2.setHuevosPuestos(8);
        g2.mostrarEstado();
        System.out.println("------------");
        System.out.println("------------");
        g1.ponerHuevo(2);
        g2.ponerHuevo(3);
        System.out.println("------------");
        System.out.println("------------");
        g1.mostrarEstado();
        g2.mostrarEstado();

        
    }
}
