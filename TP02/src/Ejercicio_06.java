import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer contadorPositivos = 0;
        Integer contadorNegativos = 0;
        Integer contadorCeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero: ");
            Integer numeroAgregar = Integer.parseInt(scan.nextLine());
            if (numeroAgregar == 0){
                contadorCeros++;
            }else if (numeroAgregar > 0){
                contadorPositivos++;
            }else{
                contadorNegativos++;
            }
        }

        System.out.println("Resultados\n Positivos: " + contadorPositivos);
        System.out.println("Negativos: " + contadorNegativos + "\n Ceros: " + contadorCeros);
    }
}
