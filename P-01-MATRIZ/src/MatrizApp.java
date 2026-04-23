import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MatrizApp {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int numFinal;

        do {
            System.out.print("Elije un numero: ");
            String num =scan.next();
            if (num.contains(".") || num.contains(",")) {
                System.out.println("Tiene que ser un entero");
            }else if (Integer.parseInt(num)<0) {
                System.out.println("Tiene que ser mayor a 0");
            }else if (Integer.parseInt(num) % 2 != 0) {
                System.out.println("Tiene que ser par");
            }else{
            System.out.println("Numero valido");
            numFinal = Integer.parseInt(num);
            break;}
        } while (true);

        int [] [] matriz = new int[numFinal][numFinal];

        //llenar la matriz 
        for (int i = 0; i < matriz.length; i++) {
            matriz [i] [i] = random.nextInt(100)+1;
        }
        for (int i = 0; i < matriz.length; i++) {
            int auxNum = matriz.length-1;
            matriz [i] [auxNum-i] = random.nextInt(100)+1;
        }

        

        
        System.out.println("EL numero es: " + numFinal);
    }
}
