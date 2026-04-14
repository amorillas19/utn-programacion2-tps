public class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria (String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria [modelo=" + modelo + ", capacidad=" + capacidad + "]";
    }

    
}
