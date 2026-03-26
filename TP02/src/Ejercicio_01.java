import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el año a analizar: ");
            Integer year = Integer.parseInt(scan.nextLine());

            if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0)) {
                System.out.println("Es bisiesto");
            }else{
                System.out.println("No es bisiesto");
            }
        }
        
        
    }
}
