import java.util.ArrayList;

public class Veterinaria {
    private String nombre;
    private String domicilio;
    private ArrayList<Animal> animales;

    public Veterinaria(String nombre, String domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.animales = new ArrayList<Animal>();
    }

    public void agregarAnimal(Animal animalAgregar) {
        animales.add(animalAgregar);
        animalAgregar.setVeterinaria(this);
    }

    public void quitarAnimal(Animal animalQuitar) {
        animales.remove(animalQuitar);
        animalQuitar.setVeterinaria(null);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    @Override
    public String toString() {
        return "Veterinaria [nombre=" + nombre + ", domicilio=" + domicilio + ", Lista de animales=" + animales + "]";
    }

}
