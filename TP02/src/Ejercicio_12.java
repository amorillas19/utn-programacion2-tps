public class Ejercicio_12 {
    public static void main(String[] args) {
        Double [] listaPrecios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales: ");
        for (Double precio : listaPrecios) {
            System.out.println("Precio: $" + precio);
        }

        listaPrecios[1]=69.42;

        System.out.println("Precios modificados: ");
        for (Double precio : listaPrecios) {
            System.out.println("Precio: $" + precio);
        }}

    }

