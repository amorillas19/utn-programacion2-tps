import java.util.Scanner;
public class Ejercicio_06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Num1: ");
        Integer num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Num2: ");
        Integer num2 = Integer.parseInt(scan.nextLine());
        

        System.out.println("Division usando integers");
        System.out.println("Resultado: " + (num1/num2));

        Double resultadoDouble = num1.doubleValue() / num2.doubleValue();

        System.out.println("Division usando doubles");
        System.out.println("Resultado: " + resultadoDouble);
        scan.close();

    }
}
