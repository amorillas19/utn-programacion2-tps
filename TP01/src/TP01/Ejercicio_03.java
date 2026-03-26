import java.util.Scanner;

public class Ejercicio_03 {

    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Nombre?");
        String nombre = scanner.nextLine();
        System.out.println("Edad?");
        Integer edad = Integer.parseInt(scanner.nextLine());

        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es:" + edad);

    }
}
