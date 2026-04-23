public class Libro {
    private String titulo;
    private String autor;
    private static String editorial = "Independiente";

    Libro(String titulo, String autor){
        setTitulo(titulo);
        setAutor(autor);
    }

    //Si EDITORIAL es constante, no deberia modificarse en cada instancia
    Libro(String titulo, String autor, String editorial){
        this(titulo, autor);
        Libro.editorial=editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("El titulo no puede ser nulo o vacio");
            return;
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty()) {
            System.out.println("El autor no puede ser nulo o vacio");
            return;
        }
        this.autor = autor;
    }

    public static String getEditorial(){
        return Libro.editorial;
    }

    public void actualizarTitulo(String titulo){
        setTitulo(titulo);
    }

    public void actualizarTitulo (String prefijo, String titulo){
        String actualizacion = prefijo + " " + titulo;
        setTitulo(actualizacion);
    }

    public static void cambiarEditorial (String nuevaEditorial) {
        Libro.editorial=nuevaEditorial;
    }

    public String toString(){
        return "Titulo: " + getTitulo() + "\n" +
                "Autor: " + getAutor() + "\n" +
                "Editorial: " + getEditorial();
    }



    
}
