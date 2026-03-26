import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(scan.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(scan.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(scan.nextLine());
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantidadVendida, cantidadRecibida));
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
}
