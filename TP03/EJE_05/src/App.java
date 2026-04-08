import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in); 
        
        NaveEspacial n1 = new NaveEspacial("Apolo", 50);

        n1.avanzar(26);
        n1.recargarCombustible(200);
        n1.recargarCombustible(40);
        n1.avanzar(26);
        n1.mostrarEstado();
    }
}
