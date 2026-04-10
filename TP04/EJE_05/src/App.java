public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("El ultimo numero de cuenta es: " + Cuenta.getUltimoNumero());
        Cuenta c1 = new Cuenta("Juan Carlos");
        System.out.println(c1);
        Cuenta c2 = new Cuenta("Ricardo Ruben", 999.9989);
        System.out.println(c2);
        System.out.println("El ultimo numero de cuenta es: " + Cuenta.getUltimoNumero());
        System.out.println("*********");
        System.out.println("*********");
        c2.extraer(2000.59);
        c1.depositar(15000);
        System.out.println(c1.consultarSaldo());
        System.out.println(c1.consultarSaldo(1500));
        System.out.println("*********");
        System.out.println("*********");
        System.out.print("Total de cuentas creadas: ");
        Cuenta.mostrarTotalCuentas();        

    }
}
