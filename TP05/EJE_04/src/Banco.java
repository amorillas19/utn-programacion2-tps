public class Banco {
    private String nombre;
    private int CUIT;

    public Banco(String nombre, int CUIT) {
        this.nombre = nombre;
        this.CUIT = CUIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int cUIT) {
        CUIT = cUIT;
    }

    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", CUIT=" + CUIT + "]";
    }

    
}
