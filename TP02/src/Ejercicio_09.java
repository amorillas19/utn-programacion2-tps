import java.util.Scanner;

public class Ejercicio_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(scan.nextLine());
        System.out.print("Ingrese el peso del paquete en kg" );
        double peso = Double.parseDouble(scan.nextLine());
        System.out.print("Ingrese la zona de envio (Nacional/Internacional");
        String zona = scan.nextLine().strip();


        double costoEnvioMain = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envio es: " + costoEnvioMain);
        double precioMain = calcularTotalCompra(precioProducto, costoEnvioMain);
        System.out.println("El total a pagar es: " + precioMain);
    } 

    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio=0.0;
        
        if (zona.equalsIgnoreCase("nacional")) {
            costoEnvio=peso*5;
        }else if (zona.equalsIgnoreCase("internacional")){
            costoEnvio=peso*10;
        }
        return costoEnvio;
    }

    public static double calcularTotalCompra (double precioProducto, double costoEnvio){
        double precioFinal=precioProducto+costoEnvio;
        return precioFinal;
    }
}
