import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Precio base: ");
        Double precioBase = Double.parseDouble(scan.nextLine());
        System.out.print("Precio base: ");
        Double impuesto = Double.parseDouble(scan.nextLine());
        System.out.print("Precio base: ");
        Double descuento = Double.parseDouble(scan.nextLine());
                
        double resultado = (calcularPrecioFinal(precioBase, impuesto, descuento));
        System.out.println("El precio final del producto es: " + resultado);
    }

    public static double calcularPrecioFinal (double precioBase, double impuesto, double descuento){
        double precioFinal;
        precioFinal= precioBase+ (precioBase*(impuesto/100)) - (precioBase * (descuento/100));
        return precioFinal;
    }
}
