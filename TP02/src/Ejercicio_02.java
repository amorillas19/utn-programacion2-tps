import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        Integer primerNumero = Integer.parseInt(scan.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        Integer segundoNumero = Integer.parseInt(scan.nextLine());
        System.out.print("Ingrese el tercer numero: ");
        Integer tercerNumero = Integer.parseInt(scan.nextLine());

        if ((primerNumero > segundoNumero) && (primerNumero > tercerNumero)){
            System.out.println("El mayor es: " + primerNumero );
        }else if ((segundoNumero > tercerNumero) && (segundoNumero > primerNumero)){
            System.out.println("El mayor es: " + segundoNumero);
        }else{
            System.out.println("El mayor es: " + tercerNumero);
        }
        
    }
}
