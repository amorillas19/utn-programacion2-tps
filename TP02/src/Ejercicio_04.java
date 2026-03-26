import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Precio del producto? ");
        Double precio = Double.parseDouble(scan.nextLine());
        System.out.print("Categoria? ");
        String categoria = scan.nextLine().toLowerCase();
        

        switch (categoria) {
            case "a":
                System.out.println("Precio original: " + precio);
                System.out.println("Descuento aplicado: 10% descuento");
                System.out.println("Precio final: " + (precio * 0.9));
                break;

            case "b":
                System.out.println("Precio original: " + precio);
                System.out.println("Descuento aplicado: 15% descuento");
                System.out.println("Precio final: " + (precio * 0.85));
                break;

            case "c":
                System.out.println("Precio original: " + precio);
                System.out.println("Descuento aplicado: 20% descuento");
                System.out.println("Precio final: " + (precio * 0.8));
                break; 

            default:
                break;
        }
    }

}
