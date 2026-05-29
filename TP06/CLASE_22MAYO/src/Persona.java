public class Persona {
    private String nombre;
    private int edad;
    private int DNI;
    private String domicilio;

    public Persona(String nombre, int edad, int DNI, String domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.domicilio = domicilio;
    }

    public void laburar(){
        System.out.println("La persona esta laburando");
    }
}
