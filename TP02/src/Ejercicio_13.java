public class Ejercicio_13 {
    public static void main(String[] args) {
        Double [] listaPrecios = {199.99, 299.5, 149.75, 399.0, 89.99};
        int indice = (listaPrecios.length-1);
        System.out.println("Precios originales: ");
        recursividad(listaPrecios, indice);

        listaPrecios[1]=69.42;

        System.out.println("Precios modificados: ");
        recursividad(listaPrecios, indice);
    }

    public static void recursividad(Double[] listaPrecios, int indice){
        if (indice == 0){
            System.out.println("Precio: $" + listaPrecios[indice]);
        }else{
            recursividad(listaPrecios, (indice-1));
            System.out.println("Precio: $" + listaPrecios[indice]);
        }
    }

}
