public class Perro extends Animal{
    private String raza;
    private boolean sabeBuscarPelota;
    
    public Perro(String nombre, int edad, String raza, boolean sabeBuscarPelota) {
        super(nombre);
        this.raza = raza;
        this.sabeBuscarPelota = sabeBuscarPelota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isSabeBuscarPelota() {
        return sabeBuscarPelota;
    }

    public void setSabeBuscarPelota(boolean sabeBuscarPelota) {
        this.sabeBuscarPelota = sabeBuscarPelota;
    }

    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", sabeBuscarPelota=" + sabeBuscarPelota + "] ACA EMPIEZA A IMPRIMIR EL PADRE" + super.toString();
    }

    
}
