import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int num = validarNumero(scan, 0);
        int [] [] matriz = new int[num][num];

        

        llenarMatriz(random, matriz);
        filaCentral(matriz);
        columnaCentral(matriz);
        System.out.println("**************");
        
        
    }

    public static int validarNumero(Scanner scan, int numeroValidar){
        do {
            System.out.println("Ingrese el numero");
            numeroValidar = Integer.parseInt(scan.nextLine());
            if (numeroValidar>=3 && !(numeroValidar%2==0)) {
                break;
            }else{
                System.out.println("Numero invalido, ingreselo nuevamente");
            }
        } while (true);
        return numeroValidar;
    }

    public static void llenarMatriz(Random random, int[][] matriz){

        int filaCentral = matriz.length/2;
        int [] aux = new int [matriz.length];

        for (int i = 0; i < aux.length; i++) {
            aux[i] = random.nextInt(100)+1;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==filaCentral && j==filaCentral) {
                    matriz[i][j] = random.nextInt(100)+1;
                }else if(i==filaCentral){
                    matriz[i][j] = random.nextInt(100)+1;
                    matriz[j][i] = matriz[i][j];
                }else{
                    if (matriz[i][j] == 0) {
                        matriz[i][j] = random.nextInt(100)+1;
                    }
                }
            }
        }
    }

    public static void filaCentral(int[][] matriz) {
        int filaComun = matriz.length/2;
        ArrayList <Integer> array = new ArrayList<>();
        for (int i = 0; i < matriz.length; i++) {
            array.add(matriz[filaComun][i]);
        }
        int auxTotal = 0;
        for (Integer integer : array) {
            auxTotal=auxTotal+integer;
        }
        double resultado = auxTotal/matriz.length; 
        System.out.println("El promedio de la fila central es: " + (resultado));
    }

        public static void columnaCentral(int[][] matriz) {
        int columnaComun = matriz.length/2;
        ArrayList <Integer> array = new ArrayList<>();
        for (int i = 0; i < matriz.length; i++) {
            array.add(matriz[i][columnaComun]);
        }
        int auxTotal = 0;
        for (Integer integer : array) {
            auxTotal=auxTotal+integer;
        } 

        double resultado = auxTotal/matriz.length; 
        System.out.println("El promedio de la columna central es: " + (resultado));
    }

    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
