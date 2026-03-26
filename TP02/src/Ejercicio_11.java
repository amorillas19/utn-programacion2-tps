import java.util.Scanner;

public class Ejercicio_11 {

    static double descuentoEspecial = 0.1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(scan.nextLine());
        calcularDescuentoEspecial(precio);

    }

    public static void calcularDescuentoEspecial(double precio){
        System.out.println("El descuento especial aplicado es: " + (precio - (precio*descuentoEspecial)));
        System.out.println("El precio final con descuento es: " + (precio*descuentoEspecial));
    }
}
