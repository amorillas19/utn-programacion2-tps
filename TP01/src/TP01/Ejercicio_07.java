import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); 
        System.out.println("Hola, " + nombre);
        scanner.close();

        /*Se cambia la funcion nextInt, que corresponde para asignar 
        un valor de tipo int a una variable designada para almacenar un 
        dato de tipo String, por nextLine() que permite asignar un valor
        de tipo String concordante*/
    }
}