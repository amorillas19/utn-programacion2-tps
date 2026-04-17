public class App {
    public static void main(String[] args) throws Exception {
        Artista a1 = new Artista("Linkin park", "rock");
        Cancion c1 = new Cancion("In the end");
        c1.setArtista(a1);

        Reproductor repro = new Reproductor();
        repro.reproducir(c1);
    }
}
 