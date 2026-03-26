import java.util.Scanner;

public class Ejercicio_04 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Num1: ");
        Double num1 = Double.parseDouble(scan.nextLine()); 
        System.out.println("Num2: ");
        Double num2 = Double.parseDouble(scan.nextLine());

        while (true) {
            System.out.println("Menu");
            System.out.println(" 1- Suma \n 2- Resta \n 3- Multiplicacion \n 4- Division \n 5- Mostrar todas las operaciones: ");
            System.out.print("Elija una opcion: ");
            String opcion = scan.nextLine();
            switch (opcion) {
                case "1":
                    Double resultadoSuma = num1+num2;
                    System.out.println("Suma: " + resultadoSuma);
                    break;
                case "2":
                    Double resultadoResta = num1-num2;
                    System.out.println("Resta: " + resultadoResta);
                    break;
                case "3":
                    Double resultadoMultiplicacion = num1*num2;
                    System.out.println("Multiplicacion: " + resultadoMultiplicacion);    
                    break;
                case "4":
                    Double resultadoDivision = num1/num2;
                    System.out.println("Division: " + resultadoDivision);    
                    break;
                case "5":
                    System.out.println("Suma: " + (num1+num2));
                    System.out.println("Resta: " + (num1-num2));
                    System.out.println("Multiplicacion: " + (num1*num2));
                    System.out.println("Division: " + (num1/num2));    
                    break;
                
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            scan.close();
        }
    }
}
