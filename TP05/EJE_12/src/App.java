public class App {
    public static void main(String[] args) throws Exception {
        Contribuyente c1 = new Contribuyente("David Zerex", 30123456);
        Impuesto i1 = new Impuesto(999.99);
        i1.setContribuyente(c1);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(i1);
    }
}
