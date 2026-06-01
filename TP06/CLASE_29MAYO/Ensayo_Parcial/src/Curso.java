import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String nombre;
    private int duracionHoras;
    private NivelCurso nivel;
    private Academia academia;
    private List<Modulo> modulos = new ArrayList<>();
    private List<Inscripcion> inscripciones = new ArrayList<>();

    public Curso(int id, String nombre, int duracionHoras, NivelCurso nivel) {
        this.id = id;
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.nivel = nivel;

    }

    public String getNombre() {
        return nombre;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public void crearModulo(int idModulo, String tituloModulo, String contenidoModulo){
        Modulo moduloAgregar = new Modulo(idModulo, tituloModulo, contenidoModulo);
        modulos.add(moduloAgregar);
    }

    public void listarModulos (){
        for (Modulo modulo : modulos) {
            System.out.println(modulo.getTitulo());
        }
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombre=" + nombre + ", duracionHoras=" + duracionHoras + ", nivel=" + nivel
                + ", academia=" + academia + ", modulos=" + modulos + "]";
    }

    
    
}
