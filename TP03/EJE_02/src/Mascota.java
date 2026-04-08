public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    Mascota () {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            System.out.println("El nombre no puede estar vacio");
            return;
        }
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank()) {
            System.out.println("La especie no puede estar vacia");
            return;
        }
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad no puede ser inferior a 0");
            return;
        }
        this.edad = edad;
    }

    public void mostrarInfo () {
        System.out.println("Perro: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Edad: " + getEdad());
    }

    public void cumplirAños () {
        System.out.println("La mascota tenia " + getEdad() + " años");
        setEdad(getEdad()+1);
        System.out.println("AHORA la mascota tiene " + getEdad() + " años");
    }

    public boolean validarTexto (String entrada) {
        if (entrada == null || entrada.isBlank()) {
            return false;
        }
        return true;
    }
}
