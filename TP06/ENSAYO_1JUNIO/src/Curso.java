import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String nombre;
    private int duracionHoras;
    private NivelCurso nivel;
    private Academia academia;
    private List<Modulo> modulos;
    private List<Inscripcion> inscripciones;

    public Curso(){
    }

    public Curso(int id, String nombre, int duracionHoras, NivelCurso nivel) {
        this.id = id;
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.nivel = nivel;
        this.modulos = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public NivelCurso getNivel() {
        return nivel;
    }

    public void setNivel(NivelCurso nivel) {
        this.nivel = nivel;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void agregarModulos (int idModulo, String nombreModulo, String contenidoModulo){
        Modulo moduloAgregar = new Modulo(idModulo, nombreModulo, contenidoModulo);
        if (moduloAgregar != null){
            modulos.add(moduloAgregar);
        }
    }

    public void listarModulos(){
        System.out.println("Los modulos que contiene son: ");
        for (Modulo modulo : modulos) {
            System.out.println(modulo);
        }
    }

    public void agregarInscripcion (Inscripcion inscripcion){
        try {
            if (inscripcion != null){
            inscripciones.add(inscripcion);
        }else{
            throw new Exception("lalalala"); 
        }
        } catch (Exception e) {
            System.out.println("lelele");
        }
        
    }

    public void listarInscripciones() {
        if (!inscripciones.isEmpty()) {
            System.out.println("Las inscripciones que contiene son: ");
            for (Inscripcion inscripcion : inscripciones) {
                System.out.println(inscripcion);
            }
        } else {
            System.out.println("No hay inscrpciones.");
        }
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombre=" + nombre + ", duracionHoras=" + duracionHoras + ", nivel=" + nivel
                + ", academia=" + academia + ", modulos=" + modulos + ", inscripciones=" + inscripciones + "]";
    }

    
}
