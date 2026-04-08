public class Empleado {
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    //Se debe fijar manualmente el primer ID
    public Empleado (int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.totalEmpleados = totalEmpleados + 1;
    }

    public Empleado (String nombre, String puesto){
        this(totalEmpleados+1, nombre, puesto, 499.99);
    }
    
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        
        if(getSalario()+salario< 0){
            System.out.println("El valor no puede ser menor a 0");
            return;
        }
        
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public void actualizarSalario(double aumentoPorcentaje){
        if (aumentoPorcentaje>= 0) {
            double multiplicador = (aumentoPorcentaje/100)+1;
            setSalario(getSalario()*multiplicador);
            System.out.println("El salario fue actuaizado por porcentaje");
        }else{
            System.out.println("El aumento no puede ser negativo");
        }

    }

    public void actualizarSalario(int aumentoFijo){
        if (aumentoFijo >= 0) {
            setSalario(getSalario()+aumentoFijo);
            System.out.println("El salario fue actualizado por monto fijo");
        }else{
            System.out.println("El aumento no puede ser negativo");
        }

    }

    public static void mostrarTotalEmpleados(){
        System.out.println("El total de empleados es de: " + getTotalEmpleados() + " empleados"); 
    }

    public String toString(){
        return "Empleado ID:" + getId() + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Puesto: " + getPuesto() + "\n" +
                "Salario: " + getSalario();
    }

}
