public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    Libro () {}

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            System.out.println("El titulo no puede estar vacio");
            return;
        }
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        if (autor == null || autor.isBlank()) {
            System.out.println("El autor no puede estar vacio");
            return;
        }
        this.autor = autor;
    }
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 2026 || añoPublicacion < 0){
            System.out.println("El año de publicacion debe ser mayor a 0 y no puede ser en el futuro");
        }
        
        this.añoPublicacion = añoPublicacion;
    }

    public void mostrarInfo () {
        System.out.println("Libro: ");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año publicacion: " + getAñoPublicacion());
    }



}
