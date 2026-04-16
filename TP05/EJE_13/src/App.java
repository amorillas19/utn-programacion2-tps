public class App {
    public static void main(String[] args) throws Exception {
        Usuario u1 = new Usuario("Juan Carlos", "jc@gmail.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("hamburguesa", u1);

    }
}
