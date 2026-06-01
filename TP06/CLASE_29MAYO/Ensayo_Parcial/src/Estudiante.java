import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{

    private List<Inscripcion> inscripciones = new ArrayList<>();

    public Estudiante(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    public void agregarInscripcion(Inscripcion inscripcion){
        inscripcion.setEstudiante(this);
        inscripciones.add(inscripcion);
    }

    public void mostrarInscripciones(){
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println(inscripcion);
        }
    }

    
}
