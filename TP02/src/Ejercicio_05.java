import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer sumaTotal = 0;

        while(true){
        System.out.print("Ingrese un numero (0 para terminar): ");
        Integer numero = Integer.parseInt(scan.nextLine());
        
        if(numero == 0){
            break;
           
        }else if (numero % 2 == 0){
            sumaTotal += numero;
        }

        }
        
        System.out.println("La suma de los numeros pares es: " + sumaTotal );

    }
}
