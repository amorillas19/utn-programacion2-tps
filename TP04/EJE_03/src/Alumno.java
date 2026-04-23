public class Alumno {
    private String nombre;
    private double promedio;
    private static double notaAprobacion = 6;

    public Alumno (String nombre, double promedio){
        this.nombre = nombre;
        setPromedio(promedio);
    }

    public Alumno (String nombre){
        this(nombre, 0.0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }else{
            System.out.println("Nombre invalido");
            return;
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 10) {
            System.out.println("El promedio debe ser mayor a 0 y menor a 10");
            return;
        }
        this.promedio=promedio;
    }

    public static double getNotaAprobacion() {
        return notaAprobacion;
    }

    public void actualizarPromedio(double nuevoPromedio){
        setPromedio(nuevoPromedio);
    }

    public void actualizarPromedio (double [] notas){
        double promedioAux = 0.0;
        int contador = 0;
        for (double d : notas) {
            promedioAux+=d;
            contador++;
        }
        promedioAux= promedioAux/contador;
        setPromedio(promedioAux);
    }

    public boolean aprobo(){
        if (this.promedio>=notaAprobacion) {
            System.out.println("El alumno aprobo");
            return true;
        }else{
            System.out.println("El alumno desaprobo");
            return false;
        }
    }

    public static void cambiarNotaAProbacion (double nueva){
        Alumno.notaAprobacion=nueva;
    }

    public String toString(){
        return "Nombre: " + getNombre() + "\n" +
                "Promedio: " + getPromedio() + "\n" +
                "Aprobacion general: " + this.aprobo();
    }


}
