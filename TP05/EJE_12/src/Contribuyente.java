public class Contribuyente {
    private String nombre;
    private int CUIL;

    
    public Contribuyente(String nombre, int CUIL) {
        this.nombre = nombre;
        this.CUIL = CUIL;
    }


    @Override
    public String toString() {
        return "[nombre=" + nombre + ", CUIL=" + CUIL + "]";
    }

    
}
