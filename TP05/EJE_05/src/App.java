public class App {
    public static void main(String[] args) throws Exception {
        Computadora c1 = new Computadora("Dell", 123);
        PlacaMadre p1 = new PlacaMadre("ASUSLINDA", "B999");
        Propietario pro1 = new Propietario("Juan Carlos", 31000123);

        c1.setPropietario(pro1);
        System.out.println(c1);
    }
}
