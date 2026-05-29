public class Gato extends Animal{
    private String raza;
    private boolean sabeMaullar;
    
    public Gato(String nombre, int edad, String raza, boolean sabeMaullar) {
        super(nombre, edad);
        this.raza = raza;
        this.sabeMaullar = sabeMaullar;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isSabeMaullar() {
        return sabeMaullar;
    }

    public void setSabeMaullar(boolean sabeMaullar) {
        this.sabeMaullar = sabeMaullar;
    }

    @Override
    public String toString() {
        return "Gato [raza=" + raza + ", sabeMaullar=" + sabeMaullar + "]";
    }
    
}
