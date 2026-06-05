import java.util.ArrayList;
import java.util.List;

public class Academia {
    private int id;
    private String nombre;
    private String direccion;
    private List<Curso> cursos;
    private List<Instructor> instructores;

    public Academia (){

    }

    public Academia(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cursos = new ArrayList<>();
        this.instructores = new ArrayList<>();;
    }

    public void agregarCurso (Curso curso){
        if (curso != null){
            cursos.add(curso);
        }
    }

    public Curso buscarCursoPorNombre (String nombreCurso){
        for (Curso curso : cursos) {
            if (curso.getNombre().equalsIgnoreCase(nombreCurso)){
                return curso;
            }
        }
        return null;
    }

    public void agregarInstructor (Instructor instructor){
        if (instructor != null){
            instructores.add(instructor);
        }
    }


}
