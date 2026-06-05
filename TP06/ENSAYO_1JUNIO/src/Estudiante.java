import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{

    private List<Inscripcion> inscripciones;

    public Estudiante(){}

    public Estudiante(int id, String nombre, String email) {
        super(id, nombre, email);
        this.inscripciones = new ArrayList<>();
    }

    public void agregarInscripcion (Inscripcion inscripcion){
        if (inscripcion != null) {
            inscripciones.add(inscripcion);
        }
    }

    public void listarInscripcion(){
        System.out.println("Inscripciones del alumno: ");
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println(inscripcion);
        }
    }
}
