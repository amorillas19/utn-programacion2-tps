public class App {
    public static void main(String[] args) throws Exception {
        Proyecto p1 = new Proyecto("Duro de Matar", 120);
        EditorVideo editVideo = new EditorVideo();
        editVideo.exportar("DVD", p1);
    }
}
