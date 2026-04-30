public class Curso {
    private final int id;
    private String nombre;
    private int duracionHoras;
    private double precio;
    private static int totalCursos = 0;


    //Si ponemos this.id al final, evitas que el contador suba aun cuando hay errores
    public Curso (String nombre, int duracionHoras, double precio){
        setNombre(nombre);
        setDuracionHoras(duracionHoras);
        setPrecio(precio);
        this.id=++totalCursos;
    }

    public Curso (String nombre, int duracionHoras){
        setNombre(nombre);
        setDuracionHoras(duracionHoras);
        setPrecio(100.0);
        this.id=++totalCursos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre ingresado es invalido");
        }
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    
    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras<1) {
            throw new IllegalArgumentException("Duracion debe ser mayor a 0");
        }
        
        this.duracionHoras = duracionHoras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio<0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0"); 
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

    public void actualizarPrecio(double actualizarPorcentaje){
        if (actualizarPorcentaje > 0) {
            double auxPorcentaje = (actualizarPorcentaje/100) + 1;
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
