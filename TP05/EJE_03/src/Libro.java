public class Libro {
    private String titulo;
    private int ISBN;
    private Autor autor;
    private Editorial editorial;

    //SI HAY AGREGACION DEBE PASARSE EN EL CONSTRUCTOR
    public Libro(String titulo, int ISBN, Editorial editorial) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if (autor != null ) {
            this.autor = autor;
        }
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        if (editorial != null) {
            this.editorial = editorial;
        }
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", ISBN=" + ISBN + ", autor=" + autor + ", editorial=" + editorial + "]";
    }

    
}
