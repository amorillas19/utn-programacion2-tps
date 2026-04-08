public class NaveEspacial {
    private String nombre;
    private int combustible;
    private static final int capacidadMaxima = 100;

    public NaveEspacial () {}

    public NaveEspacial (String nombre, int combustible){
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCombustible() {
        return combustible;
    }
    public void setCombustible(int combustible) {
        
        if (combustible < 0 || combustible > capacidadMaxima) {
            System.out.println("El combustible no puede ser menor a 0 o superar la cantidad maxima");
            return;
        }
        this.combustible = combustible;
    }
    public static int getCapacidadmaxima() {
        return capacidadMaxima;
    }

    public boolean despegar () {
        int auxCombustible = getCombustible()-5;
        if (auxCombustible < 0) {
            System.out.println("El avion no puede despegar por falta de combustible");
            return false;
        }else{
            setCombustible(auxCombustible);
            System.out.println("El avion ha despegado.");
            return true;
        }
    }

    public void avanzar (int distancia) {
        int combustibleNecesario = distancia * 2;
        if (despegar()) {
            if ((getCombustible() - combustibleNecesario) < 0) {
                System.out.println("No hay suficiente combustible para realizar el viaje");
            }else{
                System.out.println("El avion puede completar el viaje.");
                setCombustible(getCombustible()-combustibleNecesario);
            }
        }
    }

    public void recargarCombustible (int cantidad) {
        setCombustible(cantidad + getCombustible());
    }

    public void mostrarEstado() {
        System.out.println("Nombre del avion: " + getNombre());
        System.out.println("Combustible del avion: " + getCombustible() + " unidades");
    }


}
