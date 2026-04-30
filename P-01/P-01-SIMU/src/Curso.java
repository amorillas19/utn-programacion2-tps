public class Curso {
    private final int id;
    private String nombre;
    private int duracionHoras;
    private double precio;
    private static int totalCursos;


    public Curso(String nombre, int duracionHoras, double precio) {
        this.id=++totalCursos;
        setNombre(nombre);
        setDuracionHoras(duracionHoras);
        setPrecio(precio);;
    }

    public Curso (String nombre, int duracionHoras){
        this(nombre, duracionHoras, 100.00);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio");
            return;
        }else{
            this.nombre = nombre;
        }
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras>0) {
            this.duracionHoras = duracionHoras;
        }else{
            System.out.println("Debe ser mayor a 0");
            return;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }else{
            System.out.println("El precio no puede ser negativo");
            return;
        }
    }

    public void actualizarPrecio (double porcentaje){
        if (porcentaje>0) {
            double auxPorcentaje = (porcentaje/100)+1;
            setPrecio(getPrecio()*auxPorcentaje);
            System.out.println("El precio ha sido actualizado");
        }else{
            System.out.println("El valor recibido debe ser positivo");
        }
    }

    public void actualizarPrecio(int montoFijo) {
        if (montoFijo > 0) {
            setPrecio(getPrecio() + montoFijo);
            System.out.println("El precio ha sido actualizado");
        } else {
            System.out.println("El valor recibido debe ser positivo");
        }
    }

    public static void mostrarTotalCursos(){
        System.out.println("La cantidad total de cursos es: " + Curso.totalCursos);
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombre=" + nombre + ", duracionHoras=" + duracionHoras + ", precio=" + precio
                + "]";
    }

}
