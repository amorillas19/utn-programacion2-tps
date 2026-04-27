public class Curso {
    private final int id;
    private String nombre;
    private int duracionHoras;
    private double precio;
    private static int totalCursos = 0;

    public Curso (String nombre, int duracionhoras, double precio){
        this.id=totalCursos++;
        setNombre(nombre);
        setDuracionHoras(duracionhoras);
        setPrecio(precio);
        
    }

    public Curso (String nombre, int duracionhoras){
        this.id=totalCursos++;
        setNombre(nombre);
        setDuracionHoras(duracionhoras);
        setPrecio(100.0);
        
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("EL nombre ingresado no es valido");
            return;
        }
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras<1) {
            System.out.println("Las horas ingresadas son invalidas");
            return;
        }
        
        this.duracionHoras = duracionHoras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio<0) {
            System.out.println("El precio ingresado es invalido");
            return;
        }
        
        this.precio = precio;
    }

    public static int getTotalCursos() {
        return totalCursos;
    }

    public void actualizarPrecio(int actualizarFijo){
        if (actualizarFijo > 0) {
            setPrecio(getPrecio()+actualizarFijo);
        }
    }

    public void actualizarPrecio(double actualizarPorcetaje){
        if (actualizarPorcetaje > 0) {
            double auxPorcentaje = (actualizarPorcetaje/100) + 1;
            setPrecio(getPrecio()*auxPorcentaje);
        }
    }

    public static void mostrarTotalCursos(){
        System.out.println("El total de cursos es de: " + totalCursos + " cursos.");
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombre=" + nombre + ", duracionHoras=" + duracionHoras + ", precio=" + precio
                + "]";
    }

    
    
}
