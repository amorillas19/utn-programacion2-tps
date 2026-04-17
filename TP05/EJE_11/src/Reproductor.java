public class Reproductor {

    public void reproducir (Cancion cancion){ 

        System.out.println("Se esta reproduciendo: " + cancion.getTitulo());
        System.out.println("Artista: " + cancion.getArtista().getNombre());

    }
}
