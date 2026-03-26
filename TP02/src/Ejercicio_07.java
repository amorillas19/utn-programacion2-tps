import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer nota;

        System.out.print("Ingrese la nota: ");
        do {
            System.out.print("Ingrese la nota: ");
            nota = Integer.parseInt(scan.nextLine());
            if ((nota>11) || (nota<0)) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10");
            }
        } while ((nota>11) || (nota<0));

        System.out.println("Nota guardada correctamente.");
        
    }
}
